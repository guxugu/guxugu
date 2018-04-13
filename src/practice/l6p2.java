package practice;

import javax.swing.JOptionPane;

public class l6p2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 1;
		while(num >0){
			
			num=Integer.parseInt(JOptionPane.showInputDialog(num+"번째 과목 점수 입력하시오"));
			sum = sum+num;
		}
		
		
		System.out.println("시험 점수의 합계는"+sum+"점입니다");

	}
}
