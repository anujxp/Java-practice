// 7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.



import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int total = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        int percent = (attended * 100) / total;

        System.out.println("Attendance percentage: " + percent + "%");

        if(percent >= 75) {
            System.out.println("Allowed to sit in exam");
        } else {
            System.out.println("Not allowed to sit in exam");
        }
        sc.close();
    }

}