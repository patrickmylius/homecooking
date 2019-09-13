import java.util.Scanner;

public class AvgNumberTotal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double total = 0;
        int count = 0;
        System.out.print("Number: ");

        while (in.hasNextDouble()) {
            System.out.print("Number: ");
            double input = in.nextDouble();
            total = total + input;
            count++; //increment

        }

        System.out.print(total);

        double average = 0;
        if(count > 0) {
            average = total / count;
        }
        System.out.println(average);
    }
}
