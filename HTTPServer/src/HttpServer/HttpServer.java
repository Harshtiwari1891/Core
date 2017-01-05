/**
 * 
 */
package HttpServer;

/**
 * @author Типичный Олег 29 июля 2016 г. 2016
 * HttpServer.java
 * http://localhost:8080
 */
import java.net.ServerSocket;
import java.net.Socket;


public class HttpServer {

    public static void main(String[] args) throws Throwable {
        @SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket s = ss.accept();
            System.err.println("Client accepted");
            new Thread(new SocketProcessor(s)).start();
        }
    }
}
