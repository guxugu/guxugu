package Sungjuk;

public class Sungjuk {

	public String Std_num;
	public String Std_name;
	public int Kor, Eng, Mat;
	int t;
	
	
	public int Sum(){
		System.out.println("�հ��"+(Kor+Eng+Mat)+"�Դϴ�.");
		t = Kor+Eng+Mat;
		return t;
	}
	public int Ave(){
		System.out.println("�����"+(t/3)+"�Դϴ�.");
		return t/3;
	}
}

