package practice;

//import basic.Incremental;

public class PracClass2 {
	public void postInc(){
		int num = 1;
		num++;
		System.out.println(num);
		System.out.println(num);
	}
	public static void main(String[] args){
		PracClass2 incremental = new PracClass2();
		incremental.postInc();
	}
}
