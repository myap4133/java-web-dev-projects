package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Charles", "CoolProgram.cpp");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> e : studentFiles.entrySet()){
            System.out.println(e.getKey() + " Grade: " + CheckFileExtension(studentFiles.get(e.getKey())));
        }

        Divide(4, 2);
        Divide(5, 3);
        Divide(5, 0);
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        try{
            if(y == 0){
                throw new ArithmeticException();
            }
            int di = x / y;
            System.out.println(x + " / " + y + " = " + di);
        }
        catch(Exception e){
            System.out.println("Invalid values. You cannot divide by zero.");
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        try{
            if(fileName.isEmpty()){
                throw new Exception();
            }
            if(fileName.endsWith(".java")){
                return 1;
            }
            else{
                return 0;
            }
        }
        catch(Exception e){
            return -1;
        }
    }
}