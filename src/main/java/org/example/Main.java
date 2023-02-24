package org.example;

public class Main {
    public static void main(String[] args) {

        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}
class 사람 {
    사람(){
        a왼팔 = new 팔();
    }
    팔 a왼팔;
}
class 팔{
    팔(){
        a손 = new 핸드();
    }
    핸드 a손;
}
class 핸드 {
    핸드(){
        a엄지손가락 = new 손가락();
    }
    손가락 a엄지손가락;
}
class 손가락 {
    int 길이;
    손가락(){
        this.길이 = 5;
    }
}




