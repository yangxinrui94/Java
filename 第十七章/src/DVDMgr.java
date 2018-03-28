import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DVDMgr {
	public long charge(String dstr1, String dstr2) {
		long charge = 0;
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d1 = sd.parse(dstr1);
			Date d2 = sd.parse(dstr2);
			charge = (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return charge;
	}

	Scanner input = new Scanner(System.in);
	DVDSet dvd = new DVDSet();

	void initial() {

		dvd.name[0] = "罗马假日";
		dvd.state[0] = 0;
		dvd.date[0] = "2013-7-1";
		dvd.name[1] = "风声鹤唳";
		dvd.state[1] = 1;
		dvd.name[2] = "浪漫满屋";
		dvd.state[2] = 1;
	}

	void add() {
		System.out.print("请输入DVD名称：");
		String newName = input.next();
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i] == null) {
				dvd.name[i] = newName;
				dvd.state[i] = 1;
				break;
			}
		}
		System.out.println("新增《" + newName + "》成功！");
	}

	void search() {
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i] == null) {
				break;
			} else if (dvd.state[i] == 0) {
				System.out.println((i + 1) + "\t已借出\t" + "《" + dvd.name[i]
						+ "》\t" + dvd.date[i]);
			} else if (dvd.state[i] == 1) {
				System.out.println((i + 1) + "\t可借\t" + "《" + dvd.name[i]
						+ "》\t" + dvd.date[i]);
			}
		}
	}

	void delete() {
		System.out.print("请输入Dvd的名称：");
		String name = input.next();
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i] == null) {
				break;
			}
			if (dvd.name[i].equals(name)) {
				if (dvd.state[i] == 0) { // 已借出
					System.out.println("《" + name + "》已借出，删除失败！");
				} else {
					while (dvd.name[i + 1] != null) {
						dvd.name[i] = dvd.name[i + 1];
						dvd.state[i] = dvd.state[i + 1];
						dvd.date[i] = dvd.date[i + 1];
						i++;
					}
					dvd.name[i] = null;
					dvd.state[i] = 0;
					System.out.println("删除成功！");
				}
				return;
			}

		}
		System.out.println("《" + name + "》不存在，删除失败！");

	}

	void lend() {
		System.out.print("请输入DVD名称：");
		String Lname = input.next();
		System.out.print("请输入借出日期(年-月-日)：");
		String date = input.next();
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i] == null) {
				System.out.println("没有找到匹配信息！");
				break;
			} else if (dvd.name[i].equals(Lname) && dvd.state[i] == 1) {
				System.out.println("借出《" + Lname + "》成功！");
				dvd.date[i] = date;
				dvd.state[i] = 0;
				break;

			} else if (dvd.name[i].equals(Lname) && dvd.state[i] == 0) {
				System.out.println("《" + Lname + "》已借出。。。");
				break;
			}
		}
	}

	void returnDvd() {
		System.out.print("请输入DVD名称：");
		String Rname = input.next();
		System.out.print("请输入归还日期(年-月-日)：");
		String Rdate = input.next();
		String a = "";
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i].equals(Rname)&&dvd.state[i]==0) {
				dvd.state[i]=1;
				a = dvd.date[i];
				dvd.date[i] = null;
				break;
			} else {
				System.out.println("输入错误！");
				returnMain();
			}
		}
		System.out.println("归还《" + Rname + "》成功！");
		System.out.println("借出日期为：" + a);
		System.out.println("归还日期为：" + Rdate);
		System.out.println("应付租金(元)：" + charge(a, Rdate));
	}

	void returnMain() {
		System.out.print("输入0返回：");
		if (input.nextInt() == 0) {
			startMenu();
		} else {
			System.out.println("输入错误，异常终止！");
		}
	}

	void startMenu() {
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("------------------------------------------\n");
		System.out.println("1.新增 DVD");
		System.out.println("2.查看 DVD");
		System.out.println("3.删除 DVD");
		System.out.println("4.借出 DVD");
		System.out.println("5.归还 DVD");
		System.out.println("6.退          出");
		System.out.println("------------------------------------------\n");
		System.out.print("请选择：");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("--->新增DVD\n");
			add();
			System.out.println("***************************");
			returnMain();
			break;
		case 2:
			System.out.println("--->查看 DVD\n");
			search();
			System.out.println("***************************");
			returnMain();
			break;
		case 3:
			System.out.println("--->删除 DVD\n");
			delete();
			System.out.println("***************************");
			returnMain();
			break;
		case 4:
			System.out.println("--->借出 DVD\n");
			lend();
			System.out.println("***************************");
			returnMain();
			break;
		case 5:
			System.out.println("--->归还 DVD\n");
			returnDvd();
			System.out.println("***************************");
			returnMain();
			break;
		case 6:
			System.out.println("\n谢谢使用！");
			break;
		}
	}
}
