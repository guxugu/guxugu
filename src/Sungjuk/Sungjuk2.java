package Sungjuk;

import javax.swing.JOptionPane;

public class Sungjuk2 {

	public static void main(String[] args) {
		Sungjuk rec = new Sungjuk();
		Sungjuk rec2 = new Sungjuk();
		
		rec.Std_num=JOptionPane.showInputDialog("�й�");
		rec.Std_name=JOptionPane.showInputDialog("�̸�");
		rec.Kor=Integer.parseInt(JOptionPane.showInputDialog("�����"));
		rec.Eng=Integer.parseInt(JOptionPane.showInputDialog("�����"));
		rec.Mat=Integer.parseInt(JOptionPane.showInputDialog("���м���"));
		System.out.println(rec.Std_num+rec.Std_name+"�� �����Դϴ�.");
		rec.Sum();
		rec.Ave();
	}
}