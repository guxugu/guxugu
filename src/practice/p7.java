package practice;

import javax.swing.JOptionPane;

public class p7 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "���ϴ� ���� �Էº��� ī��Ʈ �ٿ����");
		int num1;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null));
		while(num1 >0){
			num1 = (num1-1);
			System.out.println(num1);
		}
	}
}
