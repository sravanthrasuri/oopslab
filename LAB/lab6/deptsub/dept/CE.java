package dept;

public class CE implements Department {
    @Override
    public void displaySubjects() {
        System.out.println("Civil Engineering (CE) Subjects:");
        System.out.println("1. Structural Analysis");
        System.out.println("2. Geotechnical Engineering");
        System.out.println("3. Environmental Engineering");
    }
}

