import java.util.*;

class Student implements Comparable<Student> {
    
    // Instance variables
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }

    // 🔑 Implementation of Comparable (Defines NATURAL Sorting Order: By ID)
    @Override
    public int compareTo(Student other) {
        // Returning the difference sorts by ID in ascending order.
        // This is the default/natural way this object can be sorted.
        return this.id - other.id; 
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Zoya", 22));
        students.add(new Student(101, "Amit", 25));
        students.add(new Student(102, "Ravi", 24));

        System.out.println("--- Before Sorting (Insertion Order) ---");
        students.forEach(System.out::println); 
        
        // 🚀 Sorting: Calls the compareTo() method in the Student class.
        Collections.sort(students); 
        
        System.out.println("\n--- After Sorting (Natural Order: By ID) ---");
        students.forEach(System.out::println); 
    }
}
class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Zoya", 22));
        students.add(new Student(101, "Amit", 25));
        students.add(new Student(102, "Ravi", 24));

        System.out.println("--- Before Sorting (Insertion Order) ---");
        students.forEach(System.out::println); 

        // 🔑 Implementation of Comparator (Custom Sorting Order: By Name)
        // Lambda expression provides the compare(s1, s2) implementation.
        Comparator<Student> sortByName = (s1, s2) -> s1.name.compareTo(s2.name);
        
        // 🚀 Sorting: We pass the List AND the custom Comparator object.
        Collections.sort(students, sortByName); 
        
        System.out.println("\n--- After Sorting (Custom Order: By Name) ---");
        students.forEach(System.out::println); 
    }
}
