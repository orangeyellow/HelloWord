package test;

/*
 * if���
 */
public class ifdemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;

		if (a == b) {
			System.out.println("if���ִ���ˣ�");
		} else if (a >= b) {
			System.out.println("����if���ִ���ˣ�");

		} else {
			System.out.println("���");
		}

		switch (1) {
		case 1: {
			System.out.println("switch1");
			System.out.println("switch2");
			break;
		}
		default:
			System.out.println("switch3");
			break;
		}
	}

}
