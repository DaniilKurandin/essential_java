package essential_homework3.task2;

public class Main {
    public static void main(String[] args) {
        Pupil student1 = new ExcellentPupil();
        Pupil student2 = new GoodPupil();
        Pupil student3 = new GoodPupil();
        Pupil student4 = new BadPupil();

        ClassRoom classRoom = new ClassRoom(student1);
    }
}
