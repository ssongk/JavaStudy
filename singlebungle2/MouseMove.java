package singlebungle2;

import java.util.ArrayList;
import java.util.Scanner;

class Location{
    private int x;
    private int y;
    
    public Location(){}

    public Location(int x,int y){
        this.x = x;
        this.y = y;
    }
    public static double getDistance(Location l1,Location l2){
        return Math.sqrt(Math.pow((l1.x-l2.x),2) + Math.pow((l1.y-l2.y),2));
        
    }
    public static double getDistance(Location l){
        return Math.sqrt(Math.pow(l.x,2) + Math.pow(l.y,2));   
    }
}

public class MouseMove extends Location{
    public static void main(String[] args) {
        ArrayList<Location> al = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
        for(int i=0;i<5;i++){
            System.out.print(">> ");
            int x = s.nextInt();
            int y = s.nextInt();
            Location l = new Location(x,y);
            al.add(l);
        }
        double distance = 0;
        for(int i=0;i<5;i++){
            if(i==0){
                Location l = al.get(i);
                distance += getDistance(l);
            }
            else if(i==4){
                Location l1 = al.get(i-1);
                Location l2 = al.get(i);
                distance += getDistance(l1,l2);
                distance += getDistance(l2);
            }
            else{
                Location l1 = al.get(i-1);
                Location l2 = al.get(i);
                distance += getDistance(l1,l2);
            }
        }
        System.out.println("총 이동 거리는 "+distance);
        s.close();
    }
}
