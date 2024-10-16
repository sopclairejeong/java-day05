package for_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("반복 횟수 입력");
		int repeat = input.nextInt();
		for(int i = 0 ; i < repeat ; i++) {
			System.out.println(i + ".번 반복");
		}
		System.out.println("다음 문장 실행");
	}

}
