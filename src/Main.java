/*  This program uses a for loop to take 5 floating point integers from user input and output
    the Average, Maximum, and Minimum of all integers inputted.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        int size = 10;
        ArrayList<Double> nums = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter ten floating point integers: ");

        for(int i = 0; i < size; i++){
            double num = in.nextDouble();
            total += num;
            nums.add(num);
        }
        nums.sort(null);

        System.out.println("\nAverage: " + total/size);
        System.out.println("Maximum: " + nums.getLast());
        System.out.println("Minimum: " + nums.getFirst());
    }
}