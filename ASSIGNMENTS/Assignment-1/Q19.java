class Q19{
    public static void main(String[] args) {
        int cubeEdge = 7;
        int length = 7;
        int breadth = 4;
        int height = 8;
        int volumeCube = cubeEdge * cubeEdge * cubeEdge;
        int volumeCuboid = length * breadth * height;
        System.out.println("Volume of the cube: " + volumeCube );
        System.out.println("Volume of the cuboid: " + volumeCuboid  );
        if (volumeCube > volumeCuboid) {
            System.out.println("The cube has more volume by " + (volumeCube - volumeCuboid) );
        } else if (volumeCuboid > volumeCube) {
            System.out.println("The cuboid has more volume by " + (volumeCuboid - volumeCube) );
        } else {
            System.out.println("Both shapes have the same volume.");
        }
    }
}