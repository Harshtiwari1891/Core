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
			int i = 0; // счётчик подключений

			// привинтить сокет на локалхост, порт 3128
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(3128, 0, InetAddress.getByName("localhost"));

			System.out.println("Server is started");

			// слушаем порт
			while (true) {
				// ждём нового подключения, после чего запускаем обработку
				// клиента
				// в новый вычислительный поток и увеличиваем счётчик на
				// единичку
				new HttpServer(i, serverSocket.accept());
				i++;
			}
		} catch (Exception e) {
			System.out.println("init error: " + e);
		} // вывод исключений
	}

	public HttpServer(int num, Socket s) {
		// копируем данные
		this.num = num;
		this.socket = s;

		// и запускаем новый вычислительный поток (см. ф-ю run())
		setDaemon(true);
		setPriority(NORM_PRIORITY);
		start();
	}

	public void run() {
		try {
			// из сокета клиента берём поток входящих данных
			InputStream is = socket.getInputStream();
			// и оттуда же - поток данных от сервера к клиенту
			OutputStream os = socket.getOutputStream();

			// буффер данных в 64 килобайта
			byte buf[] = new byte[64 * 1024];
			// читаем 64кб от клиента, результат - кол-во реально принятых
			// данных
			int r = is.read(buf);

			// создаём строку, содержащую полученную от клиента информацию
			String data = new String(buf, 0, r);

			// добавляем данные об адресе сокета:
			data = "" + num + ": " + "\n" + data;

			// выводим данные:
			os.write(data.getBytes());

			// завершаем соединение
			socket.close();
		} catch (Exception e) {
			System.out.println("init error: " + e);
		} // вывод исключений
	}
}