package javaexample;
import java.util.Scanner;

public class problem1{

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		//달러당 원화 환율
		int rate = 1200;
		
		//사용자로부터 달러 입력 받기
		System.out.print("$1 = 1200원입니다. 달러를 입력하세요>>");
		int dollar = scanner.nextInt();
		
		//원화로 계산
		int won = dollar * rate;
		
		// 결과 출력
		System.out.println("$" + dollar + "는 " + won + "원입니다.");
		
		//scanner 종료
		scanner.close();
	}

}
