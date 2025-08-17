     import java.util.Scanner;
     public class AreaOfTriangleGrometry {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter coordinates for x1");
        double x1 = scan.nextDouble();
        System.out.println("enter coordinates for y1");
        double y1 = scan.nextDouble();
        System.out.println("enter coordinates for x2");
        double x2 = scan.nextDouble();
        System.out.println("enter coordinates for y2");
        double y2 = scan.nextDouble();
        System.out.println("enter coordinates for x3");
        double x3 = scan.nextDouble();
        System.out.println("enter coordinates for y3");
        double y3 = scan.nextDouble();

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        System.out.println("The lengths of the sides are:");
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is: " + area);
        scan.close();
    }

}