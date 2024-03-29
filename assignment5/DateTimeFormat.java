package assignment5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        String pattern = "MM-dd-yyyy";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        String formattedDate = currentDate.format(formatter);

        System.out.println("Formatted date: " + formattedDate);
    }
}

