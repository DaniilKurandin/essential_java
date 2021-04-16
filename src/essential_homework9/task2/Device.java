package essential_homework9.task2;

import java.util.Objects;

// Главный калсс Устройство

public class Device {
    String manufacture; // производитель
    float price; // цена
    String serialNumber; // серийный номер

    @Override
    public String toString() {
        return "Device: manufacture = " + manufacture +
                ", price = " + price +
                ", serialNumber = " + serialNumber;
    }

    public Device(String manufacture, float price, String serialNumber) {
        this.manufacture = manufacture;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && manufacture.equals(device.manufacture) && serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacture, price, serialNumber);
    }

    // Сабкласс Монитор

    class Monitor {
        int resolutionX; // разрешение
        int resolutionY;
        EthernetAdapter ethernetAdapter;

        public Monitor(int resolutionX, int resolutionY) {
            this.resolutionX = resolutionX;
            this.resolutionY = resolutionY;
        }

        @Override
        public String toString() {
            return "Monitor: manufacture = " + manufacture +
                    ", price = " + price +
                    ", serialNumber = " + serialNumber + ", resolutionX = " + resolutionX +
                    ", resolutionY = " + resolutionY;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Monitor)) return false;
            Monitor monitor = (Monitor) o;
            return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
        }

        @Override
        public int hashCode() {
            return Objects.hash(resolutionX, resolutionY);
        }

    }

    // Сабкласс Адаптер

    class EthernetAdapter {
        int speed; // скорость
        String mac;

        public EthernetAdapter(int speed, String mac) {
            this.speed = speed;
            this.mac = mac;
        }
    }
}

