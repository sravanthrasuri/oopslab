package admission;

public class Student {
    private String name;
    private int mathsMarks;
    private int physicsMarks;
    private int chemistryMarks;
    private int englishMarks;

    public Student(String name, int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks) {
        this.name = name;
        this.mathsMarks = mathsMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.englishMarks = englishMarks;
    }

    public String getName() {
        return name;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }
}

