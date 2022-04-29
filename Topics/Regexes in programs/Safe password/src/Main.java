import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        String passwordRegex = "^.*(?=.{12,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$";

        System.out.println(password.matches(passwordRegex) ? "YES" : "NO");
    }
}