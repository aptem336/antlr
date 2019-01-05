import antlr4.course_workLexer;
import antlr4.course_workParser;
import antlr4.course_workWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
        course_workLexer lexer = new course_workLexer(CharStreams.fromString("while 1>0 do a1a:=1;"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        course_workParser parser = new course_workParser(tokens);
        ParseTree tree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new course_workWalker(), tree);
    }
}
