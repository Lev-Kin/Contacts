import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime ldt = LocalDateTime.parse(scanner.nextLine()).plusHours(11L);

        System.out.println(ldt.toLocalDate());
    }
}