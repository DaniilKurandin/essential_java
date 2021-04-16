package essential_homework10.codewar2;

public class Kata {
    public static int hexToDec(final String hexString) {
        return  Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        System.out.println(Kata.hexToDec("1"));
        System.out.println(Kata.hexToDec("a"));
        System.out.println(Kata.hexToDec("10"));
        System.out.println(Kata.hexToDec("FF"));
        System.out.println(Kata.hexToDec("-C"));
    }
}
