package as;

class E4 {
	private int money;
	 E4() {
		money = 2000;
		}
	 int getMoney() {
		return money;
			}
	int setMoney(int x){
		money=x;
		return money;
		}
}
class E3{
	public static void main(String args[]) {
		E4 exa = new E4();
		int m = exa.getMoney(); 
		System.out.println(m);
		exa.setMoney(10);
		m = exa.getMoney(); 
		System.out.println(m);		
	}
}
