package homework;

import javax.swing.JOptionPane;

public class ��� {

	public static void main(String[] args) {
		
		float num1, num2, num3, num4, num5;
		float Sum;
		float Ave;
		
		JOptionPane.showMessageDialog(null,"���� 1~5�� ������ ������ �Է��Ͻʽÿ�");
		num1 = Float.parseFloat(JOptionPane.showInputDialog("1����"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("2����"));
		num3 = Float.parseFloat(JOptionPane.showInputDialog("3����"));
		num4 = Float.parseFloat(JOptionPane.showInputDialog("4����"));
		num5 = Float.parseFloat(JOptionPane.showInputDialog("5����"));
		
		Sum = num1+num2+num3+num4+num5;
		Ave = Sum/5;
		
		System.out.println("5���� �հ��"+(int)Sum+"�Դϴ�");
		System.out.println("5������ �����"+Ave+"�Դϴ�");
	
		// TODO Auto-generated method stub

	}

}
