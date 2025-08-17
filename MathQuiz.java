import java.util.Scanner;
import java.util.Random;
public class MathQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int a = (int) rand.nextDouble(100);
        int b = (int) rand.nextDouble(100);
    System.out.println("Random number 1: " +  a ) ;
        System.out.println("Random number 2: " +  b );
        System.out.println("What is the sum of these two numbers?");
        int answer = scan.nextInt();
        if (answer ==(a + b)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is: " + (a + b));
        }
    System.out.println("what is the modulo of these two numbers?");
    int ans = scan.nextInt();
   if (ans ==(a%b)) {
System.out.println("Correct!");
   } else {
    System.out.println("Incorrect. The correct answer is : " + (a%b));
   }
   scan.close();            
}
    }

