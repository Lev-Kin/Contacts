import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.parse(scanner.nextLine());
        final int day = scanner.nextInt();
        final int limYear = date.getYear() + 1;

        while (date.getYear() != limYear) {

            System.out.println(date);
            date = date.plusDays(day);

        }
    }
}
