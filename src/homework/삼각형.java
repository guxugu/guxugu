package homework;

import javax.swing.JOptionPane;

public class �ﰢ�� {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		float num3;
		
		JOptionPane.showMessageDialog(null, "�ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�");
		num1 = Float.parseFloat(JOptionPane.showInputDialog("�غ�"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("����"));
		
		num3 = (num1*num2)/2;
		System.out.println("�ﰢ���� ���̴�"+(float)num3+"�Դϴ�");
		
		
		// TODO Auto-generated method stub

	}

}
