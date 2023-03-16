package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		int inum = 255;
		byte bnum = (byte)inum;
		
		System.out.println(bnum);
		
		double dnum = 3.14;
		int inum2 = (int)dnum;
		
		System.out.println(inum2);
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);	
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum += yourNum;
		System.out.println(myNum);
		
	}

}
 