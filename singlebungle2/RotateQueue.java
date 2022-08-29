package singlebungle2;

public class RotateQueue{
    public static void main(String[] args) {
        // int n = (int)(Math.random()*50);
        // int m = (int)(Math.random()*n);
        int n = 10;
        int m = 3;
        System.out.println(n+" "+m);        

        // int l[] = new int[m];
        int l[] = {2,9,5};
        for(int i=0; i<l.length; i++){
        //     while(true){
        //         boolean overlap = false;
        //         int t = (int)(Math.random()*n);
        //         if(t==0)
        //             continue;
        //         for(int j=0; j<i+1; j++){
        //             if(l[i] == t){
        //                 overlap = true;
        //                 break;
        //             }
        //         }
        //         if(overlap==true)
        //             continue;
        //         else{
        //             l[i] = t;
        //             break;
        //         }
        //     }
            System.out.print(l[i]+" ");
        }
        int sum = 0;
        int offset1 = 1;
        int offset2 = 1;
        for(int i=0;i<l.length;i++){
            int distance1 = 0;
            int distance2 = 0;
            while(true){
                if(offset1==l[i]){
                    break;
                }
                else{
                    distance1++;
                    offset1++;
                }
                if(offset1>=n){
                    offset1 %= n;
                }
            }
            while(true){
                if(offset2==l[i]){
                    break;
                }
                else{
                    distance2--;
                    offset2--;
                }
                if(offset2<=1){
                    offset1 = n;
                }
            }
            if(distance1>distance2)
                sum += distance1;
            else
                sum += distance2;
            offset1 = l[i];
            offset2 = l[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
