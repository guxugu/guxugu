package practice;

import javax.swing.JOptionPane;

public class ConsTest {
	private int aa;
	private int bb;
	
	public ConsTest(){
		System.out.println("�ƹ��� �⺻���");
	}
	public ConsTest(int a, int b){
		aa=a;
		bb=b;
		System.out.println("�ƹ��� �߿�");
	}
	public static void main(String[] args) {
		
		int t = 0;
		int p = 0;
		ConsTest obj;
		
		try{
			 t = Integer.parseInt(JOptionPane.showInputDialog("���� �ɼ� ��ȣ"));
			 p = Integer.parseInt(JOptionPane.showInputDialog("���� �ɼ� ��ȣ"));
		}
		catch(Exception e){
			t = -1;// string �� ""
			p = -1;
		}
		
		if(t > 0 && p>0){
		  obj =new ConsTest(t,p);
		}else{
			obj =new ConsTest();
		}
	}

}
