import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UnicastSend {
	DatagramSocket ds;
	DatagramPacket dp;
	InetAddress ia; // 192.168.0.101
	public UnicastSend() {
		String str = "Spring Framework, ������ �����ӿ�ũ";
		try {
			// ���� ������ ��
			ds = new DatagramSocket();
			
			//udp����� ������ ������� DatagramPacket�� �����Ͽ� �����Ѵ�.
			byte[] data = str.getBytes();
			ia = InetAddress.getByName("192.168.0.101");
			
			//					   ����������				 �޴���ǻ��
			dp = new DatagramPacket(data, 0, data.length, ia, 12000);
			//�����ϱ�
			ds.send(dp);
			
			System.out.println("���ۿϷ�---- ������");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new UnicastSend();

	}

}
