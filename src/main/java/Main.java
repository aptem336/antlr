import antlr4.Emitter;
import antlr4.course_workLexer;
import antlr4.course_workParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String source =
                "int a11s; int a22f;\n" +
                "?(a11s>a22f)#a22f:=a22f+1;:a11s:=1;";
        course_workLexer lexer = new course_workLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        course_workParser parser = new course_workParser(tokens);
        System.out.println(source+"\n");
        parser.programm();
        if (parser.getNumberOfSyntaxErrors()==0){
            Emitter.print();
        }
    }
}
