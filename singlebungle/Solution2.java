package singlebungle;

class Solution2 {
    public static long solution(int price, int money, int count) {
        long answer = -1;
        for(int i=1;i<count+1;i++){
            money -= price*i;
        }
        if(money>=0){
            answer=0;
        }
        else{
            answer = Math.abs(money);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("price\tmoney\tcount\tresult");
        int price = 3;
        int money = 20;
        int count = 4;
        long result = 0;
        result = solution(price, money, count);
        System.out.println(price+"\t"+money+"\t"+count+"\t"+result);
    }
}
