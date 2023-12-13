import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters for name and address

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Student extends Person {
    private List<Course> coursesTaken;

    public Student(String name, String address) {
        super(name, address);
        coursesTaken = new ArrayList<>();
    }

    public void addCourseWithGrade(String courseName, double grade) {
        if (coursesTaken.size() < 30) {
            Course course = new Course(courseName, grade);
            coursesTaken.add(course);
        } else {
            System.out.println("Student cannot take more than 30 courses.");
        }
    }

    public void printCoursesTaken() {
        for (Course course : coursesTaken) {
            System.out.println("Course: " + course.getName() + ", Grade: " + course.getGrade());
        }
    }

    public double getAverageGrade() {
        if (coursesTaken.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Course course : coursesTaken) {
            sum += course.getGrade();
        }

        return sum / coursesTaken.size();
    }
}

class Teacher extends Person {
    private List<String> coursesTaught;

    public Teacher(String name, String address) {
        super(name, address);
        coursesTaught = new ArrayList<>();
    }

    public void addCourseTaught(String courseName) {
        if (coursesTaught.size() < 5) {
            coursesTaught.add(courseName);
        } else {
            System.out.println("Teacher cannot teach more than 5 courses concurrently.");
        }
    }

    public void removeCourseTaught(String courseName) {
        coursesTaught.remove(courseName);
    }

    public void printCoursesTaught() {
        for (String course : coursesTaught) {
            System.out.println("Currently Teaching: " + course);
        }
    }
}

class Course {
    private String name;
    private double grade;

    public Course(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("dinesh", "nagarkurnool veldanda");
        Teacher teacher = new Teacher("srujana", "hyderabad 123");

        student.addCourseWithGrade("daa", 90.5);
        student.addCourseWithGrade("os", 97.0);
        student.printCoursesTaken();
        student.getAverageGrade();

        teacher.addCourseTaught("coa");
        teacher.addCourseTaught("flat");
        teacher.printCoursesTaught();
    }
}

