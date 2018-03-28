public class 简答题6 {
	public static void main(String[] args) {
		Hero a = new Hero();
		a.name = "李小侠";
		a.HP = 300;
		a.show();
		Weapon b = new Weapon();
		b.name = "死神镰刀";
		b.attack = 12;
		b.show();
		Monster c = new Monster();
		c.name = "小龟";
		c.HP = 300;
		c.type = "潜水类";
		c.show();
	}
}
