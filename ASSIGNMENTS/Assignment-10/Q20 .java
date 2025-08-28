import java.util.Scanner;
class Tile {
    private double edgeLength;


    public Tile(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }
}

class Floor {
    private double length;
    private double width;

  
    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public int totalTiles(Tile tile) {
        double tileEdge = tile.getEdgeLength();
        double tileArea = tileEdge * tileEdge;
        double floorArea = length * width;

        return (int) Math.ceil(floorArea / tileArea);
    }
}


 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter floor length: ");
        double floorLength = scanner.nextDouble();

        System.out.print("Enter floor width: ");
        double floorWidth = scanner.nextDouble();


        System.out.print("Enter tile edge length: ");
        double tileEdge = scanner.nextDouble();

        Floor floor = new Floor(floorLength, floorWidth);
        Tile tile = new Tile(tileEdge);

    
        int totalTiles = floor.totalTiles(tile);
        System.out.println("Total number of tiles needed: " + totalTiles);

        scanner.close();
    }
}
