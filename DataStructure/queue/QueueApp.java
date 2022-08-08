package DataStructure.queue;

import java.util.Scanner;

public class QueueApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Queue Size? >> ");
        int queueSize = s.nextInt();
        QueueList myql = new QueueList(queueSize);
        while(true){
            System.out.print("명령 입력(1.push, 2.remove 3.peek 4.exit) >> ");
            int cmd = s.nextInt();
            if(cmd==4){
                System.out.println("exit..");
                break;
            }
            else if(cmd==3)
                myql.peek();
            else if(cmd==2){
                myql.remove();
                myql.print();
            }
            else if(cmd==1){
                System.out.print("문자열 입력 >> ");
                myql.add(s.next());
                myql.print();
            }
            else
            System.out.println("다시 입력하세요");
        }
        s.close();
    }
}