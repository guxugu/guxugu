package practice;

import javax.swing.JOptionPane;

public class l6p2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 1;
		while(num >0){
			
			num=Integer.parseInt(JOptionPane.showInputDialog(num+"��° ���� ���� �Է��Ͻÿ�"));
			sum = sum+num;
		}
		
		
		System.out.println("���� ������ �հ��"+sum+"���Դϴ�");

	}
}
