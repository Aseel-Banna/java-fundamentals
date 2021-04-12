/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        if(dir.charAt(dir.length()-1) == 'p'){
            System.out.println("Running using Gradle/Test");
            int many = javaScriptLinter("./app/src/main/resources/gates.js");
        }else{
            System.out.println("Running using IntelliJ");
            int many = javaScriptLinter("./app/src/main/resources/gates.js");
        }
    }
    public static int javaScriptLinter(String fileName){
        Path path = Paths.get(fileName);
        int lineNumber = 0;
        int missedSemiColons = 0;
        char character;
        FileReader file = null;
        BufferedReader reader = null;
        String line;

        try {
            file = new FileReader(fileName);
            reader = new BufferedReader(file);
            while ((line = reader.readLine()) != null){
                lineNumber++;
                if(line.length() > 0){
                    character = line.charAt(line.length() -1);
                    if(check(line, character)){
                        missedSemiColons++;
                        System.out.println("Line "+ lineNumber +": Missing semicolon.");
                    }
                }
            }
            reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return missedSemiColons;
    }
    public static boolean check(String line, char c){
        if (line.length() == 0){
            return false;
        }
        if(line.contains("if") || line.contains("else"))
            return false;
        else if(c!='{' && c!= '}' && c!='\n' && c!=';')
            return true;
        else
            return false;
    }
}
