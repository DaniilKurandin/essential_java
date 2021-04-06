package essential_homework5.task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listOfWholeNumbers = new ArrayList<>();

        for (int i = 0; i != 10; i++) {
            listOfWholeNumbers.add(i, (int) (10 + Math.random() * 11));
        }

        int min = listOfWholeNumbers.get(0);
        int max = listOfWholeNumbers.get(0);

        System.out.println(listOfWholeNumbers);
        for (Integer i : listOfWholeNumbers) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("The INDEX of min is : " + listOfWholeNumbers.indexOf(min));
        System.out.println("The INDEX of max is : " + listOfWholeNumbers.indexOf(max));

        ListIterator<Integer> iterator = listOfWholeNumbers.listIterator();

        int temp;
        while (iterator.hasNext()) {
            temp = iterator.next();
            iterator.set(++temp);
        }

        System.out.println(listOfWholeNumbers);
    }
}
