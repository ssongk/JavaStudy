package singlebungle1;

import java.util.StringTokenizer;

public class StringUpper {
    private static String initcap(String str) {
        String data = "";
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            temp = temp.toUpperCase().substring(0,1)+temp.substring(1);
            data += (temp + " ");
            temp = "";
        }
        return data;
    }
    public static void main(String[] args) {
        System.out.println(initcap("hello world java"));
        System.out.println(initcap("java programming"));
    }
}