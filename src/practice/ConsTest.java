package practice;

import javax.swing.JOptionPane;

public class ConsTest {
	private int aa;
	private int bb;
	
	public ConsTest(){
		System.out.println("아반테 기본사양");
	}
	public ConsTest(int a, int b){
		aa=a;
		bb=b;
		System.out.println("아반테 중옵");
	}
	public static void main(String[] args) {
		
		int t = 0;
		int p = 0;
		ConsTest obj;
		
		try{
			 t = Integer.parseInt(JOptionPane.showInputDialog("외형 옵션 번호"));
			 p = Integer.parseInt(JOptionPane.showInputDialog("내부 옵션 번호"));
		}
		catch(Exception e){
			t = -1;// string 은 ""
			p = -1;
		}
		
		if(t > 0 && p>0){
		  obj =new ConsTest(t,p);
		}else{
			obj =new ConsTest();
		}
	}

}
