import java.util.Map;
import java.util.LinkedHashMap;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
public class GlobalScope extends BaseScope {
    Map<String, FunctionSymbol> functionSymbols = new LinkedHashMap<String, FunctionSymbol>();

    public GlobalScope(Scope enclosingScope) { super(enclosingScope); }
    public String getScopeName() { return "globals"; }
    public FunctionSymbol checkFunctionRedefined(FunctionSymbol functionSymbol){
        String functionIdParameters = functionSymbol.IdParam;
        FunctionSymbol f = functionSymbols.get(functionIdParameters);
        return f;
    }
    public void define(FunctionSymbol functionSymbol){
        functionSymbols.put(functionSymbol.IdParam, functionSymbol);
    }

    @Override
    public FunctionSymbol resolve(String name) {
        return functionSymbols.get(name);
    }
    public String toString(){
        return getScopeName()+": " + symbols.keySet().toString() + functionSymbols.keySet().toString();
    }
}
