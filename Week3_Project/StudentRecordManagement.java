import java.util.ArrayList;
import java.util.Scanner;

// Class to hold student information
class Student {
    String name;
    int id;
    int age;
    String grade;

    // Constructor to initialize student details
    Student(String name, int id, int age, String grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }
}

// Class to manage student records
class StudentManagement {
    static ArrayList<Student> studentList = new ArrayList<>(); // List to store students
    static int totalStudents = 0; // Static variable to count total students

    // Method to add a new student
    static void addStudent(String name, int id, int age, String grade) {
        Student student = new Student(name, id, age, grade);
        studentList.add(student);
        totalStudents++;
        System.out.println("Student added successfully.");
    }

    // Method to update student information
    static void updateStudent(int id, String name, int age, String grade) {
        for (Student student : studentList) {
            if (student.id == id) {
                student.name = name;
                student.age = age;
                student.grade = grade;
                System.out.println("Student information updated.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    // Method to view all students
    static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : studentList) {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Age: " + student.age + ", Grade: " + student.grade);
        }
    }
}

// Main class to run the program
public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu loop
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. View Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add a new student
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    String grade = scanner.next();
                    StudentManagement.addStudent(name, id, age, grade);
                    break;
                case 2: // Update student information
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    String newGrade = scanner.next();
                    StudentManagement.updateStudent(updateId, newName, newAge, newGrade);
                    break;
                case 3: // View all students
                    StudentManagement.viewStudents();
                    break;
                case 4: // Exit the program
                    System.out.println("Exiting...");
                    break;
                default: // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner
    }
}
