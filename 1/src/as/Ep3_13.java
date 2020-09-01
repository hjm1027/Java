package as;

class Ep3_13 {
	private int money;
	Ep3_13() {
		money = 2000;
	}
	private int getMoney() {
		return money;
	}
	public static void main(String args[]) {
		Ep3_13 exa = new Ep3_13();
		exa.money = 3000;
		int m = exa.getMoney();
		System.out.println("money=" + m);
	}
}
