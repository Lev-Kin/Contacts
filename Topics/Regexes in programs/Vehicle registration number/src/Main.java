import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[ABEKMHOPCTYX]\\d\\d\\d[ABEKMHOPCTYX][ABEKMHOPCTYX]";
        String regNum = scanner.nextLine();

        System.out.println(regNum.matches(regex) ? "true" : "false");
    }
}