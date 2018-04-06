package Cow.t.jy;

public class 증감연산자 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 10;
		b = 20;
		c = 3;
		
		System.out.println("++a : "+(++a));
		//일단 a+1 하고 그것을 출력을 하였음
		System.out.println("a++ : "+(a++));
		//이미 a+1되서 a값이 11인데 먼저 내보내야되서 11 출력하고 그담에 12로 증가 시킴
		System.out.println("c++ : "+(c++));
		//c는 처리 안해서 일단 3내보내고 4로 증가 시킴
		System.out.println("++a+b++ : "+(++a+b++));
		/* for ~ end 문에서는 선연산 후증가 해야된다 일단 계산하고 그담에 증가 ㅇㅋ? 일단 a처리후 a+1 하는거임 그래야
		 a 일 하고 나서 그 다음것을 가져올때 이미 증가된 값을 가져 오는 것임
		*/
		
	}
		
}
