
import java.util.ArrayList;

class Student {

    int studentId;
    String studentName;
    String attendanceStatus;

    Student(int studentId, String studentName, String attendanceStatus) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.attendanceStatus = attendanceStatus;
    }

    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Attendance Status: " + attendanceStatus);
    }
}


public class AttendanceManagement {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Student> studentList = new ArrayList<>();

        // Creating student objects
        Student s1 = new Student(101, "Sanjuu", "Present");
        Student s2 = new Student(102, "Priya", "Absent");
        Student s3 = new Student(103, "Arun", "Present");

        // Adding students to ArrayList
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        // Initializing counters
        int present = 0;
        int absent = 0;

        System.out.println("===== STUDENT DETAILS =====");

        // Displaying students and counting attendance
        for (Student s : studentList) {

            s.display();
            System.out.println("-------------------------");

            if (s.attendanceStatus.equalsIgnoreCase("Present")) {
                System.out.println("Student is present");
                present++;
            }
            else if (s.attendanceStatus.equalsIgnoreCase("Absent")) {
                System.out.println("Student is absent");
                absent++;
            }
        }

        // Displaying attendance summary
        int totalStudents = studentList.size();

        System.out.println("\n===== ATTENDANCE SUMMARY =====");

        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Present: " + present);
        System.out.println("Total Absent: " + absent);

        // Calculating attendance percentage
        if (totalStudents == 0) {
            System.out.println("No students are there.");
        }
        else {
            double attendancePercentage =
                    ((double) present / totalStudents) * 100;

            System.out.println("Attendance Percentage: "
                    + attendancePercentage + "%");
        }
    }
}
