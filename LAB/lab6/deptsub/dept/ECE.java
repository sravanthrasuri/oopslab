package dept;

public class ECE implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Electronics and Communication Engineering (ECE) Subjects:");
        System.out.println("1. Digital Electronics");
        System.out.println("2. Communication Systems");
        System.out.println("3. Signal Processing");
    }
}
