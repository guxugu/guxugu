package Sungjuk;

public class Sungjuk {

	public String Std_num;
	public String Std_name;
	public int Kor, Eng, Mat;
	int t;
	
	
	public int Sum(){
		System.out.println("합계는"+(Kor+Eng+Mat)+"입니다.");
		t = Kor+Eng+Mat;
		return t;
	}
	public int Ave(){
		System.out.println("평균은"+(t/3)+"입니다.");
		return t/3;
	}
}

