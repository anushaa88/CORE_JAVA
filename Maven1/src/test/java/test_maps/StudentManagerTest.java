
package test_maps;

import maps.Student;
import maps.StudentManager;

import java.util.HashMap;

public class StudentManagerTest {
    public static void main(String[] args) {
        // Create HashMap to store students
        HashMap<String, Student> studentMap = new HashMap<>();

        // Add some student objects to the HashMap
        studentMap.put("John", new Student("John", "Doe", 3.8));
        studentMap.put("Alice", new Student("Alice", "Smith", 3.9));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.5));
        studentMap.put("Emma", new Student("Emma", "Brown", 4.0));
        studentMap.put("Michael", new Student("Michael", "Wilson", 3.7));

        // Test getting a student by name
        testGetStudentByName(studentMap, "Bob");
        testGetStudentByName(studentMap, "Alice");
        testGetStudentByName(studentMap, "Unknown"); // Testing with a name not in the map
    }

    // Method to test getting a student by name
    private static void testGetStudentByName(HashMap<String, Student> studentMap, String firstName) {
        Student foundStudent = StudentManager.getStudentByName(studentMap, firstName);

        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent);
        } else {
            System.out.println("Student with name " + firstName + " not found.");
        }
    }
}
