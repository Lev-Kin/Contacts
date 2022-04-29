import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalTime time1 = LocalTime.parse(scanner.nextLine());
        LocalTime time2 = LocalTime.of(scanner.nextInt(), scanner.nextInt());

        int s1 = time1.toSecondOfDay();
        int s2 = time2.toSecondOfDay();

        System.out.println(LocalTime.ofSecondOfDay(s1 - s2));

    }
}