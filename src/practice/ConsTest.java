package practice;

import javax.swing.JOptionPane;

public class ConsTest {
	private int aa;
	private int bb;
	
	public ConsTest(){
		System.out.println("아반테 기본사양");
	}
	public ConsTest(int a, int b){
		this();
		aa=a;
		bb=b;
		System.out.println("아반테 중옵");
	}
	public static void main(String[] args) {
		try{
		int t = Integer.parseInt(JOptionPane.showInputDialog("외형 옵션 번호"));
		int p = Integer.parseInt(JOptionPane.showInputDialog("내부 옵션 번호"));
		}
		catch(Exception e){
		int	t = null;
		int	p = null;
		
		ConsTest obj =new ConsTest(t,p);
		System.out.println(obj.aa);
		System.out.println(obj.bb);
		}
	}

}
