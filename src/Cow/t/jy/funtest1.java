package Cow.t.jy;

import javax.swing.JOptionPane;

public class funtest1 {

	public static void multi(int a, int b){
		System.out.println("����"+(a*b)+"�Դϴ�.");
	}
	
	public static void sum(int a, int b){
		System.out.println("����"+(a+b)+"�Դϴ�.");
	}
	
	public static void minus(int a, int b){
		System.out.println("�����"+(a-b)+"�Դϴ�.");
	}
	
	public static void main(String[] args){
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		//minus(num1, num2);
		//multi(num1, num2);

		funtest1 Obj = new funtest1();
		Obj.multi(num1,num2);

		// ������Ʈ�� ����Ͽ� �޼ҵ带 ���� ������ ���� �ִµ� static���� �Ȱ� static ���� �ҷ��� �� �ִµ� �ƴѰ͵��� �̷������� ������ �� ���� 
		// �� ���� ������ ���� ���� �ֱ� ������ ���°��� ����?
		//����������(����������)public �������� ����, protected ��ĳ�� ��������, private ���� Ŭ���� ��������
		//
		
		
		
		
		
	}
}