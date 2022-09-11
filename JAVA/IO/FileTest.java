package basic06_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		
	}
	public void start() {
		try {
		// ����̺�, ����, ���Ͽ� ������ ������ ����ϱ� ���ؼ��� File��ü�� �����Ͽ��� �Ѵ�.
		/*
			File(File parent, String child)
			File(String parent, String child)
		
			File(String pathname)
		*/
		File f1 = new File("C://"); // C://  -> \n \n \
		File f2 = new File("D://dev/student");
		File f3 = new File("D://dev/Test.java");
	
		File f4 = new File(f2, "Test.java");
		File f5 = new File("c:/dev","Test.java");
		
		//��� �Ǵ� ���� ���� ����, ������ true, ������ false
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		// ���� ����
		if(!f2.exists()) {
			if(f2.mkdir()) {// mkdir(), mkdirs()
				System.out.println("������ �����Ǿ����ϴ�.");
			}else {
				System.out.println("�������� �����Ͽ����ϴ�.");
			}
			
		}
		//���ϻ���
		if(!f4.exists()) {
			if(f4.createNewFile()) { // ���� true ���� false
				System.out.println("���ϻ�����");
			}else {
				System.out.println("���ϻ�������");
			}
		}
		
		//������ ������¥
		long lastDate = f3.lastModified();
		Calendar date = Calendar.getInstance(); 
		date.setTimeInMillis(lastDate);
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String lastDateStr = fmt.format(lastDate);
		System.out.println("������������->"+ lastDateStr);
		
		// Ư������̺꿡 �ִ� ������ ���ϸ���� ���Ѵ�.
		File[] files = f1.listFiles();
		// getName() : ���ϸ�
		// getParent() : ����̺��+����
		// getPath(), getAbsolutePath() : ����̺��+����+���ϸ�
		
		for(File f : files) {
			if(f.isDirectory()) {// ���丮���� Ȯ��
				if(f.isHidden()) {
					System.out.println(f.getPath()+ "[��������]");
				}else {
					System.out.println(f.getPath()+"[����]");
				}
				System.out.println(f.getPath()+"[����]");
			}else if(f.isFile()) {// �������� Ȯ��
				if(f.isHidden()) {
					System.out.println(f.getPath()+"[��������]");
				}else {
				System.out.println(f.getPath()+"[����]");
				}
			}
		  }
			// ����̺� ���
			File drive[] = File.listRoots();
			for(File f:drive) {
				System.out.println(f.getPath());
			}
			
			//������ ũ�� (byte)
			long fileSize = f3.length();
			System.out.println("fileSize=>"+ fileSize);
			
			//���ϻ���
			boolean boo =f3.delete();
			System.out.println(boo);
		}catch(IOException ie) {
		  ie.printStackTrace();
	  }
	}
	public static void main(String[] args) {
		new FileTest().start();

	}

}
