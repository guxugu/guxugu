package practice;

import javax.swing.JOptionPane;

public class p8 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "���ϴ� ���� �Էº��� ī��Ʈ �ٿ����");
		int num1=0;
		int sum=0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null));
		
		
		for(; num1<10; num1++){
			if(num1%2==0){
				sum = sum+num1;
				System.out.print(num1+"+");
				}
			else if(num1 ==1){
			
		}
		
	}
		System.out.print("="+sum);
}
}