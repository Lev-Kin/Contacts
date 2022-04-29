import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String part = scanner.nextLine();
        String line1 = "aa";
        String line2 = "aba";
        String line3 = "abbba";
        String line4 = "abbbbba";

        String regex = "ab{3,}a";

        System.out.println(line1.matches(regex));
        System.out.println(line2.matches(regex));
        System.out.println(line3.matches(regex));
        System.out.println(line4.matches(regex));

    }
}