import java.util.Scanner;


public class �����6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
		System.out.print("�������Ա����<��/�գ�00/00>");
		String birth = input.next();
		if (birth.indexOf("/")!=2 && birth.length()!=5) {
			System.out.println("������ʽ�������!\n");
		}else {
			System.out.println("�û�Ա�����ǣ�"+birth+"\n");
			break;
		}	
		}
		while (true) {
			System.out.print("�������Ա����<6~10λ>��");
			String pwd = input.next();
			if (pwd.length()<6 || pwd.length()>10) {
				System.out.println("������ʽ�������"+"\n");
			}else {
				System.out.println("�û�Ա�������ǣ�"+pwd+"\n");
				break;
			}
		}
	}
}
