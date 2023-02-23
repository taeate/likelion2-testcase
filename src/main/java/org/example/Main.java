package org.example;

public class Main {
    public static void main(String[] args) {

        전사 a전사 = new 전사();


        a전사.공격("브라이언","칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립","창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크","지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

    }
}

class 전사{
    String lastName_;
    String lastWeaponName;
    void 공격(String name, String weaponName){
        System.out.println( name +"(이)가" + weaponName +"로 공격합니다.");

        lastName_ = name;
        lastWeaponName = weaponName;
    }
    void 재공격(){
        System.out.println( lastName_ +"(이)가" + lastWeaponName +"로 공격합니다.");
    }
}


