import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.Map;



public class Testcdd {
    public static class cddLoader extends cddBaseListener {
        Map<String, String> Calls = new OrderedHashMap<>();
        // expr : ID '(' exprList? ')'  #Call
        public void exitCall(cddParser.CallContext ctx) {
            final String id = ctx.ID().getText();
            final String exprList = ctx.exprList().getText();
            Calls.put(id, exprList);
        }
    }
    public static void main(final String[] args) throws Exception{
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);

        cddLexer lexer = new cddLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        cddParser parser = new cddParser(tokens);

        ParseTree tree = parser.file();

        final ParseTreeWalker walker = new ParseTreeWalker();
        final cddLoader loader = new cddLoader();
        walker.walk(loader, tree);
        System.out.println(loader.Calls);
    }
}