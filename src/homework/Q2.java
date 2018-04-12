package homework;

import javax.swing.JOptionPane;

public class Q2 {

	public static void main(String[] args) {
		
		
		int a;
		int b;
		int c;
		
		JOptionPane.showMessageDialog(null, "0보다 큰 수를 입력하시오");
		a = Integer.parseInt(JOptionPane.showInputDialog(null));
		b = Integer.parseInt(JOptionPane.showInputDialog(null));
		c = Integer.parseInt(JOptionPane.showInputDialog(null));
		
		if(a%2==0){System.out.println(a);}
		if(b%2==0){System.out.println(b);}
		if(c%2==0){System.out.println(c);}
		
		
		
		}
		
		

	}


