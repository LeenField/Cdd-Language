/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends cddBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    Scope parentScope;
    FunctionSymbol tempFunctionSymbol;

    public void enterFile(cddParser.FileContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    public void exitFile(cddParser.FileContext ctx) {
        // preint global scope
        System.out.println(globals);
    }

    public void enterFunctionDecl(cddParser.FunctionDeclContext ctx) {
        String name = ctx.ID().getText();
        int typeTokenType = ctx.type().start.getType();
        Symbol.Type type = CheckSymbols.getType(typeTokenType);

        // push new scope by making new one that points to enclosing scope
        FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
//        currentScope.define(function); // Define function in current scope
        parentScope = currentScope;
        tempFunctionSymbol = function;
//        saveScope(ctx, function);      // Push: set function's parent to current
        currentScope = function;       // Current scope is now function scope
    }

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    public void exitFunctionDecl(cddParser.FunctionDeclContext ctx) {
        System.out.println(currentScope);
//        currentScope = currentScope.getEnclosingScope(); // pop scope
//        String name = ctx.ID().
        tempFunctionSymbol.setIdParam();
        // define function in globalScope
        FunctionSymbol var = globals.checkFunctionRedefined(tempFunctionSymbol);
        if(var == null){
            globals.define(tempFunctionSymbol);
        }else{
            CheckSymbols.error(ctx.ID().getSymbol(), "function '" + tempFunctionSymbol.IdParam + "' Duplicate Defined");
        }
//        parentScope.define(tempFunctionSymbol);
        saveScope(ctx, tempFunctionSymbol);      // Push: set function's parent to current
        currentScope = parentScope;              // Equal to Pop scope
    }

    public void enterBlock(cddParser.BlockContext ctx) {
        // if in functionDecl set functionScope, else push new local scope
        currentScope = new LocalScope(currentScope);
//        if(ctx.getParent() instanceof cddParser.FunctionDeclContext){
//            currentScope. ;
//        }
        saveScope(ctx, currentScope);
    }

    public void exitBlock(cddParser.BlockContext ctx) {
        // print local scope
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope(); // pop scope
    }

    public void exitFormalParameter(cddParser.FormalParameterContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    public void exitVarDecl(cddParser.VarDeclContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if(var == null){
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
        // var multiDefVar ERROR
        else if(var instanceof VariableSymbol){
            CheckSymbols.error(ctx.ID().getSymbol(), "Variable '"+ name +"' Duplicate Defined");
        }
    }

    void defineVar(cddParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = CheckSymbols.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var); // Define symbol in current scope
    }
}
