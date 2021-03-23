package essential_homework1.task4;

import static essential_homework1.task4.Computer.computers;

public class Main {
    public static void main(String[] args) {
        computers[0] = new Computer.Computers("ASUS");
        computers[1] = new Computer.Computers("HP");
        computers[2] = new Computer.Computers("Apple");
        computers[3] = new Computer.Computers("Acer");
        computers[4] = new Computer.Computers("LG");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].name);
        }
    }
}
