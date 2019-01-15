package antlr4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Emitter {

    private static StringBuilder builder = new StringBuilder();
    private static HashMap<String, String> variables = new HashMap<>();

    public static void addLine(String line){
        builder.append(line+"\n");
    }

    public static void addOp(String op){
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

    public static void addVariable(String name, String type){
        variables.put(name, type);
    }

    public static void print(){
        Set<String> keySet = variables.keySet();
        for (String key : keySet) {
            System.out.println(key+" "+variables.get(key));
        }
        System.out.println();
        System.out.println(builder);

    }
}
