package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {

        System.out.println("===== 명언 앱 ====");

        while (true) {

            System.out.print("명령) ");

            String cmd = sc.nextLine().trim();

            if (cmd.equals("하하")) {
                System.out.println("종료");
                break;
            }
            else if (cmd.equals("등록")) {

                System.out.print("명언: ");
                String content = sc.nextLine().trim();
                System.out.print("작가: ");
                String authorName = sc.nextLine().trim();

                System.out.println("1번 명언이 등록되었습니다.");
            }
        }
    }
}
