import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int[] array = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = array.length;
        int[] arrayTemp = new int[length];

        int shift = scanner.nextInt();
        int finalShift = 0;
        if (shift > array.length) {
            finalShift = Math.abs(shift % array.length);
        } else {
            finalShift = shift;
        }

        System.arraycopy(array, length - finalShift, arrayTemp, 0, finalShift);
        System.arraycopy(array, 0, arrayTemp, finalShift, length - finalShift);

        for (int i = 0; i < arrayTemp.length; i++) {
            System.out.print(arrayTemp[i] + " ");
        }
    }

}
