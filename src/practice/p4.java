package practice;

import javax.swing.JOptionPane;

public class p4 {

	public int getMax(int a, int b){
		int result =0 ;
		if(a>b){
			result = a;
		}
		else if(a<b){
			result =b;

		}
		return result;
	}

	public int getMin(int a, int b){
		int result = 0;
		if(a>b){
			result = b;
		}
		else if(a<b){
			result =a;

		}
		return result;
	}


	public static void main(String[] args) {

		int num1, num2;
		int max, min;
		JOptionPane.showMessageDialog(null, "정수 두가지를 입력하시오");
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null));
		
		p4 Obj = new p4();
		max = Obj.getMax(num1, num2);
		min = Obj.getMin(num1, num2);
		
		System.out.println("큰값은"+max+"작은값은"+min);
	}
}
