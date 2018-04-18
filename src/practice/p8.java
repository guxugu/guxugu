package practice;

import javax.swing.JOptionPane;

public class p8 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "원하는 숫자 입력부터 카운트 다운시작");
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