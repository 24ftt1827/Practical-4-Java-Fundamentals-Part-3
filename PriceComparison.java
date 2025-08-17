import java.util.Scanner;
public class PriceComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is the cost of the 1st package?");
        double a = scan.nextDouble();
        System.out.println("how much does it weigh in grams?");
        double b = scan.nextDouble();
        System.out.println("what is the cost of the 2nd package?");
        double c = scan.nextDouble();
        System.out.println("how much does it weigh in grams?");
        double d = scan.nextDouble();

        if ((a / b) < (c / d)) {
            System.out.println("The 1st package is cheaper." );
        } else {
            System.out.println("The 2nd package is cheaper." );
        }
        scan.close();

    }
}
