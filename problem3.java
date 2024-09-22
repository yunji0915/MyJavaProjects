package javaexample;

import java.util.Scanner;

public class problem3{
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 가격 정의
        int priceTteokbokki = 2000;
        int priceKimmari = 1000;
        int priceJjolmyeon = 3000;
        
        // 주문 인분 수 입력 받기
        System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
        System.out.print("떡볶이 몇 인분>> ");
        int tteokbokki = scanner.nextInt();
        System.out.print("김말이 몇 인분>> ");
        int kimmari = scanner.nextInt();
        System.out.print("쫄면 몇 인분>> ");
        int jjolmyeon = scanner.nextInt();
        
        // 총 금액 계산
        int total = (tteokbokki * priceTteokbokki) + (kimmari * priceKimmari) + (jjolmyeon * priceJjolmyeon);
        
        // 결과 출력
        System.out.println("전체 금액은 " + total + "원입니다.");
        
        // Scanner 종료
        scanner.close();
    }
}
