package practice;

import javax.swing.JOptionPane;

public class L8Q5_2 {

	public static void main(String[] args) {
		L8Q5 p1 = new L8Q5();
		p1.setX(Integer.parseInt(JOptionPane.showInputDialog("X��ǥ")));
		p1.setY(Integer.parseInt(JOptionPane.showInputDialog("Y��ǥ")));
		
		System.out.println(p1.x+"."+p1.y);
//(�Ű��������� �־�ߵǼ� �ʿ���)
		//tostring() �� ��Ʈ���� ��������
	}

}
