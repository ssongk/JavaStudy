package singlebungle;

class Health {
    String name; // 이름
    double height; // 신장
    double weight; // 몸무게
    Health(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void prn() {
        System.out.printf("%s 님의 키 %d , 몸무게 %d 입니다.\n",name, height, weight);
    }
}// end Health
class HealthRate extends Health {
    public HealthRate(String name, double height, double weight) {
        super(name, height, weight);
    }
    private double standardHealth(){
        // 표준체중 *표준체중 : SW = (H-100)*0.9
        return (height-100) * 0.9;
    }
    private String rateCheck(){
        // * 비만도 : B(%) = (W-SW)/SW*100
        // * 비만도 계산 | ~10% 이내 : 정상 | 10%~20% 이내 : 과체중 | 20%~: 비만
        double b = (weight-standardHealth())/standardHealth() * 100;
        if(b<10){
            return "정상";
        }
        else if(b<20){
            return "과체중";
        }
        else{
            return "비만";
        }
    }
    @Override
    public void prn() {
        System.out.printf("%s 님의 신장 %.0f, 몸무게 %.0f %s입니다.\n", name, height, weight, rateCheck());
    }
}// end HealthRate
public class BMI {
    public static void main(String[] args) {
        HealthRate hr = new HealthRate("홍길동", 168, 45); hr.prn();
        HealthRate hr2 = new HealthRate("박둘이", 168, 90);
        hr2.prn();
    }//end main()
}//end class
