package javaexample;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 사용자 입력 받기
        System.out.print("여행지>> ");
        String destination = scanner.nextLine();
        
        System.out.print("인원수>> ");
        int people = scanner.nextInt();
        
        System.out.print("숙박일>> ");
        int days = scanner.nextInt();
        
        System.out.print("1인당 항공료>> ");
        int flightCostPerPerson = scanner.nextInt();
        
        System.out.print("1방 숙박비>> ");
        int roomCostPerNight = scanner.nextInt();
        
        // 방의 개수는 2명당 1방으로 계산
        int roomsNeeded = (people + 1) / 2;
        
        // 총 경비 계산
        int totalFlightCost = people * flightCostPerPerson;
        int totalRoomCost = roomsNeeded * roomCostPerNight * days;
        int totalCost = totalFlightCost + totalRoomCost;
        
        // 결과 출력
        System.out.println(people + "명의 " + destination + " " + days + "박 " + (days + 1) + "일 여행에는 방이 " + roomsNeeded + "개 필요하며 경비는 " + totalCost + "원입니다.");
        
        // Scanner 종료
        scanner.close();
    }
}
