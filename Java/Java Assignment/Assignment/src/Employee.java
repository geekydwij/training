public class Employee {
    private String name;
    private int age;
    private String gender;
    private String department;
    private double salary;
    private int yearJoined;

    // Constructors, getters, and setters

    public Employee(String name, int age, String gender, String department, double salary, int yearJoined) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.yearJoined = yearJoined;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearJoined() {
        return yearJoined;
    }
}