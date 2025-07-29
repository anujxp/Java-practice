// How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?
import java.util.Scanner;

class Q24 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the wall length of Cuboid : ");
        int wl = sc.nextInt();
        System.out.println("Enter the wall Width of Cuboid : ");
        int wb = sc.nextInt();
        System.out.println("Enter the wall Height of Cuboid : ");
        int wh = sc.nextInt();

        System.out.println("Enter the brick length of Cuboid : ");
        int bl = sc.nextInt();
        System.out.println("Enter the brick Width of Cuboid : ");
        int bw = sc.nextInt();
        System.out.println("Enter the brick Height of Cuboid : ");
        int bh = sc.nextInt();

        int wv = wl * wb * wh;
        int bv = bl * bh * bw;

        int price = (wv / bv) / 1000 + 900;

        System.out.println("Cost to buil wall: " + price);
    }
}
