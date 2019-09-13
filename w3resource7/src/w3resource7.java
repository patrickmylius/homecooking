import java.util.Scanner;

public class w3resource7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the number: ");

        int n = in .nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
