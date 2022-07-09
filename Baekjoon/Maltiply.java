import java.util.Scanner;
// 백준-2588-곱셉
public class Maltiply {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c[] = new int[3];
        int result = 0;
        c[2]=b/100;
        b%=100;
        c[1]=b/10;
        b%=10;
        c[0]=b;
        for(int i=0;i<c.length;i++){
            c[i]=a*c[i];
            System.out.println(c[i]);
        }
        result = c[0]+c[1]*10+c[2]*100;
        System.out.println(result);
        s.close();
    }    
}
