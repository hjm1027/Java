package as;

class Lader{
	float upperBase, high;
	static float lowerBottom;
	Lader(float x, float y, float h) {
		upperBase = x;
		lowerBottom = y;//��������һ������
		high = h;
	}
	float getLowerBottom() {  return lowerBottom;  }
	void modifyLowerBottom(float b) {   lowerBottom = b;	}
}
public class Sdate {
	public static void main(String args[]) {
	 Lader laderOne = new Lader(3.0f, 10.0f, 20),
        laderTwo = new Lader(2.0f, 3.0f, 10);
	  Lader.lowerBottom = 200; // ͨ���������������
	  System.out.println("laderOne���µ�:" + laderOne.getLowerBottom());
	  System.out.println("laderTwo���µ�:" + laderTwo.getLowerBottom());
        laderTwo. lowerBottom = 60; 
	  //laderTwo.modifyLowerBottom(60); // ͨ��������������
	  System.out.println("laderOne���µ�:" + laderOne.getLowerBottom());
	  System.out.println("laderTwo���µ�:" + laderTwo.getLowerBottom());
	}
}
