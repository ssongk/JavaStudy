package singlebungle;

import java.util.StringTokenizer;

public class String1 {
    private static String1 initcap(String1 str) {
        String1 data = "";
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            String1 temp = st.nextToken();
            temp = temp.toUpperCase().substring(0,1)+temp.substring(1);
            data += (temp + " ");
            temp = "";
        }
        return data;
    }
    public static void main(String1[] args) {
        System.out.println(initcap("hello world java"));
        System.out.println(initcap("java programming"));
    }
}