package javaexample;
import java.util.Scanner;

public class problem2 {
	public static void main(String[]args) {
		//Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		//생일 입력 받기
		System.out.print("생일 입력 하세요>>");
		int birthDate = scanner.nextInt();
		
		//년, 월, 일을 분리
		int year = birthDate / 10000;
		int month = (birthDate % 10000) / 100;
		int day = birthDate % 100;
		
		//결과 출력
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		//scanner 종료
		scanner.close();
	}
}
