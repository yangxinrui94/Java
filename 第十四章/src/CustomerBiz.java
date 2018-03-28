public class CustomerBiz {
	String[] names = new String[4];

	void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}

	}
	void show(){
		System.out.println("*********************************\n");
		System.out.println("\t\t客户姓名列表：");
		System.out.println("*********************************\n");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
		}
	}
}
