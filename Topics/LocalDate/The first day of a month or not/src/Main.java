import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();

        LocalDate r = LocalDate.ofYearDay(year, dayOfYear);

        if (r.getDayOfMonth() == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}