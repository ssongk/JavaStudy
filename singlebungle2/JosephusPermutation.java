package singlebungle2;

public class JosephusPermutation {
    public static void main(String[] args) {
        int n = (int)((Math.random()*999)+1);
        int k = (int)(Math.random()*n);
        System.out.println(n+" "+k);
        System.out.print("<");
        int t = k;
        for(int i=0;i<n;i++){
            if(t>n){
                t %= n;
            }
            if(i==n-1){
                System.out.print(t);
            }
            else{
                System.out.print(t+", ");
            }
            t += k;
        }
        System.out.print(">");
    }
}
