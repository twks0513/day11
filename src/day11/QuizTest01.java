package day11;

import java.util.Scanner;

public class QuizTest01 {
	public String name,grade;
	public int kor,eng,math,sum;
	public double avg;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 점수 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수 입력 : ");
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
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총 점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("등급 : "+grade);
	}
}
