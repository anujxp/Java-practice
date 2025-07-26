// Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?
	import java.util.Scanner;

class Q18
{
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lenght of a garden: ");
        int l = sc.nextInt();
        System.out.println("breath of a garden : ");
        int b = sc.nextInt();
        int daycount = 10 * (2 * (l + b));
        System.out.println("Distance covered in a day : " + daycount);

    }
}