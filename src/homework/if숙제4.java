package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if숙제4 {

	public static void main(String[] args) throws IOException {
		System.out.println("정수를 입력하시오");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int res = Integer.parseInt(str);
		
		
		switch (res) {
		
		case 1:
			System.out.println("당신 등급은 브론즈");
			
		case 2:
			System.out.println("당신 등급은 실버");
			
		case 3:
			System.out.println("당신 등급은 골드");

		case 4:
			System.out.println("당신 등급은 플레티넘");
			
		case 5:
			System.out.println("당신 등급은 다이아");
		
		}
		
		
		
		

	}

}
