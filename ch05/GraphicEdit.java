package ch05;
// 실습 문제 6번
import java.util.Scanner;

public class GraphicEdit {
    Scanner s;
    int index;
    String shape[];
    public GraphicEdit(){
        s = new Scanner(System.in);
        shape = new String[5];
    }
    public void run(){
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int i = s.nextInt();
            if(i==4){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch(i){
                case 1: input(); break;
                case 2: drop(); break;
                case 3: show(); break;
                default: System.out.println("다시 입력하세요.");
            }
        }
    }
    public void input(){
        if(index==shape.length){
            System.out.println("입력할 수 없습니다.");
            return;
        }
        System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
        int i = s.nextInt();
        switch(i){
            case 1: shape[index++]="Line"; break;
            case 2: shape[index++]="Rect"; break;
            case 3: shape[index++]="Circle"; break;
            default: System.out.println("다시 입력하세요.");
        }    
    }
    public void drop(){
        System.out.print("삭제할 도형의 위치 >> ");
        int i = s.nextInt();
        if(index<i||index==0){
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        shape[index--]="";
    }
    public void show(){
        for(int i=0;i<index;i++){
            System.out.println(shape[i]);
        }
    }
    public static void main(String[] args) {
        GraphicEdit ge = new GraphicEdit();
        ge.run();
    }
}
