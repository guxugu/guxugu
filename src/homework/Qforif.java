package homework;

import javax.swing.JOptionPane;

public class Qforif {

	public static void main(String[] args) {
		
		int num1;
		JOptionPane.showMessageDialog(null, "10이하의 정수를 입력하시오");
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null));
		
		for(num1=1; num1<10; num1++){
			if(num1%3==0){
				System.out.print("X");
			}
			else {System.out.print(num1);
			}
		}
	}
}
