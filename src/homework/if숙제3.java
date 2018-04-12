package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class if숙제3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수를 입력하세요");
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		
		
		if (res<=10) {System.out.println("정답입니다.");}
		else if(res>10) {System.out.println("오답입니다.");}
		
		
		
		
		
		
		
		
		
		


	}

}
