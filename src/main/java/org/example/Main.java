package org.example;

public class Main {
    public static void main(String[] args) {

        전사 a전사 = new 전사();
        a전사.공격();
        // 출력 => 아직 무기가 없습니다.
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 => 칼로 공격합니다.
    }
}
class 전사 {
    무기 a무기;
    public void 공격() {
        if( a무기 == null) {
            System.out.println("아직 무기가 없습니다.");
        }else {
            a무기.사용();
        }

    }
}
class 무기 {
    public void 사용(){}
}
class 칼 extends 무기 {
    public void 사용() {
        System.out.println("칼로 공격합니다.");
    }
}



