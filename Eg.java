import java.io.BufferedReader;
import java.io.FileReader;

public class Eg {
    public static void main(String[] args){
        String filePath = "C:\\Users\\shail\\Desktop\\file.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
