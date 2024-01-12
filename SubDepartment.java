public class SubDepartment extends Department {
    private int departmentSize;

    // Constructor to initialize departmentSize
    public SubDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    // Implementation of the abstract method
    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of SubDepartment
        SubDepartment subDepartment = new SubDepartment(10);

        // Print the department size
        System.out.println("Department Size: " + subDepartment.getDepartmentSize());
    }
}
