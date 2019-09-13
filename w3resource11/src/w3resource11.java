import java.util.Scanner;


public class w3resource11 {

    private static final double radius = 7.5;

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        //Udregner med static final radius på 7.5
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius  * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);


        //Skaber input og udregn med hvilken som helst radius.
        System.out.println("Input the radius of the circle: ");
        double radius = io.nextDouble();
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }
}
