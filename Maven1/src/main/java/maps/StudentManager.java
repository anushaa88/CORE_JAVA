// StudentManager.java
package maps;

import java.util.HashMap;

public class StudentManager {
    // Method to get student by name from HashMap
    public static Student getStudentByName(HashMap<String, Student> studentMap, String firstName) {
        // Check if the student with given name exists in the HashMap
        if (studentMap.containsKey(firstName)) {
            // Return the Student object corresponding to the given name
            return studentMap.get(firstName);
        } else {
            // Return null if student not found
            return null;
        }
    }
}
