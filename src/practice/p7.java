package practice;

import javax.swing.JOptionPane;

public class p7 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "원하는 숫자 입력부터 카운트 다운시작");
		int num1;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null));
		while(num1 >0){
			num1 = (num1-1);
			System.out.println(num1);
		}
	}
}
