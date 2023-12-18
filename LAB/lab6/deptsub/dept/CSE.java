package dept;

public class CSE implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Computer Science and Engineering (CSE) Subjects:");
        System.out.println("1. Data Structures");
        System.out.println("2. Algorithms");
        System.out.println("3. Database Management");
    }
}
