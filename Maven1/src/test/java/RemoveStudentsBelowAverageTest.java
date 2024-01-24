import collections.Student;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import collections.RemoveStudentsBelowAverage;

public class RemoveStudentsBelowAverageTest {

    @Test
    public void testRemoveBelowAverageGPA() {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Salvatore", 3.5));
        studentList.add(new Student("Janu", "Forbes", 3.2));
        studentList.add(new Student("Niha", "Bennet", 3.8));

        // Create an instance of the class to test
        RemoveStudentsBelowAverage remover = new RemoveStudentsBelowAverage();

        // Test removing students with GPA below average
        remover.removeBelowAverageGPA(studentList);

        // Verify the remaining students
        assertEquals(2, studentList.size());
        assertEquals("John", studentList.get(0).firstName);
    }
}