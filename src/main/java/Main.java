import antlr4.Emitter;
import antlr4.course_workLexer;
import antlr4.course_workParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String ... args){
        String source = "number a1a;\n" +
                "number b1b;\n" +
                "b1b <= 25;\n" +
                "a1a <= b1b * b1b;\n" +
                "? a1a > 100 # a1a<=a1a-b1b; : a1a<=a1a+b1b;\n" +
                "repeat a1a<=a1a-1; when a1a <> 125 ";
        course_workLexer lexer = new course_workLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        course_workParser parser = new course_workParser(tokens);
        parser.programm();
        Emitter.print();

    }
}
