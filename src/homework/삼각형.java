package homework;

import javax.swing.JOptionPane;

public class 삼각형 {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		float num3;
		
		JOptionPane.showMessageDialog(null, "삼각형의 밑변과 높이를 입력하십시오");
		num1 = Float.parseFloat(JOptionPane.showInputDialog("밑변"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("높이"));
		
		num3 = (num1*num2)/2;
		System.out.println("삼각형의 넓이는"+(float)num3+"입니다");
		
		
		// TODO Auto-generated method stub

	}

}
