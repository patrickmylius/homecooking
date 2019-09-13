import java.util.ArrayList;
import java.util.Scanner;

public class AvgNumber2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        int amount;
        double total = 0;

        System.out.println("How many numbers would you like to enter?: ");
        amount = scanner.nextInt();

        for (int i = 0; i < amount; i++){
            System.out.println("Enter number: " + (i + 1) + "...");
            numbers.add(scanner.nextDouble());
        }
        for (Double d: numbers) {
            total += d;
        }
        double average = total / numbers.size();

        System.out.println("The average is: " + average);
    }
}