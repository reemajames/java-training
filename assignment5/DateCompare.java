package assignment5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDateString = scanner.nextLine();

        LocalDate inputDate = LocalDate.parse(inputDateString, DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate currentDate = LocalDate.now();

        int comparisonResult = inputDate.compareTo(currentDate);

        if (comparisonResult == 0) {
            System.out.println("The input date is equal to the current date.");
        } else if (comparisonResult < 0) {
            System.out.println("The input date is before the current date.");
        } else {
            System.out.println("The input date is after the current date.");
        }

        scanner.close();
    }
}

