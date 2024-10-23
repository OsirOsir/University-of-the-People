import java.util.HashMap;

public class Student {
    private String name;
    private int id;
    private HashMap<Course, String> enrolledCourses; // Stores the course and grade

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new HashMap<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Method to enroll student in a course
    public void enrollInCourse(Course course) {
        if (course.addStudent()) { // Adds student if course capacity is not full
            enrolledCourses.put(course, null); // null indicates no grade yet
            System.out.println(name + " has been enrolled in " + course.getCourseName());
        } else {
            System.out.println("Enrollment failed. Course " + course.getCourseName() + " is full.");
        }
    }

    // Method to assign a grade for a specific course
    public void assignGrade(Course course, String grade) {
        if (enrolledCourses.containsKey(course)) {
            enrolledCourses.put(course, grade);
            System.out.println("Grade " + grade + " assigned to " + name + " for " + course.getCourseName());
        } else {
            System.out.println(name + " is not enrolled in " + course.getCourseName());
        }
    }

    // Get grades for a specific course
    public String getGrade(Course course) {
        return enrolledCourses.get(course);
    }

    // Get the list of enrolled courses
    public HashMap<Course, String> getEnrolledCourses() {
        return enrolledCourses;
    }
}
