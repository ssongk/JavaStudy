package singlebungle3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.print("이름을 입력하세요 >> ");
            al.add(s.nextLine());
        }
        
        for(int i=0;i<4;i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();

        String max = al.get(0);
        for(int i=1;i<4;i++){
            if(max.length()<al.get(i).length())
                max = al.get(i);
        }
        System.out.print("가장 긴 이름은 : "+max);
        
        s.close();
    }
}
