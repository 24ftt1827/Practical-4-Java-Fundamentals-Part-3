import java.util.Scanner;
public class MoneyChanger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what currency are you changing to?\n 1 for bnd 2 for rm");
        double a = scan.nextDouble();
        if (a==1) {
            System.out.println(" insert how much money you are chaning");
            double b= scan.nextDouble();
            double c = (b /3);
            System.out.println("here is your change: " + c + " BND");
        } else { System.out.println(" insert how much money you are chaning");
            double b= scan.nextDouble();
            double c = (b *3);
            System.out.println("here is your change: " + c + " RM");
            
        }
        scan.close();
    }



}
