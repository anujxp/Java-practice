// 9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.
import java.time.LocalDate;
import java.util.Date;
 class Employee{
    private String name;
    private int salary;
    private LocalDate hirDate ;
    private Date date = 
    public void  displayDate(){
        System.out.println(this.localdate);
    }

}
class Test{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.displayDate();
    }
}