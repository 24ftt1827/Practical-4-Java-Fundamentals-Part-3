import java.util.Scanner;
public class ReverseOfInteger {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("please input a number between 100 and 999");
        int a = scan.nextInt();
        int b = (a%10);
        int c = (a/10);
        int d = (c%10);
        int e = (a/100);
        System.out.print(b + ""+  d + "" +e);
        scan.close();
    }
    
}
