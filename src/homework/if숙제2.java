package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if����2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �Է��ϼ��� 2��");
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		int res1 = Integer.parseInt(str1);
		int res2 = Integer.parseInt(str2);
		
		if (res1==res2) {System.out.println("�� ���ڴ� �����ϴ�");}
		else if (res1>res2) {System.out.println(res1+"��"+res2+"���� Ů�ϴ�");}
		else if (res1<res2) {System.out.println(res1+"��"+res2+"���� �۽��ϴ�");}
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
