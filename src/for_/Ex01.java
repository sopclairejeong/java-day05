package for_;
/*
 F11 : 디버깅 시작 모드
 F6 : 한 줄씩 실행(메소드 건너뜀)
 F7 : 한 줄씩 실행(메소드로 이동)
 F8 : 다음 브레이크 포인터로 이동
 */
public class Ex01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum : " + sum);	
	}
}