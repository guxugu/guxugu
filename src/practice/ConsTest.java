package practice;

import javax.swing.JOptionPane;

public class ConsTest {
	private int aa;
	private int bb;
	
	public ConsTest(){
		System.out.println("�ƹ��� �⺻���");
	}
	public ConsTest(int a, int b){
		this();
		aa=a;
		bb=b;
		System.out.println("�ƹ��� �߿�");
	}
	public static void main(String[] args) {
		try{
		int t = Integer.parseInt(JOptionPane.showInputDialog("���� �ɼ� ��ȣ"));
		int p = Integer.parseInt(JOptionPane.showInputDialog("���� �ɼ� ��ȣ"));
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
