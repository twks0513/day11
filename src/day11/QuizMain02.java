package day11;

import java.util.Scanner;

public class QuizMain02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		QuizTest02 q2 = new QuizTest02();
		while(true) {
			System.out.println("===== UP & Down Game =====");
			System.out.println("   1. ���ӽ���");
			System.out.println("   2. ��������");
			System.out.println("   3. ��������");
			System.out.print(" >>>> ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				q2.random();
				q2.input();
			}else if(choice == 2) {
				q2.printHigh();
			}else if(choice == 3) {
				System.out.println("������ �����մϴ�");
				break;
			}
		}
		
	}

}
