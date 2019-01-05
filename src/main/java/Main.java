import antlr4.Emitter;
import antlr4.course_workLexer;
import antlr4.course_workParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String source =
                "integer a1a := 1; while (a1a<10) do {a1a:=a1b+1;}";
        course_workLexer lexer = new course_workLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Emitter emitter = new Emitter();
        course_workParser parser = new course_workParser(tokens, emitter);
        parser.parse();
        emitter.print();
    }
}
