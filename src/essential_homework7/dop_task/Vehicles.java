package essential_homework7.dop_task;

public enum Vehicles {
    BMW(100){
        @Override
        String getColor() {
            return "\u001B[31m" + "RED" + "\u001B[0m";
        }
    }, SUBARU(200){
        @Override
        String getColor() {
            return "\u001B[32m" + "GREEN" + "\u001B[0m";
        }
    }, TOYOTA(300){
        @Override
        String getColor() {
            return "\u001B[30m" + "BLACK" + "\u001B[0m";
        }
    }, AUDI(400){
        @Override
        String getColor() {
            return "\u001B[33m" + "YELLOW" + "\u001B[0m";
        }
    };

    int price;

    Vehicles(int price){
        this.price = price;
    }

    String getColor() {
        return "";
    }

    @Override
    public String toString() {
        return "Vehicles = " + super.toString() +
                ", price = " + price + ", color = " + getColor();
    }
}
