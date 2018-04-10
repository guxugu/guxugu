package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if숙제2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수를 입력하세요 2번");
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		int res1 = Integer.parseInt(str1);
		int res2 = Integer.parseInt(str2);
		
		if (res1==res2) {System.out.println("두 숫자는 같습니다");}
		else if (res1>res2) {System.out.println(res1+"가"+res2+"보다 큽니다");}
		else if (res1<res2) {System.out.println(res1+"가"+res2+"보다 작습니다");}
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
