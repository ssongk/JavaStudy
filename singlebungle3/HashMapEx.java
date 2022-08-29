package singlebungle3;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("apple", "사과");
        map.put("love", "사랑");
        map.put("baby", "아기");

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("찾고 싶은 단어는? >> ");
            String str = s.nextLine();
            if(str.equals("exit")){
                System.out.println("\n 종료합니다.");
                break;
            }
            if(map.get(str)==null)
                System.out.println(str+"는 없는 단어입니다.");
            else
                System.out.println(map.get(str));
        }
        s.close();
    }
}
