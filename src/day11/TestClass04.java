package day11;

import java.util.Scanner;

public class TestClass04 {
	Scanner scan = new Scanner(System.in);			
	private int age;
	private String name;
		public void ageChange() { // ������
			age-=1;
		}
		public void input() { // �Է�
			System.out.print("�̸��Է� : ");
			name = scan.next();
			System.out.print("�����Է� : ");
			age = scan.nextInt();			
		}
		
		public void print() { // ���
			ageChange();
			System.out.println("�̸� : "+name);
			System.out.println("���� : "+age);
			
		}
}
