package ch05;

import java.util.Scanner;
// 실습 문제 5번
interface StackInterface{
    int length();
    String pop();
    boolean push(String ob);
}
public class StringStrack implements StackInterface{
    String stack[];
    int index;
    public StringStrack(int capacity){
        stack = new String[capacity];
    }
    public boolean push(String ob){
        if(index==stack.length)
            return false;     
        stack[index++]=ob;
        return true;
    }
    public String pop(){
        if(index==0)
            return null;
        index--;
        return stack[index];
    }
    public int length(){
        return index;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ob[] = new String[5];
        StringStrack st = new StringStrack(5);
        System.out.print(">>");
        for(int i=0;i<5;i++){
            ob[i]=s.next();
            st.push(ob[i]);
        }
        for(int i=0;i<5;i++){
            System.out.print(st.pop()+"\t");
        }
        s.close();
    }
}
