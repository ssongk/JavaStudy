package DataStructure.Stack;

import java.util.Scanner;

public class StackApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Stack Size? >> ");
        int stackSize = s.nextInt();
        ArrayStack arrStack = new ArrayStack(stackSize);
        while(true){
            System.out.print("명령 입력(1.push, 2.pop 3.peek 4.exit) >> ");
            int cmd = s.nextInt();
            if(cmd==4){
                System.out.println("exit..");
                break;
            }
            else if(cmd==3)
                arrStack.peek();
            else if(cmd==2){
                arrStack.pop();
                arrStack.printStack();
            }
            else if(cmd==1){
                System.out.print("문자열 입력 >> ");
                arrStack.push(s.next());
                arrStack.printStack();
            }
            else
            System.out.println("다시 입력하세요");
        }
        s.close();
    }
}
