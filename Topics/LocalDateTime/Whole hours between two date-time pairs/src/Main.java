import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

import static java.lang.Math.abs;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime ldt1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime ldt2 = LocalDateTime.parse(scanner.nextLine());

        long allSec1 = ldt1.toEpochSecond(ZoneOffset.of("Z"));
        long allSec2 = ldt2.toEpochSecond(ZoneOffset.of("Z"));

        long sec = allSec1 - allSec2;
        long h = abs(sec) / 60 / 60;

        System.out.println(h);
    }
}
