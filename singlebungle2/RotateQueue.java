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
        int offset = 0;
        for(int i=0;i<l.length;i++){
            if(Math.abs(l[i] - offset)>Math.abs(offset-l[i])){
                sum += Math.abs(l[i] - offset);
                offset = l[i];
            }
            else{
                sum += Math.abs(offset-l[i]);
                offset = l[i];
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
