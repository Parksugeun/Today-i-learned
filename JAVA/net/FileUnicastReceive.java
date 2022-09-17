import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class FileUnicastReceive {
	DatagramSocket ds;
	DatagramPacket dp;
	FileOutputStream fos;
	public FileUnicastReceive() {
		
	}
	public void receiveStart() {
		try {
			ds = new DatagramSocket(15000);
			byte[] receiveData = new byte[512];
			dp = new DatagramPacket(receiveData, receiveData.length);
			
			while(true) {
				//���۹ޱ� ���
				System.out.println("���۹ޱ� �����....");
				ds.receive(dp);//���۹ޱ�
				
				byte[] receive = dp.getData();
				int byteCount = dp.getLength();//���۹��� byte��
				
				String receiveStr = new String(receive, 0, byteCount);// [*$@File&]01/jfif
				if(byteCount>=10 && receiveStr.substring(0,10).equals("[*$@File&]")) {//���ϸ��� ���۵Ǿ���.
					fos = new FileOutputStream(new File("c://testFolder", receiveStr.substring(10)));// 
					System.out.println("���ϻ�����...--->"+ receiveStr);
				}else if(byteCount>=10 && receiveStr.equals("[*%&$end4]")) {
					fos.close();
					ds.close();
					System.out.println("���Ϸ� ����Ǿ����ϴ�....");
					break;
				}else {//���ϳ���
					fos.write(receive,0, byteCount);
					
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileUnicastReceive().receiveStart();

	}

}
