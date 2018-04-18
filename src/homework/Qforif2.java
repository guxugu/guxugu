package homework;

import javax.swing.JOptionPane;

public class Qforif2 {

	public static void main(String[] args) {
		int num1;
		String str;
		int num2;
		int cnt =0;

		str= JOptionPane.showInputDialog("몇번 입력하시겠습니까?");
		num1 = Integer.parseInt(str);
		
		for(int i=1;i<=num1;i++) {
			num2=Integer.parseInt(JOptionPane.showInputDialog(null));
			if(num2%2==0) {cnt = cnt+1;}
		}
		System.out.println(cnt);
	}

}
