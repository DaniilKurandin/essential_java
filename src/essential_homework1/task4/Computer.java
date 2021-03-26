package essential_homework1.task4;

public class Computer {

    Computers[] computers = new Computers[5];

   static class Computers {
        String name;

        Computers(String name) {
            this.name = name;
        }

        void computers(){
            Computer computer = new Computer();
            computer.computers[0] = new Computer.Computers("ASUS");
            computer.computers[1] = new Computer.Computers("HP");
            computer.computers[2] = new Computer.Computers("Apple");
            computer.computers[3] = new Computer.Computers("Acer");
            computer.computers[4] = new Computer.Computers("LG");

            for (int i = 0; i < computer.computers.length; i++) {
                System.out.println(computer.computers[i].name);
            }
        }
    }
}

