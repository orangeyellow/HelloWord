package test;

import java.util.Scanner;

/**
 * ��������Ϸ���£�1-100������
 * @author Administrator
 *
 */

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����һ����1-100���������
		int number = (int)(Math.random() * 100) +1;
		System.out.println(number);
		
		while (true) {
			
			//��������һ������
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			
			if(a > number) {
				System.out.println("��²������"+a+"����");
			}else if (a < number) {
				System.out.println("��²������"+a+"С��");
			}else {
				System.out.println("��²������"+a+"�ͻ�����"+number+"һ��");
				break;
			}
			
		}
	}

}
