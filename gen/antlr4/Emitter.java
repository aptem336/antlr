package antlr4;

import java.util.ArrayList;
import java.util.Stack;

public class Emitter {

    private ArrayList<String> variables = new ArrayList<>();
    private StringBuilder builder = new StringBuilder();
    private int label_counter = 0;
    private Stack<String> labels = new Stack<>();

    public void addVariable(String name){
        if (!variables.contains(name)){
            variables.add(name);
        }
    }

    public void addLine(String line){
        builder.append(line+"\n");
    }

    public void addOp(String op){
        switch (op){
            case "+":
                op = "ADD";
                break;
            case "-":
                op = "SUB";
                break;
            case "*":
                op = "MUL";
                break;
            case "/":
                op = "DIV";
                break;
        }
        addLine(op);
    }

    public void print(){
        for (String variable:variables) {
            System.out.println(variable);
        }
        System.out.println();
        System.out.println(builder);
    }
}
