package day11;

import java.util.Scanner;

public class QuizMain02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		QuizTest02 q2 = new QuizTest02();
		while(true) {
			System.out.println("===== UP & Down Game =====");
			System.out.println("   1. 게임시작");
			System.out.println("   2. 게임전적");
			System.out.println("   3. 게임종료");
			System.out.print(" >>>> ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				q2.random();
				q2.input();
			}else if(choice == 2) {
				q2.printHigh();
			}else if(choice == 3) {
				System.out.println("게임을 종료합니다");
				break;
			}
		}
		
	}

}
