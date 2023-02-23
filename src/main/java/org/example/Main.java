package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Solution().solution(2,3)); // -1
//        System.out.println(new Solution().solution(11,11)); // 1
//        System.out.println(new Solution().solution(7,99)); // -1
    }
}
class Solution {
    public int solution(int angle) {
        if (angle == 180) return 4;
        else if (angle > 90) return 3;
        else if (angle < 90) return 1;

        return angle;
    }
}