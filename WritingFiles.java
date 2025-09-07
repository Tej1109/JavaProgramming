import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args){
        String filepath = "C:\\Users\\shail\\IdeaProjects\\MyFirstProject\\src\\file1.txt";
        String textContent = """
              If this world were mine,
              hey roman numeral 7 bae drop it like its hawt
              """;
        try(FileWriter writer = new FileWriter(filepath)){
            writer.write(textContent);
            System.out.println("File Written");
        }
        catch (FileNotFoundException e){
            System.out.println("File couldn't be found");
        }
        catch (IOException e){
            System.out.println("There is some error");
        }
}}
