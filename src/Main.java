/* This program uses arraylists, looping, and decision constructs to output the temperature
 * of a specific day that is inputted by the user.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String user_input;

        //Creates two arraylists: One for the days of the week and one for the temperatures.
        ArrayList<String> days = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"));
        ArrayList<Double> temperature = new ArrayList<>(List.of(52.5, 52.0, 53.5, 54.5,
                57.5, 58.5, 49.0));

        //Calculates the average of all temperatures of the week.
        double total = 0;
        for (Double temp : temperature) {
            total += temp;
        }
        double avg = total/ temperature.size();

        System.out.print("Please enter a day of the week: ");
        user_input = in.next();
        System.out.println("\nTemperature: ");

        /* Uses loops and decisions statements to output specific days and temperatures depending
           on the user input in the user_input variable.
         */
        if (user_input.equals("week") || user_input.equals("Week")) {
            for(int i = 0; i < days.size(); i++){
                System.out.println(days.get(i) + ": " + temperature.get(i));
            }
            System.out.printf("\nAverage: %.2f", avg);
        }
        else{
            switch (user_input) {
                case "Monday", "monday" -> System.out.println(days.getFirst() + ": " + temperature.getFirst());
                case "Tuesday", "tuesday" -> System.out.println(days.get(1) + ": " + temperature.get(1));
                case "Wednesday", "wednesday" -> System.out.println(days.get(2) + ": " + temperature.get(2));
                case "Thursday", "thursday" -> System.out.println(days.get(3) + ": " + temperature.get(3));
                case "Friday", "friday" -> System.out.println(days.get(4) + ": " + temperature.get(4));
                case "Saturday", "saturday" -> System.out.println(days.get(5) + ": " + temperature.get(5));
                case "Sunday", "sunday" -> System.out.println(days.getLast() + ": " + temperature.getLast());
            }
        }
    }
}