package Sungjuk;

import javax.swing.JOptionPane;

public class Sungjuk2 {

	public static void main(String[] args) {
		Sungjuk rec = new Sungjuk();
		Sungjuk rec2 = new Sungjuk();
		
		rec.Std_num=JOptionPane.showInputDialog("학번");
		rec.Std_name=JOptionPane.showInputDialog("이름");
		rec.Kor=Integer.parseInt(JOptionPane.showInputDialog("국어성적"));
		rec.Eng=Integer.parseInt(JOptionPane.showInputDialog("영어성적"));
		rec.Mat=Integer.parseInt(JOptionPane.showInputDialog("수학성적"));
		System.out.println(rec.Std_num+rec.Std_name+"의 성적입니다.");
		rec.Sum();
		rec.Ave();
	}
}