package echo.ex01;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("ip", 10001));
		
		System.out.println("<서버시작>");
		System.out.println("===================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		Socket socket = serverSocket.accept();
		
		System.out.println("[클라이언트가 연결되었습니다.]");
		
		
		
		socket.close();
		serverSocket.close();
		

	}

}
