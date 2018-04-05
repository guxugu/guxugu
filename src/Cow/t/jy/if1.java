package Cow.t.jy;

import javax.swing.JOptionPane;

public class if1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Jumsu;
		char Hakjum;
		Jumsu=Integer.parseInt(JOptionPane.showInputDialog("점수 입력:"));
		boolean result = Jumsu>=90;
		//boolean 일단 보류 광역변수로 주로 활용은 한다
		if (result){Hakjum='A';}
		else if(Jumsu >=80){Hakjum='B';}
		else if(Jumsu >=70){Hakjum='C';}
		else if(Jumsu >=60){Hakjum='D';}
		else {Hakjum='F';}
	System.out.println("니 점수는:"+Hakjum+"이다");	
	}

}
