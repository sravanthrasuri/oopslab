package week3;
import java.util.ArrayList;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Student extends Person {
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String name, String address) {
        super(name, address);
    }

    public void addCourseWithGrade(String course, double grade) {
        if (courses.size() < 30) {
            courses.add(course);
            grades.add(grade);
            System.out.println("Course '" + course + "' with grade " + grade + " added for student " + getName());
        } else {
            System.out.println("Cannot add more courses. Maximum limit reached.");
        }
    }

    public void printAllCoursesAndGrades() {
        System.out.println("Courses taken by student " + getName() + ":");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

class Teacher extends Person {
    private ArrayList<String> coursesTaught = new ArrayList<>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    public void addCourseTaught(String course) {
        if (coursesTaught.size() < 5) {
            coursesTaught.add(course);
            System.out.println("Course '" + course + "' added for teacher " + getName());
        } else {
            System.out.println("Cannot add more courses. Maximum limit reached.");
        }
    }

    public void removeCourseTaught(String course) {
        if (coursesTaught.contains(course)) {
            coursesTaught.remove(course);
            System.out.println("Course '" + course + "' removed for teacher " + getName());
        } else {
            System.out.println("Course '" + course + "' not found for teacher " + getName());
        }
    }

    public void printAllCoursesTaught() {
        System.out.println("Courses taught by teacher " + getName() + ":");
        for (String course : coursesTaught) {
            System.out.println(course);
        }
    }
}

public class SchoolApplication {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice", "123 Main St");

        // Add courses with grades for the student
        student.addCourseWithGrade("Math", 90.5);
        student.addCourseWithGrade("English", 85.0);
        student.addCourseWithGrade("Science", 92.5);

        // Print all courses and grades for the student
        student.printAllCoursesAndGrades();

        // Calculate and print the average grade for the student
        System.out.println("Average Grade: " + student.calculateAverageGrade());

        System.out.println("-----------------------------------------------------");

        // Create a teacher
        Teacher teacher = new Teacher("Mr. Smith", "456 Oak St");

        // Add courses taught for the teacher
        teacher.addCourseTaught("History");
        teacher.addCourseTaught("Computer Science");

        // Print all courses taught by the teacher
        teacher.printAllCoursesTaught();

        // Remove a course taught by the teacher
        teacher.removeCourseTaught("Computer Science");

        // Print updated courses taught by the teacher
        teacher.printAllCoursesTaught();
    }
}
