import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        Pattern javaPattern = Pattern.compile("\\B*(program)[a-z]*\\B*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = javaPattern.matcher(text);

        if (matcher.find()) {

            matcher.reset();

            javaPattern = Pattern.compile("\\B*(program)[a-z]*\\B*", Pattern.CASE_INSENSITIVE);
            matcher = javaPattern.matcher(text);

            while (matcher.find()) {
                System.out.println((matcher.end() - matcher.start()) + " " + matcher.group().trim());
            }

        } else {
            System.out.println("No word program found.");
        }

    }
}