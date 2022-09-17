

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverSocketTest {
	ServerSocket ss;
	public SeverSocketTest() {
		try {
			//������ ����� �� �ִ� SeverSocket�� port��ȣ�� �����Ͽ� ��ü�� �����Ѵ�.
			ss = new ServerSocket(10000);
			while(true) {
			//Ŭ���̾�Ʈ ������ accept()�޼ҵ尡 ��ٸ���
			//������ �ϸ� Ŭ���̾�Ʈ ������ �ִ� Socket��ü�� �������ش�.
			System.out.println("Server start.... ���Ӵ����");
			Socket s = ss.accept();
			
			InetAddress ia = s.getInetAddress();
			System.out.println(ia.getHostAddress()+"->Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			
			//�������� Ŭ���̾�Ʈ���� ���ں�����
			OutputStream os = s.getOutputStream();// 1byte
			OutputStreamWriter osw = new OutputStreamWriter(os);// 1 char
			PrintWriter pw = new PrintWriter(osw);
			
			pw.println("����->Ŭ���̾�Ʈ����->������ ���ӵǾ����ϴ�.");
			pw.flush();
			
			//Ŭ���̾�Ʈ�� ���� ���� �ޱ�
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String txt = br.readLine();
			System.out.println("server�� ���� ���� ==>"+ txt);
			}	
	}catch(IOException ie) {
		ie.printStackTrace();
		}
		System.out.println("server ����.....");
	}

	public static void main(String[] args) {
		new SeverSocketTest();

	}

}
