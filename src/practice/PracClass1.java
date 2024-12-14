package practice;

//import practice.Divisible5_3;

public class PracClass1 {
	void printDivisible5_3(int startRange, int endRange){
		System.out.println("Numbers divisible by 5 and 3:");
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0 && num%3==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		PracClass1 divisible5_3 = new PracClass1();
		divisible5_3.printDivisible5_3(5,40);
	}
}
