package ch05;
// 클래스의 공통부분을 뽑아 부모클래스를 만드는 문제
public class MakeUnit {
    int x,y;
    void move(int x, int y){
        this.x=x;
        this.y=y;
    }
    void stop(){/* 현재 위치에 정지 */}
}
class Marine extends MakeUnit{
    void stimPack(){/* 스팀팩 사용 */}
}
class Tank extends MakeUnit{
    void changeMode(){/* 공격 모드 변환 */}
}
class DropShip extends MakeUnit{
    void load(){/* 선택 대상 태우기 */}
    void unload(){/* 선택 대상 내리기 */}
}
