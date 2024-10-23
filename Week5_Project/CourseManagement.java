import java.util.ArrayList;
import java.util.HashMap;

public class CourseManagement {
    private static ArrayList<Course> courses = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();

    // Method to add a new course
    public static void addCourse(String courseCode, String courseName, int maxCapacity) {
        Course newCourse = new Course(courseCode, courseName, maxCapacity);
        courses.add(newCourse);
        System.out.println("Course " + courseName + " added.");
    }

    // Method to enroll a student in a course
    public static void enrollStudent(Student student, Course course) {
        student.enrollInCourse(course);
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to assign a grade to a student
    public static void assignGrade(Student student, Course course, String grade) {
        student.assignGrade(course, grade);
    }

    // Method to calculate the overall grade for a student (simplified)
    public static void calculateOverallGrade(Student student) {
        HashMap<Course, String> enrolledCourses = student.getEnrolledCourses();
        System.out.println("Grades for " + student.getName() + ":");
        for (Course course : enrolledCourses.keySet()) {
            String grade = enrolledCourses.get(course);
            System.out.println(course.getCourseName() + ": " + grade);
        }
    }

    // Retrieve course by code
    public static Course findCourse(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }

    // Retrieve student by ID
    public static Student findStudent(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }
}
