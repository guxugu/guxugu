package Cow.t.jy;

import javax.swing.JOptionPane;

public class if1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Jumsu;
		char Hakjum;
		Jumsu=Integer.parseInt(JOptionPane.showInputDialog("���� �Է�:"));
		boolean result = Jumsu>=90;
		//boolean ������ ���� ���ϴ� ��Ȱ�̰� �� �Ǵ��� �ϴ� ���� �ƴ�
		// �׷��ϱ� ���� �ϴ� ���ϴ°� ���̴� ��� ���� ���� �ϰ� ���� ���߿� �����ٰ� �� �ϴ� ���� ���������� �ַ� Ȱ���� �Ѵ�
		if (result){Hakjum='A';}
		else if(Jumsu >=80){Hakjum='B';}
		else if(Jumsu >=70){Hakjum='C';}
		else if(Jumsu >=60){Hakjum='D';}
		else {Hakjum='F';}
	System.out.println("�� ������:"+Hakjum+"�̴�");	
	}

}
