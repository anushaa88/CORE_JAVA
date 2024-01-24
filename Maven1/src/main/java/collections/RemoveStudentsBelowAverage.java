package collections;

import java.util.ArrayList;

public class RemoveStudentsBelowAverage {

    public void removeBelowAverageGPA(ArrayList<Student> studentList) {
        // Calculate average GPA
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.gpa;
        }
        double averageGPA = studentList.isEmpty() ? 0 : totalGPA / studentList.size();

        // Remove students with GPA below average
        studentList.removeIf(student -> student.gpa < averageGPA);
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anu", "Salvatore", 3.5));
        students.add(new Student("Janu", "Forbes", 3.2));
        students.add(new Student("Niha", "Bennet", 3.8));

        RemoveStudentsBelowAverage remover = new RemoveStudentsBelowAverage();

        System.out.println("Before removal:");
        printStudents(students);

        remover.removeBelowAverageGPA(students);

        System.out.println("\nAfter removal:");
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.firstName + " " + student.lastName + ", GPA: " + student.gpa);
        }
    }
}