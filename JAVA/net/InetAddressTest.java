

import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
	}
	public void start() {
		try {
		// ip�� ���õ� ��ü�� �����Ѵ�.
		// ����ǻ���� ���������� ������
		InetAddress ia = InetAddress.getLocalHost();
		String ip = ia.getHostAddress();// ����ǻ�� ip
		String name = ia.getHostName();// ��ǻ���̸� �Ǵ� url �ּ�
		System.out.println("ia.address->"+ ip);
		System.out.println("ia.name->"+ name);
		
		//������ �̿��� inetAddress�� ������
		InetAddress ia2 = InetAddress.getByName("www.nate.com");
		System.out.println("ia2.address->"+ ia2.getHostAddress());
		System.out.println("ia2.name->"+ ia2.getHostName());
		
		// naver
		
		InetAddress ia3 = InetAddress.getByName("120.50.131.112");
		System.out.println("ia3.address->"+ ia3.getHostAddress());
		System.out.println("ia3.name->"+ ia3.getHostName());
		System.out.println("----------------------");
		
		//�������� netAddress��ü ������
		InetAddress[] ia4 = InetAddress.getAllByName("www.seoul.go.kr");
		for(InetAddress i:ia4) {
			System.out.println("ia4.address->"+ i.getHostAddress());
			System.out.println("ia4.address->"+ i.getHostName());
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		
	public static void main(String[] args) {
		InetAddressTest it = new InetAddressTest();
		it.start();
	}
	
 }

