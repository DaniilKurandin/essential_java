package essential_homework7.task3;

public enum Animals {
    ZEBRA(10), COW(11), FOX(12), HIPPO(13);

    int age;

    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Animal = " + super.toString() + ", age = " + age;
    }


}
