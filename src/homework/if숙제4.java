package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if����4 {

	public static void main(String[] args) throws IOException {
		System.out.println("������ �Է��Ͻÿ�");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int res = Integer.parseInt(str);
		
		
		switch (res) {
		
		case 1:
			System.out.println("��� ����� �����");
			
		case 2:
			System.out.println("��� ����� �ǹ�");
			
		case 3:
			System.out.println("��� ����� ���");

		case 4:
			System.out.println("��� ����� �÷�Ƽ��");
			
		case 5:
			System.out.println("��� ����� ���̾�");
		
		}
		
		
		
		

	}

}
