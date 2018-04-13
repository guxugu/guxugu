package practice;

import javax.swing.JOptionPane;

public class p3 {

	public static void main(String[] args) {

		int max, min;
		int num1, num2;

		JOptionPane.showMessageDialog(null, "정수 2개를 입력하시오");
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null));

		if(num1>num2){

			max = num1;
			min = num2;

		}
		else{

			max = num2; min=num1;

		}


		System.out.println("최대값은"+max+"최소값은"+min+"입니다");





		// TODO Auto-generated method stub

	}

}
