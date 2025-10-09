/*
Employee Management System 👨‍💼👩‍💼

Abstract class Employee:

id, name, salary fields

abstract method calculateSalary()

concrete method showDetails()

Subclasses:

FullTimeEmployee (salary = fixed monthly)

PartTimeEmployee (salary = hourly * rate)

Intern (stipend based)

Interface BonusEligible with method giveBonus().

Only FullTimeEmployee and PartTimeEmployee should implement BonusEligible.

In main class, create employees and calculate salary + bonus.
*/

abstract class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract int calculateSalary();
    void showDetails(){
        System.out.println("-----------------------------------------");
        System.out.println("Id :" + this.getId()+"\nName : "+this.getName()+"\nsalary : "+ this.getSalary());
        System.out.println("-----------------------------------------");
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

interface BonusEligible {
 void giveBonus(double bonus);
}

class FullTimeEmployee extends Employee implements BonusEligible{

    public FullTimeEmployee(int id, String name, int monthlysalary) {
        super(id, name);
        this.setSalary(monthlysalary);
    }

    @Override
    int calculateSalary() {
        return this.getSalary();
    }

    @Override
     public void giveBonus(double bonus) {
       this.setSalary(this.getSalary()+ (int)(this.getSalary()*bonus/100));
    }

}
class PartTimeEmployee extends Employee implements BonusEligible{
    private int workingHour;
    private int rate;
    public PartTimeEmployee(int id, String name,int workingHour,int rate) {
        super(id, name);
        this.workingHour = workingHour;
        this.rate = rate ;
    }

    @Override
    int calculateSalary() {
        this.setSalary(workingHour * rate);
        return getSalary();
    }
    @Override
    public void giveBonus(double bonus) {
       this.setSalary(this.getSalary()+ (int)(this.getSalary()*bonus/100));
    }


}
class Intern extends Employee{
    private int stipend;

    public Intern(int id, String name, int stipend ) {
        super(id, name);
        this.stipend = stipend;
    }

    @Override
    int calculateSalary() {
        this.setSalary(stipend);
       return this.getSalary(); 
    }
}

class Main{
    public static void main(String[] args) {
        
        FullTimeEmployee e1 = new FullTimeEmployee(1, "anuj", 22000);
        e1.calculateSalary();
        e1.giveBonus(4);
        e1.showDetails();
         PartTimeEmployee e2 =  new PartTimeEmployee(2, "harshita", 17, 100);
        e2.calculateSalary();
        e2.giveBonus(4);
        e2.showDetails();
        Employee e3 = new Intern(3, "saksham", 24000);
        e3.calculateSalary();
        e3.showDetails();
        
        
    }
}