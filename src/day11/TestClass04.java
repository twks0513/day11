package day11;

import java.util.Scanner;

public class TestClass04 {
	Scanner scan = new Scanner(System.in);			
	private int age;
	private String name;
		public void ageChange() { // 만나이
			age-=1;
		}
		public void input() { // 입력
			System.out.print("이름입력 : ");
			name = scan.next();
			System.out.print("나이입력 : ");
			age = scan.nextInt();			
		}
		
		public void print() { // 출력
			ageChange();
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			
		}
}
