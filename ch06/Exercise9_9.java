package ch06;
public class Exercise9_9 {
    static String delChar(String src, String delCh){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<src.length();i++){
            int toggle = 0;
            char c = src.charAt(i);
            for(int k=0;k<delCh.length();k++){
                if(src.charAt(i)==delCh.charAt(k)){
                    toggle++;
                }   
            }
            if(toggle==0)
                sb.append(Character.toString(c));
        }            
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "+delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1  2    3    4\t5)"+" -> "+delChar("(1  2    3    4\t5)","\t"));

    }
}
