package practice;

import javax.swing.JOptionPane;

public class L7Q4 {

	public static void main(String[] args) {
		int man = Integer.parseInt(JOptionPane.showInputDialog("����� ������ �Է��ϼ���?"));
		int max=0;
		int arr[]= new int [500];
		for(int i=0; i<man; i++){
		 arr[i]=Integer.parseInt(JOptionPane.showInputDialog("����"));
		 System.out.println(i+"��° ����� ������"+arr[i]+"�Դϴ�.");
		 }
		for(int i=0; i<man; i++){if(arr[i]>max){
			max=arr[i];
		}
		}
		System.out.println("���� ���� ������"+max+"�Դϴ�");
	}

}
