import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args){
        String filePath = "C:\\Users\\shail\\IdeaProjects\\MyFirstProject\\src\\file1.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            System.out.println("File found");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Some error occurred");
        }
    }
}
