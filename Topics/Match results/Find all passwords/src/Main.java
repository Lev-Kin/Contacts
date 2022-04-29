import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern javaPattern = Pattern.compile("password\\s*:?\\s*(\\w+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = javaPattern.matcher(text);

        if (matcher.find()) {

            matcher.reset();

            javaPattern = Pattern.compile("password\\s*:?\\s*(\\w+)", Pattern.CASE_INSENSITIVE);
            matcher = javaPattern.matcher(text);

            while (matcher.find()) {
                System.out.print(matcher.group(1));
                System.out.println();
            }

        } else {
            System.out.println("No passwords found.");
        }

    }
}