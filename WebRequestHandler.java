import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

class WebRequestHandler implements HttpHandler {
    private final int port;

    WebRequestHandler(int port) {
        this.port = port;
    }

    @Override
    public void handle(HttpExchange t) throws IOException {
        String response = "This is the response of TestServer at port " + port + ": " + new Date();
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
        System.out.println("Content served: " + response);
    }
}
