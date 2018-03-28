public class TestStudent {
	public static void main(String[] args) {

		StudentBiz a = new StudentBiz();
		String name = "";
		a.addName(name);
		a.show();
		String name1 = "";
		String newName = "";
		a.revise(name1, newName);
	}
}
