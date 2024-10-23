public class Course {
  private String courseCode;
  private String courseName;
  private int maxCapacity;
  private int enrolledStudents;

  private static int totalEnrolledStudents = 0; // Static variable to track across all courses

  // Constructor
  public Course(String courseCode, String courseName, int maxCapacity) {
      this.courseCode = courseCode;
      this.courseName = courseName;
      this.maxCapacity = maxCapacity;
      this.enrolledStudents = 0;
  }

  // Getters
  public String getCourseCode() {
      return courseCode;
  }

  public String getCourseName() {
      return courseName;
  }

  public int getMaxCapacity() {
      return maxCapacity;
  }

  public int getEnrolledStudents() {
      return enrolledStudents;
  }

  // Static method to get total enrolled students across all courses
  public static int getTotalEnrolledStudents() {
      return totalEnrolledStudents;
  }

  // Method to add a student to a course
  public boolean addStudent() {
      if (enrolledStudents < maxCapacity) {
          enrolledStudents++;
          totalEnrolledStudents++;
          return true;
      }
      return false;
  }
}
