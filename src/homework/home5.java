package homework;

import javax.swing.JOptionPane;

public class home5 {

	public static void main(String[] args) {
		
		float Tal;
		float Wit;
		float G1;
		float G2;
		
		JOptionPane.showMessageDialog(null, "Ű�� �����Ը� �Է��Ͻÿ�");
		Tal = Float.parseFloat(JOptionPane.showInputDialog("Ű(�Ҽ�������)"));
		Wit = Float.parseFloat(JOptionPane.showInputDialog("������(�Ҽ�������"));
		
		System.out.println("Ű��"+Tal+"��Ƽ�����Դϴ�.");
		System.out.println("�����Դ�"+Wit+"ų�α׷��Դϴ�.");
		
		
		G1=(Tal/100)*(Tal/100)*22;
		G2=Wit/G1*100;
		System.out.println("����� �񸸵�(%)��"+G2+"�Դϴ�");
		
		// TODO Auto-generated method stub

	}

}