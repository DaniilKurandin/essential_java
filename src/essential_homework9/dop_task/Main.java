package essential_homework9.dop_task;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Валера", 5, true);
        Animal animal2 = new Animal("Васька", 45, false);
        Animal animal3 = new Animal("Барсик", 3, true);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        System.out.println("=============================");

        System.out.println("animal1.hashCode = " + animal1.hashCode());
        System.out.println("animal2.hashCode = " + animal2.hashCode());
        System.out.println("animal3.hashCode = " + animal3.hashCode());

        System.out.println("=============================");

        System.out.println("animal1.equals(animal2) = " + animal1.equals(animal2));
        System.out.println("animal1.equals(animal3) = " + animal1.equals(animal3));

    }


}
