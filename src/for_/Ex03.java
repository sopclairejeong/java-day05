package for_;

public class Ex03 {
	public static void main(String[] args) {
		int i = 1;
		for( ; i < 10 ; i += 2) {
			System.out.println(i);
		}
		System.out.println("--------------- i : " + i);
		for(i = 1 ; i <= 10 ; i++) {
			System.out.println("i : " + i + " => ");
			if(i % 2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
			System.out.println("+++++");
		}
	}
}