package ch06;
// 실습문제 4번
import java.util.Scanner;
import java.util.StringTokenizer;

public class AddNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        String str = s.nextLine();
        StringTokenizer st = new StringTokenizer(str,"+");
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken().trim());
        }
        System.out.println("합은 "+sum);
        s.close();
    }
}
