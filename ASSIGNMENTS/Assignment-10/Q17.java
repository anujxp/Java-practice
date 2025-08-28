class Employee {
    private int empNo;
    private double salary;

    private static int totalEmployees = 0;
    private static double totalSalary = 0;

    public Employee(double salary) {
        totalEmployees++;
        this.empNo = totalEmployees;
        this.salary = salary;
        totalSalary += salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public double getSalary() {
        return salary;
    }

    public static void displayTotals() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary of all employees: " + totalSalary);
    }

    public void display() {
        System.out.println("Employee No: " + empNo + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(5000);
        Employee e2 = new Employee(7000);
        Employee e3 = new Employee(6000);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayTotals();
    }
}
