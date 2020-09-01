package as;

class Lader{
	float upperBase, high;
	static float lowerBottom;
	Lader(float x, float y, float h) {
		upperBase = x;
		lowerBottom = y;//和上面是一个变量
		high = h;
	}
	float getLowerBottom() {  return lowerBottom;  }
	void modifyLowerBottom(float b) {   lowerBottom = b;	}
}
public class Sdate {
	public static void main(String args[]) {
	 Lader laderOne = new Lader(3.0f, 10.0f, 20),
        laderTwo = new Lader(2.0f, 3.0f, 10);
	  Lader.lowerBottom = 200; // 通过类名操作类变量
	  System.out.println("laderOne的下底:" + laderOne.getLowerBottom());
	  System.out.println("laderTwo的下底:" + laderTwo.getLowerBottom());
        laderTwo. lowerBottom = 60; 
	  //laderTwo.modifyLowerBottom(60); // 通过对象操作类变量
	  System.out.println("laderOne的下底:" + laderOne.getLowerBottom());
	  System.out.println("laderTwo的下底:" + laderTwo.getLowerBottom());
	}
}
