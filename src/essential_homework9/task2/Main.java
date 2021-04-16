package essential_homework9.task2;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Device device2 = new Device("ASUS", 155, "CD43254567CD");
        Device device3 = new Device("HP", 137, "LD15554567CD");
        Device device4 = new Device("LG", 190, "AB1234567MN");
        Device device5 = new Device("Samsung", 120, "AB1234567CD");

        System.out.println(device1);
        System.out.println(device2);
        System.out.println(device3);
        System.out.println(device4);
        System.out.println(device5);

        System.out.println("==========================");

        System.out.println(device1.new Monitor(1280, 1024));
        System.out.println(device2.new Monitor(1280, 1024));
        System.out.println(device3.new Monitor(1280, 1024));
        System.out.println(device4.new Monitor(1280, 1024));
        System.out.println(device5.new Monitor(1280, 1024));

        System.out.println("==========================");

        System.out.println("device1.hashCode = " + device1.hashCode());
        System.out.println("device2.hashCode = " + device2.hashCode());
        System.out.println("device3.hashCode = " + device3.hashCode());
        System.out.println("device4.hashCode = " + device4.hashCode());
        System.out.println("device5.hashCode = " + device5.hashCode());

        System.out.println("==========================");

        System.out.println("device1.equals(device2) = " + device1.equals(device2));
        System.out.println("device1.equals(device3) = " + device1.equals(device3));
        System.out.println("device1.equals(device4) = " + device1.equals(device4));
        System.out.println("device1.equals(device5) = " + device1.equals(device5));

    }
}
