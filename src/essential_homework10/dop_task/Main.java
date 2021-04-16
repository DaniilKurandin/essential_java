package essential_homework10.dop_task;

public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        for (int i = 0; i < 20; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        System.out.println(arr.size());

        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
