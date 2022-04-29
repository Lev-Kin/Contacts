import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dT1, LocalDateTime dT2) {

        String year = String.format("%04d", Math.max(dT1.getYear(), dT2.getYear()));
        String month = String.format("%02d", Math.max(dT1.getMonthValue(), dT2.getMonthValue()));
        String day = String.format("%02d", Math.max(dT1.getDayOfMonth(), dT2.getDayOfMonth()));
        String hour = String.format("%02d", Math.max(dT1.getHour(), dT2.getHour()));
        String minute = String.format("%02d", Math.max(dT1.getMinute(), dT2.getMinute()));
        String second = String.format("%02d", Math.max(dT1.getSecond(), dT2.getSecond()));

        return LocalDateTime.parse(year + "-" + month + "-" + day + "T" + hour + ":" + minute + ":" + second);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}