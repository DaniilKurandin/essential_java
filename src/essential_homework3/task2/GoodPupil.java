package essential_homework3.task2;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("The student is good");
    }

    @Override
    void read() {
        System.out.println("Good read");
    }

    @Override
    void write() {
        System.out.println("Good write");
    }

    @Override
    void relax() {
        System.out.println("Good relax");
    }
}
