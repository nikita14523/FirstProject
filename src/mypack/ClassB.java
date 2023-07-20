package mypack;

import java.util.Arrays;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b = new int[5];
		
		b[0] = 100;
		b[1] = 200;
		b[2] = 300;
		b[3] = 400;
		b[4] = 500;
		
		System.out.println(b[1]);
		
		System.out.println(Arrays.toString(b));
		
		int[] p = {40, 30, 50, 80, 70};
		System.out.println(Arrays.toString(p));
		
	}

}
