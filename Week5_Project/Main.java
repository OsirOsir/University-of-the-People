import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Course Enrollment and Grade Management System");

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Assign Grade");
            System.out.println("4. Calculate Overall Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Validate input
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Add Course
                    System.out.print("Enter course code: ");
                    String courseCode = scanner.nextLine();
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter max capacity: ");
                    int maxCapacity;
                    try {
                        maxCapacity = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid capacity. Please enter a valid number.");
                        break;
                    }
                    CourseManagement.addCourse(courseCode, courseName, maxCapacity);
                    break;

                case 2:
                    // Enroll Student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id;
                    try {
                        id = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a valid number.");
                        break;
                    }
                    Student student = CourseManagement.findStudent(id);
                    if (student == null) {
                        student = new Student(name, id);
                    } else {
                        System.out.println("Student already exists. Enrolling in additional courses.");
                    }
                    System.out.print("Enter course code to enroll: ");
                    String enrollCourseCode = scanner.nextLine();
                    Course course = CourseManagement.findCourse(enrollCourseCode);
                    if (course != null) {
                        CourseManagement.enrollStudent(student, course);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 3:
                    // Assign Grade
                    System.out.print("Enter student ID: ");
                    int studentId;
                    try {
                        studentId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a valid number.");
                        break;
                    }
                    Student gradeStudent = CourseManagement.findStudent(studentId);
                    if (gradeStudent == null) {
                        System.out.println("Student not found.");
                        break;
                    }
                    System.out.print("Enter course code: ");
                    String assignCourseCode = scanner.nextLine();
                    Course gradeCourse = CourseManagement.findCourse(assignCourseCode);
                    if (gradeCourse != null) {
                        System.out.print("Enter grade: ");
                        String grade = scanner.nextLine();
                        CourseManagement.assignGrade(gradeStudent, gradeCourse, grade);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 4:
                    // Calculate Overall Grade
                    System.out.print("Enter student ID: ");
                    int gradeStudentId;
                    try {
                        gradeStudentId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a valid number.");
                        break;
                    }
                    Student gradeStudentCalc = CourseManagement.findStudent(gradeStudentId);
                    if (gradeStudentCalc != null) {
                        CourseManagement.calculateOverallGrade(gradeStudentCalc);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    // Exit
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
