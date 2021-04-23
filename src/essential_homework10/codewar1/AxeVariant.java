package essential_homework10.codewar1;
import java.util.ArrayList;
import java.util.Arrays;

// Топорный вариант
public class AxeVariant {
    public static int[] between(int a, int b) {
        int length = 0;
        for (int i = a; i <= b; i++) {
            length++;
        }

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a++;
        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(AxeVariant.between(5, 10)));

        ArrayList list = new ArrayList();

        System.out.println(list);
    }

}
