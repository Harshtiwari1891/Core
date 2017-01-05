package SampleServer;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class HttpServer extends Thread {
	Socket socket;
	int num;

	public static void main(String args[]) {
		try {
			int i = 0; // ������� �����������

			// ���������� ����� �� ���������, ���� 3128
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(3128, 0, InetAddress.getByName("localhost"));

			System.out.println("Server is started");

			// ������� ����
			while (true) {
				// ��� ������ �����������, ����� ���� ��������� ���������
				// �������
				// � ����� �������������� ����� � ����������� ������� ��
				// ��������
				new HttpServer(i, serverSocket.accept());
				i++;
			}
		} catch (Exception e) {
			System.out.println("init error: " + e);
		} // ����� ����������
	}

	public HttpServer(int num, Socket s) {
		// �������� ������
		this.num = num;
		this.socket = s;

		// � ��������� ����� �������������� ����� (��. �-� run())
		setDaemon(true);
		setPriority(NORM_PRIORITY);
		start();
	}

	public void run() {
		try {
			// �� ������ ������� ���� ����� �������� ������
			InputStream is = socket.getInputStream();
			// � ������ �� - ����� ������ �� ������� � �������
			OutputStream os = socket.getOutputStream();

			// ������ ������ � 64 ���������
			byte buf[] = new byte[64 * 1024];
			// ������ 64�� �� �������, ��������� - ���-�� ������� ��������
			// ������
			int r = is.read(buf);

			// ������ ������, ���������� ���������� �� ������� ����������
			String data = new String(buf, 0, r);

			// ��������� ������ �� ������ ������:
			data = "" + num + ": " + "\n" + data;

			// ������� ������:
			os.write(data.getBytes());

			// ��������� ����������
			socket.close();
		} catch (Exception e) {
			System.out.println("init error: " + e);
		} // ����� ����������
	}
}