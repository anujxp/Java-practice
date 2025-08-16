// 32) A	b	C	d	E	f	G	h	…… n terms 

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i = 1;
        char c = 'A';
        char c2 = 'a';
        while (i <= n) {
            if (i % 2 == 0)
                System.out.print(c2+" ");
            else
                System.out.print(c+ " ");
            i++;
            c++;
            c2++;
            
        }
        System.out.println();

    }
}
