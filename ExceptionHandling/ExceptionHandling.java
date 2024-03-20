package ExceptionHandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
class EmailValidator {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);
    public static boolean isValidEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
class EmailControllerAdvice {
    public static void handleInvalidEmailException(InvalidEmailException e) {
        System.out.println("Error: " + e.getMessage());
    }
    public static void handleInputLessThanOrEqualToZeroException() {
        System.out.println("Error: Input value should be greater than 0.");
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an email address: ");
            String email = scanner.nextLine();
            if (email.isBlank()) {
                throw new InvalidEmailException("Email cannot be empty.");
            }
            if (!EmailValidator.isValidEmail(email)) {
                throw new InvalidEmailException("Invalid email address.");
            }
            System.out.println("Valid email address.");
        } catch (InvalidEmailException e) {
            EmailControllerAdvice.handleInvalidEmailException(e);
        } catch (Exception e) {
            EmailControllerAdvice.handleInputLessThanOrEqualToZeroException();
        } finally {
            scanner.close();
        }
    }
}