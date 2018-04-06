package homework;

import javax.swing.JOptionPane;

public class home5 {

	public static void main(String[] args) {
		
		float Tal;
		float Wit;
		float G1;
		float G2;	
		
		JOptionPane.showMessageDialog(null, "키와 몸무게를 입력하시오");
		Tal = Float.parseFloat(JOptionPane.showInputDialog("키(소숫점까지)"));
		Wit = Float.parseFloat(JOptionPane.showInputDialog("몸무게(소숫점까지"));
		
		
		System.out.println("키는"+Tal+"센티미터입니다.");
		System.out.println("몸무게는"+Wit+"킬로그램입니다.");
		G1=(Tal/100)*(Tal/100)*22;
		G2=Wit/G1*100;
		System.out.println("당신의 비만도(%)는"+G2+"입니다");
		if(G2 >=130){System.out.println("과비만입니다");}
		else if (G2 >=120){System.out.println("중비만입니다");}
		else if (G2 >=110){System.out.println("중비만입니다");}
		else if (G2 >=100){System.out.println("과체중입니다");}
		else if (G2 >=90){System.out.println("정상입니다");}
		// TODO Auto-generated method stub

	}

}
