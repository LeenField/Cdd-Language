/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class RefPhase extends cddBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope; // resolve symbols starting in this scope
    List<String> currentExperListFieldValues;
    String parameters;

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }

    public void enterFile(cddParser.FileContext ctx) {
        currentScope = globals;
    }

    public void enterFunctionDecl(cddParser.FunctionDeclContext ctx) {
        currentScope = scopes.get(ctx);
    }

    public void exitFunctionDecl(cddParser.FunctionDeclContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterBlock(cddParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
    }

    public void exitBlock(cddParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitVar(cddParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
//        varNoDefined ERROR
        if (var == null) {
            CheckSymbols.error(ctx.ID().getSymbol(), "no such variable: " + name);
        }
//        functionNotAVar ERROR, now is Useless
//        if (var instanceof FunctionSymbol) {
//            CheckSymbols.error(ctx.ID().getSymbol(), name + " is not a variable");
//        }
//        Expr in ExprList
        if(ctx.getParent() instanceof cddParser.ExprListContext){
            currentExperListFieldValues.add( var.getType() );
        }
    }
    // ExprList not support nesting:  f(f())
    @Override
    public void enterExprList(cddParser.ExprListContext ctx) {
       currentExperListFieldValues = new ArrayList<String>();
    }

    @Override
    public void exitExprList(cddParser.ExprListContext ctx) {
//        for( String ExprType : currentExperListFieldValues)
//        {
//            parameters += ExprType;
//        }
        parameters = String.join(", ", currentExperListFieldValues);
    }

    @Override
    public void enterCall(cddParser.CallContext ctx) {
        parameters = new String();
    }

    public void exitCall(cddParser.CallContext ctx) {
        // can only handle f(...) not expr(...)
        String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        // varName can't be uesd as a function
        if (meth instanceof VariableSymbol) {
            CheckSymbols.error(ctx.ID().getSymbol(), funcName + " is not a function");
        }
//        if (meth == null) {
////            CheckSymbols.error(ctx.ID().getSymbol(), "no such function: " + funcName);
//            String Id = ctx.ID().getText();
//        }
        // check matched function
        String IdParam = funcName + "(" + parameters + ")";
        FunctionSymbol var = globals.resolve(IdParam);
        if( var == null )
        {
            CheckSymbols.error(ctx.ID().getSymbol(), "No matched function for '" + IdParam + "'");
        }
    }
}
