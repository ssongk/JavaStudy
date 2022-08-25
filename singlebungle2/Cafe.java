package singlebungle2;

import java.util.HashMap;
import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put("아메리카노",2000);
        hs.put("아이스티 샷 추가",2500);
        hs.put("초코라떼",3000);
        hs.put("아인슈페너",3500);

        Scanner s = new Scanner(System.in);
        System.out.println("아메리카노, 아이스티 샷 추가, 초코라떼, 아인슈페너 있습니다.");
        while(true){
            System.out.print("주문 >> ");
            String input = s.nextLine();
            if(input.equals("그만")){
                break;
            }
            for(String key : hs.keySet()){
                if(key.equals(input)){
                    System.out.println(input+"는 "+hs.get(input)+"원 입니다.");
                    break;
                }
            }
        }
        s.close();
    }
}
