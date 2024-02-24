import java.io.*;
import javax.swing.JOptionPane;

public class Main {
    static String user;
    static String password;
    public static void main(String[] args) {
        int i = JOptionPane.showConfirmDialog(null, "create new account?");
        if (i == 2) {
            System.exit(0);
        }
        user = JOptionPane.showInputDialog("Type username");
        password = JOptionPane.showInputDialog("Type password");
//        db.dbLog();
    }
}

class db {
    public static void server() {

    }
    private static final String dbfile = "data.txt";
    public static boolean dbSign(String user, String passwd) {
        File file = new File(dbfile);
        return false;
    }
    public static boolean dbLog(String user, String passwd) {
        File file = new File(dbfile);
        return true;
    }
    private static String readFrom(String dbName) {
        return "";
    }
    private static void writeTo(String dbName, String text) {

    }

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
}