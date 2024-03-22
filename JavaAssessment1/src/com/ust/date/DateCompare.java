package com.ust.date;

import java.time.LocalDate;
import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDateStr = scanner.nextLine();
        LocalDate inputDate = LocalDate.parse(inputDateStr);
        LocalDate currentDate = LocalDate.now();

        int comparison = inputDate.compareTo(currentDate);

        if (comparison == 0) {
            System.out.println("Given input date is equal to the current date.");
        } else if (comparison < 0) {
            System.out.println("Given input date is before the current date.");
        } else {
            System.out.println("Given input date is after the current date.");
        }

        scanner.close();
    }
}

