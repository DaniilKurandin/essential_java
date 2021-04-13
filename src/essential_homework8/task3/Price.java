package essential_homework8.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Price {
    String product;
    String magazine;
    int price;

    public Price() {
    }

    public Price(String magazine, String product, int price) {
        this.magazine = magazine;
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public String getMagazine() {
        return magazine;
    }

    public int getPrice() {
        return price;
    }

    void price() {
        Scanner scanner = new Scanner(System.in);


        Price[] arr = new Price[2];

        while (true) {
            try {
                System.out.println("Введите название магазина, название продукта, цену в гривнах");
                for (int i = 0, j = 1; i < arr.length; i++) {
                    System.out.println("Список " + j++);
                    arr[i] = new Price(scanner.next(), scanner.next(), scanner.nextInt());
                }

                Comparator<Price> comparator = Comparator.comparing(Price::getMagazine);
                Arrays.sort(arr, comparator);

                break;

            } catch (InputMismatchException e) {
                System.out.println("Неверный формат");
                System.out.println("Повторите\n");

            }
        }

        System.out.println("Введите название магазина");
        Scanner sc = new Scanner(System.in);
        String nameMagazine = sc.nextLine();

        System.out.println("Список продуктов");

        try{
            for (int i = 0; i < arr.length; i++) {
                nameMagazine.equals(arr[i]);
                System.out.println(arr[i].getProduct());
            }
        } catch (NullPointerException e) {
            System.err.println("Exception");
        }
    }
}
