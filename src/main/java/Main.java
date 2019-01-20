import antlr4.Emitter;
import antlr4.course_workLexer;
import antlr4.course_workParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String ... args){
        String source = "";
        course_workLexer lexer = new course_workLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        course_workParser parser = new course_workParser(tokens);
        parser.programm();
        Emitter.print();

    }
}
