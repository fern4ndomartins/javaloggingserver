import java.util.Scanner;
import java.io.*;
public class Main {
    static String user;
    static String password;

    public static String readData() {
        try {
            File data = new File("data.txt");
            if (data.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            System.out.println("errorr");
        }
        return "blaaa";
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("type in user name: ");
        user = scn.nextLine();
        System.out.println("type in password: ");
        password = scn.nextLine();
        readData();

        System.out.println("you logged in successfully.");
        db.po();
    }
}

class db {
    private static String dbfile;
    private static String user;
    public static String openFile(String filename) {
        dbfile = filename;
        File file = new File(dbfile);
        return "asasa";
    }
    public static String readFrom() {}
    public static String writeTo() {}
}