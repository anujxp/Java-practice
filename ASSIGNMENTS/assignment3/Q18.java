import java.util.Scanner;

class Q18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // no. input
        System.out.print("Enter the number of subjects: ");
        int sub = sc.nextInt();
        // sum of all subject
        System.out.print("Enter the sum of all subjects: ");
        double sum = sc.nextDouble();
        // percentage
        double percentage = sum / sub;
        //print
        System.out.print("The percentage are: " + percentage);

        sc.close();

    }
}