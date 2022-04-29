import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime ldt = LocalDateTime.parse(scanner.next());
        ldt = ldt.plusDays(scanner.nextInt()).minusHours(scanner.nextInt());

        System.out.println(ldt);
    }
}
