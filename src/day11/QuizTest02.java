package day11;

import java.util.Scanner;

public class QuizTest02 {
	private int num,high,usernum;	
	private int cnt=0, playcnt;
	private boolean check = true;
	public int random() {
		num = (int)(Math.random()*99)+1;
		System.out.println("��ǻ�� ���� : "+num);
		check =true;
		playcnt =0;	
		
		return num;
	}
	public void input() {
		Scanner scan = new Scanner(System.in);	
		System.out.println("=== START ===");
		while(check) {
		System.out.print("Input Number -->");
		usernum = scan.nextInt();
		checknum();
		}
		
		
	}
	public void checknum() {
		if(usernum>num) {
			
			playcnt++;
			System.out.println("===Down===");
		}else if(usernum<num){
			
			playcnt++;
			System.out.println("===U  P===");
		}else {
			cnt++;
			playcnt++;
			System.out.println(playcnt+"ȸ ���� ������ϴ�!!!");
			check =false;
			highScore();
		}
		
	}
	public void highScore() {
		if(cnt ==1) {
			System.out.println("�ְ����� �����ϼ̽��ϴ�.");
			high = playcnt;
		}
		if(playcnt<high) {
			System.out.println("�ְ����� �����ϼ̽��ϴ�.");
			high = playcnt;
		}
	}
	public void printHigh() {
		if(high ==0) {
			System.out.println("������ �������� �ʾҽ��ϴ�.");
		}else {
			System.out.println("�ְ� ������ "+high+"ȸ �Դϴ�!!!");
		}
		
	}
	
}
