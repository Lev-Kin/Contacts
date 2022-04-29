import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime dt = LocalDateTime.parse(scanner.nextLine());
        long minutes = scanner.nextLong();

        dt = dt.plusMinutes(minutes);

        System.out.println(dt.getYear() + " " + dt.getDayOfYear() + " " + dt.toLocalTime());
    }
}