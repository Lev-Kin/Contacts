import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int s = scanner.nextInt();

        if (s == 0) {
            System.out.println();
        } else {
            LocalTime time = LocalTime.ofSecondOfDay(s);
            System.out.println(time);
        }
    }
}