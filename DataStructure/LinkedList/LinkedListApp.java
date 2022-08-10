package DataStructure.LinkedList;

import java.util.Scanner;

public class LinkedListApp {
    public static void main(String[] args) {
        int index = -1;
        int head = 0;
        int tail = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("List size >> ");
        int size = s.nextInt();
        ListNode list[] = new ListNode[size];
        while(true){
            System.out.print("1.insert 2.remove 3.print 4.exit >> ");
            int cmd = s.nextInt();
            
            if(cmd==4) break;
            else if(cmd==1){
                if(index==size){
                    System.out.println("List is full!");
                }
                else index++;

                System.out.print("insert data >> ");
                String data = s.next();
                System.out.print("select link >> ");
                int link = s.nextInt();
                list[index] = new ListNode(data, link);
                list[index].insert(data,link);
            }
            else if(cmd==2){
                System.out.print("select data >> ");
                int num = s.nextInt();
                if(head==tail){
                    head = -1;
                    index = -1;
                    list[num].remove();
                }
                if(num==head){
                    head = num+1;
                    list[num].remove();
                }
                else if(num==tail){
                    index--;
                    tail--;
                    list[num].remove(list[num-1]);
                }
                else{
                    list[num].remove(list[num-1],list[num+1]);
                }                
            }
            else if(cmd==3){
                if(index==-1){
                    System.out.println("List is null!");
                }
                System.out.println("---------------------------------");
                System.out.println("<Linked List Info>");
                System.out.print("data(index)");
                for(int i=0;i<index+1;i++){
                    if(list[i].isNotEmpty())
                        System.out.print("\t"+list[i].printData()+"("+i+")");
                }
                System.out.println();
                System.out.print("link\t");
                for(int i=0;i<index+1;i++){
                    if(list[i].isLiked())
                        System.out.print("\t"+list[i].printLink());
                }
                System.out.println();
                System.out.println("---------------------------------");

            }
            else System.out.println("다시 입력해주세요");
        }
        s.close();
    }
}
