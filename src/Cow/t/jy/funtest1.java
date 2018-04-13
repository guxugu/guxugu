package Cow.t.jy;

import javax.swing.JOptionPane;

public class funtest1 {

	public static void multi(int a, int b){
		System.out.println("곱은"+(a*b)+"입니다.");
	}
	
	public static void sum(int a, int b){
		System.out.println("합은"+(a+b)+"입니다.");
	}
	
	public static void minus(int a, int b){
		System.out.println("빼기는"+(a-b)+"입니다.");
	}
	
	public static void main(String[] args){
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		//minus(num1, num2);
		//multi(num1, num2);

		funtest1 Obj = new funtest1();
		Obj.multi(num1,num2);

		// 오브젝트로 명명하여 메소드를 직접 가져올 수가 있는데 static으로 된건 static 으로 불러올 수 있는데 아닌것들은 이런식으로 가져올 수 있음 
		// 즉 변수 기입을 줄일 수가 있기 때문에 쓰는거임 ㅇㅋ?
		//접근지정자(접근제한자)public 접근제한 없음, protected 패캐지 내에서는, private 같은 클래스 내에서만
		//
		
		
		
		
		
	}
}