package singlebungle3;

import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(); 
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >> ");
        while(true){
            int tmp = s.nextInt();
            if(tmp==-1){
                break;
            }
            v.add(tmp);
        }
        int max = 0;
        for(int i=0;i<v.size();i++){
            if(v.get(i)>max)
                max = v.get(i);
        }
        System.out.println("가장 큰 수는 "+max);
        s.close();
    }
}
