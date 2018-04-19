package practice;

import javax.swing.JOptionPane;

public class L7Q4 {

	public static void main(String[] args) {
		int man = Integer.parseInt(JOptionPane.showInputDialog("몇명의 성적을 입력하세요?"));
		int max=0;
		int arr[]= new int [500];
		for(int i=0; i<man; i++){
		 arr[i]=Integer.parseInt(JOptionPane.showInputDialog("점수"));
		 System.out.println(i+"번째 사람의 점수는"+arr[i]+"입니다.");
		 }
		for(int i=0; i<man; i++){if(arr[i]>max){
			max=arr[i];
		}
		}
		System.out.println("가장 높은 점수는"+max+"입니다");
	}

}
