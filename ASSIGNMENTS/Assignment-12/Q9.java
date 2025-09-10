// 9. Throws Keyword

// 👉 Write a method readFile(String fileName) that uses FileReader. Declare it with throws IOException and handle it in main().

import java.io.FileReader;
import java.io.IOException;

class Test {
    public void readFile(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);

        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }

        reader.close();
    }

}

class Main {

    public static void main(String[] args) {
        Test t1 = new Test();
        try {
            t1.readFile("exception - handling.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

    }
}