
class Problem {
    public static void main(String[] args) {

        int test = 0;
        for (String arg : args) {
            if (arg.equals("test")) {
                test = 2;
                break;
            }
        }

        if (test == 2) {
            System.out.println(test);
        } else {
            System.out.println(-1);
        }
    }
}
