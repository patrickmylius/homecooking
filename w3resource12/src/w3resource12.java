import java.util.Scanner;


public class w3resource12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //finder gennemsnit med user input.
        System.out.print("Input the first number: ");
        int num1 = in.nextInt();

        System.out.print("Input the second number: ");
        int num2 = in.nextInt();

        System.out.print("Input the third number: ");
        int num3 = in.nextInt();

        System.out.print("Input the fourth number: ");
        int num4 = in.nextInt();

        System.out.print("Input the fifth number: ");
        int num5 = in.nextInt();

        System.out.println("Average of the five numbers is: " +  (num1 + num2 + num3 + num4 + num5) / 5);




    }
}
