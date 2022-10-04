
import java.util.List;
import java.util.Scanner;





public class BookStart {
	Scanner scan = new Scanner(System.in);
	BookDAO dao = new BookDAO();
	public BookStart() {
		start();
	}
	public void start() {
		
		do {
			try {	
				String menu = menuShow();
				System.out.print(menu);
				if(menu.equals("1")) { 
					bookList();
				}else if(menu.equals("2")) {
					bookInsert();
				}else if(menu.equals("3")) {
					bookEdit();
				}else if(menu.equals("4")) {
					bookDel(); 
				}else if(menu.equals("5")) {
					bookStop();
				}else if(menu.equals("6")) {
					bookNameSearch();
				}	
			}catch(Exception e) {
				System.out.println("�޴��� �߸��Է��Ͽ����ϴ�.");
				e.printStackTrace();
			}
			
		}while(true);
	}
		public String menuShow() {
		
		System.out.print("�޴�[1.å���, 2.å���, 3.å��������, 4.å����, 5.����, 6.å�˻�]->");
		
		return scan.nextLine();
	}
		//å���
		public void bookList() {
			
			String searchWord = null;
			
			bookPrint(dao.bookSelect(searchWord));
			
		}
		//å ��� ���
		public void bookPrint(List<BookVO> list) {
			System.out.println("\n ------------------------------ å ��� ------------------------------");
			for(int i=0; i<list.size(); i++) {
				BookVO vo = list.get(i);
				
				System.out.printf("%6s %12s %10s %16s %20s\n", vo.getBookno(), vo.getBookName(), vo.getBookwriter(), vo.getPublisher(), vo.getBookdate());
		}
	}
		public void bookInsert() {
			//å���
			BookVO vo = new BookVO();
			System.out.print("å�ڵ带 �Է��ϼ���->"); 
			vo.setBookno(scan.nextLine());
			System.out.print("�������� �Է��ϼ���->");
			vo.setBookName(scan.nextLine());
			System.out.print("���ڸ��� �Է��ϼ���->");
			vo.setBookwriter(scan.nextLine());
			System.out.print("���ǻ���� �Է��ϼ���->");
			vo.setPublisher(scan.nextLine());
			System.out.print("��ġ���� �Է��ϼ���->");
			vo.setBookdate(scan.nextLine()); 
			
			
			int cnt = dao.bookInsert(vo);
			if(cnt>0) {
				System.out.println(vo.getBookName()+"�� ��ϵǾ����ϴ�.");
			}else {
				System.out.println("��Ͻ����Ͽ����ϴ�.");
			}
		}
		//å ��������
		public void bookEdit() {
			BookVO vo = new BookVO();
			System.out.print("������å�ڵ�->");
			
			vo.setBookno(scan.nextLine());
			
			System.out.print("�������׸�[1.���ǻ�, 2.��ġ��]->");
			String editMenu = scan.nextLine();
				if(editMenu.equals("1")) {
					vo.setFieldName("publisher");
					System.out.print("������ ���ǻ�->");
				}else if(editMenu.equals("2")) {
					vo.setFieldName("bookdate");
					System.out.print("������ ��ġ��->");
				}
				vo.setPublisher(scan.nextLine());
				
				int cnt = Integer.parseInt(dao.bookUpdate(vo));
				if(cnt>0) {
					System.out.println(vo.getPublisher()+"���� �����Ǿ����ϴ�.");
				}else {
					System.out.println("���������Ͽ����ϴ�.");
			}
		}
		
		//å����
		public void bookDel() {
			System.out.print("������ å�� �ڵ�->");
			String bookno = (scan.nextLine());
			int result = Integer.parseInt(dao.bookDelete(bookno));
			
				if(result >0) {
					System.out.println(bookno+"å�� �����Ǿ����ϴ�..");
				}else {
					System.out.println(bookno+"å ���� �����Ͽ����ϴ�.");
			}
		}
		//����
		public void bookStop() {
			System.exit(0);
		}
		//å �˻�
		public void bookNameSearch() {
			System.out.print("�˻��� å��->");
			String searchword = scan.nextLine();
			
			
			//���
			System.out.println(searchword);
			bookPrint(dao.bookSelect(searchword));
		}
		
	
		public static void main(String[] args) {
			new BookStart();
	
		}

}
