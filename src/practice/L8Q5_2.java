package practice;

import javax.swing.JOptionPane;

public class L8Q5_2 {

	public static void main(String[] args) {
		L8Q5 p1 = new L8Q5();
		p1.setX(Integer.parseInt(JOptionPane.showInputDialog("X좌표")));
		p1.setY(Integer.parseInt(JOptionPane.showInputDialog("Y좌표")));
		
		System.out.println(p1.x+"."+p1.y);
//(매개변수값을 넣어야되서 필요함)
		//tostring() 은 스트링을 선언해줌
	}

}
