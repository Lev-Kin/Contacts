import java.util.*;

class Date {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();
        String dateRegex = "(0?[1-9]|[12][0-9]|3[01])[- /.](0?[1-9]|1[012])[- /.]\\d{4}||\\d{4}[- /.](0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])";

        System.out.println(date.matches(dateRegex) ? "Yes" : "No");
    }
}