package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if����1 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������ �Է��ϼ���");
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if (res%2==0) {System.out.println(res +"�� ¦���Դϴ�");}
		else if (res%2==1){System.out.println(res +"�� Ȧ���Դϴ�");}
		}
		
		
		
	}
