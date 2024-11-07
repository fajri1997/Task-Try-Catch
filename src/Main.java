import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded123";

        try {

            System.out.print("Enter your name: ");
            String username = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (!username.equals(validUsername) || !password.equals(validPassword)) {
                throw new Exception("Invalid credentials");            }
            System.out.println("login successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            finally {
             scanner.close();
        }
    }

}