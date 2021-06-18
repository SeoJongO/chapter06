package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
//import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket();

		System.out.println("<클라이언트 시작>");
		System.out.println("==================================");
		System.out.println("[서버에 연결을 요청합니다.]");

		socket.connect(new InetSocketAddress("192.168.55.226", 10001));

		System.out.println("[서버에 연결되었습니다.]");

		// 보내기용
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		// 받기용
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		// 보내기
		// 스캐너
//		Scanner sc = new Scanner(System.in);
		// 스캐너 스트림
		InputStream in = System.in;
		InputStreamReader sisr = new InputStreamReader(in);
		BufferedReader sbr = new BufferedReader(sisr);
		
		while (true) {
//			String str = sc.nextLine();
			String str = sbr.readLine();

			bw.write(str);
			if ("/q".equals(str)) {
				System.out.println("[접속 종료되었습니다.]");
				break;
			}
			bw.newLine();
			bw.flush();

			String reMsg = br.readLine();
			System.out.println("Server:[" + reMsg + "]");

		}

		System.out.println("===================================");
		
		OutputStream out = System.out;
		OutputStreamWriter sosw = new OutputStreamWriter(out);
		BufferedWriter sbw = new BufferedWriter(sosw);
		
		sbw.write("<클라이언트 종료>");
		sbw.newLine();
		sbw.flush();
		
		sbw.close();
//		sc.close();
		br.close();
		bw.close();
		socket.close();

	}

}
