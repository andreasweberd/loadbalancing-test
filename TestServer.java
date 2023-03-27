import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class TestServer {

    public static void main(String[] args) throws Exception {

        if(args.length==0){
            System.out.println("Usage: java -cp . TestServer 8080");
            return;
        }

        int port = Integer.parseInt(args[0]);
        final HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new WebRequestHandler(port));
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}