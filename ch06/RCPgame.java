package ch06;
// 실습문제 6번
import java.util.Scanner;

public class RCPgame {
    public static void main(String[] args) {
        final String choice[] = {"가위","바위","보"};
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
            int userChoice = s.nextInt();
            if(userChoice==4){
                System.out.println("게임을 종료합니다...");
                break;
            }
            int comChoice = (int)(Math.random()*3+1);

            System.out.println("사용자 "+choice[userChoice-1]+" : 컴퓨터 "+choice[comChoice-1]);

            switch(userChoice-comChoice){
                case 0: 
                    System.out.println("비겼습니다.");
                    break;
                case -2:
                case 1:
                    System.out.println("사용자가 이겼습니다.");
                    break;
                case -1:
                case 2:
                    System.out.println("사용자가 졌습니다.");
                    break;
                default : 
                    System.out.println("다시 입력하세요.");
            }
        }
        s.close();
    }
}
