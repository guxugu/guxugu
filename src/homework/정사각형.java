package homework;

import javax.swing.JOptionPane;

public class 정사각형 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		JOptionPane.showMessageDialog(null, "정사각형의 한 변의 길이를 입력하십시오");
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null));
		num2 = num1*num1;
		System.out.println("정사각형의 넓이는"+num2+"입니다");
		
		
		// TODO Auto-generated method stub

	}

}
