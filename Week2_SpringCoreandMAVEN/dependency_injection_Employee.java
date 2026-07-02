public class Employee {

    private String name;

    // Constructor Injection
    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
    }
}
