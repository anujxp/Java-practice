
import java.io.*;
import java.util.Scanner;

class FileS {

    public void start() {
        System.out.println("what do you want :");
        System.out.println(" choose  option");
        System.out.println("1 for create file ");
        System.out.println("2 for read  file ");
        System.out.println("3 for write file ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.print("Enter file name :");
            String name = sc.next();
            createFile(name);
        }
        if (n == 2) {
            System.out.println("Enter file name to read :");
            String name = sc.next();
            readFile(name);
        }
        if (n == 3) {
            System.out.println("Enter file name to write :");
            String name = sc.next();
            writeFile(name);
        }
    }

    public void createFile(String name) {

        File f = new File(name);
        if (f.exists()) {
            System.out.println("file already exists ");
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getParentFile());
            // f.getAbsolutePath();
           

        } else {
            try {
                f.createNewFile();
                System.out.println("file created named as : " + f.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void readFile(String name) {

        try {
            FileInputStream fin = new FileInputStream(name);
            StringBuffer data = new StringBuffer("");
            
            while (true) {
                int x = fin.read();
                if (x == -1)
                    break;
                data.append((char) x);

            }
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

    public void writeFile(String name){
        try{
            FileOutputStream fout = new FileOutputStream(name);
            Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter some text");
			String data = sc.nextLine();


            byte[] b = data.getBytes();
            fout.write(b);
            System.out.println("Operation success....");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}

class FileSystem {
    public static void main(String[] args) {
        FileS f1 = new FileS();
        f1.start();
        
    }
}