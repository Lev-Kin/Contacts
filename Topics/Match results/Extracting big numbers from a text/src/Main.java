import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();

        Pattern javaPattern = Pattern.compile("\\B*\\d{10,}\\B*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = javaPattern.matcher(stringWithNumbers);

        if (matcher.find()) {

            matcher.reset();

            javaPattern = Pattern.compile("\\B*\\d{10,}\\B*", Pattern.CASE_INSENSITIVE);
            matcher = javaPattern.matcher(stringWithNumbers);

            while (matcher.find()) {
                System.out.println(matcher.group().trim() + ":" + (matcher.end() - matcher.start()));
            }

        } else {
            System.out.println("No long number found.");
        }

    }
}
