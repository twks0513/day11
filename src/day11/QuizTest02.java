package day11;

import java.util.Scanner;

public class QuizTest02 {
	private int num,high,usernum;	
	private int cnt=0, playcnt;
	private boolean check = true;
	public int random() {
		num = (int)(Math.random()*99)+1;
		System.out.println("컴퓨터 숫자 : "+num);
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
			System.out.println(playcnt+"회 만에 맞췄습니다!!!");
			check =false;
			highScore();
		}
		
	}
	public void highScore() {
		if(cnt ==1) {
			System.out.println("최고기록을 갱신하셨습니다.");
			high = playcnt;
		}
		if(playcnt<high) {
			System.out.println("최고기록을 갱신하셨습니다.");
			high = playcnt;
		}
	}
	public void printHigh() {
		if(high ==0) {
			System.out.println("게임을 시작하지 않았습니다.");
		}else {
			System.out.println("최고 점수는 "+high+"회 입니다!!!");
		}
		
	}
	
}
