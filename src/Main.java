import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import javax.swing.JOptionPane;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
public class Main {
    static String user;
    static String password;
    public static void main(String[] args) throws IOException {
        int i = JOptionPane.showConfirmDialog(null, "create new account?");
        if (i == 2) {System.exit(0);}
        if (i == 1) {
            user = JOptionPane.showInputDialog("Type username");
            password = JOptionPane.showInputDialog("Type password");
        } else {
            user = JOptionPane.showInputDialog("Type username");
            password = JOptionPane.showInputDialog("Type password");
        }
        db.server();
        URL url = new URL(String.format("http://127.0.0.1:8008/%s/%s", user, password));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("accept", "application/json");
        InputStream responseStream = con.getInputStream();
        con.disconnect();
    }
}

class db {
    private static final String dbfile = "data.txt";
    public static void server() throws IOException{
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8008), 0);
        server.createContext("/", new someHttpHandler());
        server.setExecutor(threadPoolExecutor);
        server.start();
        System.out.println("server is running...");
    }

    static class someHttpHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            if ((t.getRequestMethod()).equalsIgnoreCase("GET")) {
                String request = t.getRequestURI().toString();
                System.out.println(request);
            }

            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    private static void dbSign(String user, String passwd) {
        File file = new File(dbfile);
    }
    private static boolean dbLog(String user, String passwd) {
        File file = new File(dbfile);
        return true;
    }
    private static String readFrom(String dbName) {
        return "";
    }
    private static void writeTo(String dbName, String text) {

    }

}




