import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

import static java.lang.Math.abs;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime ldt = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime begin = LocalDateTime.of(ldt.getYear(), 1, 1, 00, 00, 00);

        long allSec1 = ldt.toEpochSecond(ZoneOffset.of("Z"));
        long allSec2 = begin.toEpochSecond(ZoneOffset.of("Z"));

        long sec = allSec1 - allSec2;
        long h = abs(sec) / 60 / 60;

        System.out.println(h);
    }
}