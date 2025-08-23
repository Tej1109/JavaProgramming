// Obsessed with My Way.
import java.util.Scanner;
public class QuizGame {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] questionArr = {"What is a man?", "If not himself", "To say the things one truly feels"};
        int[] answerArr =  {1,1,1,1};
        String[][] ops = {{"1. What has he got?" , "2. B" , "3. C" , "4. D"},
                {"1. Then he has naught", "2. B" , "3. C" , "4. D"},
                {"1. And not the words of one who kneels","2. B" , "3. C" , "4. D"}
        };
        int ans;
        int counter = 0;
        for (int i = 0; i < questionArr.length; i++){
            System.out.println(questionArr[i]);
            for (String op : ops[i]){
                System.out.println(op);

            }
            System.out.print("Enter your answer: ");
            ans = scanner.nextInt();
            if (ans == answerArr[i]){
                System.out.println("Correct!");
                counter ++;
            }
            else {
                System.out.println("Oops, that's a wrong one :/");
            }
        }
        System.out.printf("You got %d out of %d correct!",counter,questionArr.length);
    }
}
