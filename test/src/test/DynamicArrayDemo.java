package test;

import java.io.LineNumberInputStream;
import java.util.ArrayList;

/**
 * ��̬�����Ӧ��
 */
public class DynamicArrayDemo {

	public static void main(String[] args) {

		/** 
		 * ���嶯̬����
		 */
		
		/**
		 * 
		 */
		int[] arr = new int[3];

		/** 
		 * ����ĵ�ֵַ
		 */
		System.out.println(arr.toString());

		System.out.println("------------------");

		/** 
		 * ����ĳ���
		 */
		System.out.println(arr.length);

		System.out.println("------------------");

		/**
		 *  ����������Ĭ��ֵ
		 */
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println("------------------");

		int[] arr2 = new int[3];
		arr2 = arr;
		arr[0] = 100;
		arr[2] = 200;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2.toString());
		
		System.out.println("------------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.toString());
		

	}

}