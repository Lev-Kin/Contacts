import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        localDate = localDate.minusDays(10);

        System.out.println(localDate);

    }
}