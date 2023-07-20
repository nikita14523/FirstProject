package mypack;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No.");
		int a = sc.nextInt();
		if(a/2==0)
		{
			System.out.println("a is even no. ");
		}
		else
		{
			System.out.println("a is odd no.");
		}
	}

}
