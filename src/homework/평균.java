package homework;

import javax.swing.JOptionPane;

public class 평균 {

	public static void main(String[] args) {
		
		float num1, num2, num3, num4, num5;
		float Sum;
		float Ave;
		
		JOptionPane.showMessageDialog(null,"과목 1~5의 점수를 정수로 입력하십시오");
		num1 = Float.parseFloat(JOptionPane.showInputDialog("1과목"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("2과목"));
		num3 = Float.parseFloat(JOptionPane.showInputDialog("3과목"));
		num4 = Float.parseFloat(JOptionPane.showInputDialog("4과목"));
		num5 = Float.parseFloat(JOptionPane.showInputDialog("5과목"));
		
		Sum = num1+num2+num3+num4+num5;
		Ave = Sum/5;
		
		System.out.println("5과목 합계는"+(int)Sum+"입니다");
		System.out.println("5과목의 평균은"+Ave+"입니다");
	
		// TODO Auto-generated method stub

	}

}
