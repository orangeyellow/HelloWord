package test;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int max;
		// System.out.println("������һ��int���͵�����");
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��int���͵�����");
		a = scan.nextInt();
		System.out.println("���������int���͵�����");
		b = scan.nextInt();
		max = (a > b) ? a : b;
		System.out.println("a:" + a + "b:" + b + "���ֵmax:" + max);
	}

}
