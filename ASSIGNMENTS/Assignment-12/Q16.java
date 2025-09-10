// 6. Student Management System

// You are fetching student data from a database. If the record is not found:

// Will you return null or throw a RecordNotFoundException?

// Which approach is better and why?
class Student {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}


class Main {
    public static void main(String[] args) {
        
        Student[] s = new Student[5];
        try{
            s[1].getName();

        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    
    
}