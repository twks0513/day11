package day11;

import java.util.Scanner;

public class QuizTest01 {
	public String name,grade;
	public int kor,eng,math,sum;
	public double avg;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("���� ���� �Է� : ");
		kor = scan.nextInt();
		System.out.print("���� ���� �Է� : ");
		eng = scan.nextInt();
		System.out.print("���� ���� �Է� : ");
		math = scan.nextInt();
	}
	public void op() {
		sum = kor+eng+math;
		avg = sum/3;
		if(avg>=90) {
			grade="A";
		}else if(avg>=80) {
			grade = "B";
		}else {
			grade="C";
		}
	}
	public void print() {
		op();
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("�� �� : "+sum);
		System.out.println("��� : "+avg);
		System.out.println("��� : "+grade);
	}
}
