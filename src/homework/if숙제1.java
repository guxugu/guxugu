package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if숙제1 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		System.out.println("정수를 입력하세요");
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if (res%2==0) {System.out.println(res +"는 짝수입니다");}
		else if (res%2==1){System.out.println(res +"는 홀수입니다");}
		}
		
		
		
	}
