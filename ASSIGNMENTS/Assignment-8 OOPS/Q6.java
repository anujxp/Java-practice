// 6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

class Employee {
    String name;
    String jobTitle;
    int salary;
    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void calculateSalary() {
        salary = 10000;
    }

    public void updateSalary(int newSalary) {
        salary = newSalary;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}
class TestMain{
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Software Engineer", 50000);
        System.out.println("_______________________");
        employee.display();
        employee.calculateSalary();
        System.out.println("_______________________");
        employee.display();
        employee.updateSalary(60000);
        System.out.println("_______________________");
        employee.display();
    }
}
