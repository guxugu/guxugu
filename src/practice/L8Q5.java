package practice;

public class L8Q5 {
		int x;
		int y;
		
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int in_x){
		this.x = in_x;
		//this = ³ªÀÇ ¶æ
	}
	public void setY(int in_y){
		this.y = in_y;
	}
	public L8Q5(){
	this.x=0;
	this.y=0;
	}
	public L8Q5(int px, int py){
	this.x=px;
	this.y=py;
	}
	
	public static void main(String[] args) {
	}

}
