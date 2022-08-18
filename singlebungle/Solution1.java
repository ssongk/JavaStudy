package singlebungle;

public class Solution1 {
    public static long solution(int a, int b) {
        long answer = 0;
        if(a==b){
            return (long)a;
        }
        else if(a<b){
            for(int i=a;i<b+1;i++){
                answer += i;
            }
        }
        else{
            for(int i=b;i<a+1;i++){
                answer += i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("A\tb\treturn");
        int A[] = {3,3,5};
        int b[] = {5,3,3};
        long ret[] = new long[A.length];
        for(int i=0;i<A.length;i++){
            ret[i] = solution(A[i],b[i]);
        }
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]+"\t"+b[i]+"\t"+ret[i]);
        }
    }
}
