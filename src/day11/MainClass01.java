package day11;

public class MainClass01 {

	public static void main(String[] args) {
		
			/*
			if(true) {
				int num = 100;
				System.out.println("if : "+num);
				num=200;
			}
			System.out.println("main : "+num);
			*/
		TestClass01 t1 = new TestClass01();
		int num = t1.test01();
		t1.test02(num);

	}

}
