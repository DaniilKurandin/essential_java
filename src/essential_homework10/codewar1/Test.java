package essential_homework10.codewar1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {
    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a, b).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Test.between(2, 5)));
    }
}
