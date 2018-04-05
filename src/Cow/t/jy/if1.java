package Cow.t.jy;

import javax.swing.JOptionPane;

public class if1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Jumsu;
		char Hakjum;
		Jumsu=Integer.parseInt(JOptionPane.showInputDialog("점수 입력:"));
		boolean result = Jumsu>=90;
		//boolean 거짓과 참을 정하는 역활이고 그 판단을 하는 것은 아님
		// 그러니까 내가 일단 말하는게 참이다 라고 광역 선포 하고 나서 나중에 가져다가 씀 일단 보류 광역변수로 주로 활용은 한다
		if (result){Hakjum='A';}
		else if(Jumsu >=80){Hakjum='B';}
		else if(Jumsu >=70){Hakjum='C';}
		else if(Jumsu >=60){Hakjum='D';}
		else {Hakjum='F';}
	System.out.println("니 점수는:"+Hakjum+"이다");	
	}

}
