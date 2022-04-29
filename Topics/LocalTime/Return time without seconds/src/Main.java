import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] time = str.split(":");

        LocalTime time1 = LocalTime.parse(time[0] + ":" + time[1]);

        System.out.println(time1);

    }
}