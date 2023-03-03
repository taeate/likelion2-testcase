package org.example;


import org.example.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {

        System.out.println("===== 명언 앱 ====");

        long lastWiseSayId = 0;
        List<WiseSaying> wiseSayings = new ArrayList<>();

        while (true) {

            System.out.print("명령) ");

            String cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                System.out.println("종료");
                break;
            }
            else if (cmd.equals("등록")) {
                long id =  lastWiseSayId + 1;
                System.out.print("명언: ");
                String content = sc.nextLine().trim();
                System.out.print("작가: ");
                String authorName = sc.nextLine().trim();

                WiseSaying wiseSaying = new WiseSaying(id , content , authorName);
                wiseSayings.add(wiseSaying);

                System.out.printf("%d번 명언이 등록되었습니다.\n",id);
                lastWiseSayId = id;
            }
            else if (cmd.equals("목록")) {
                System.out.printf("생성된 명언수: %d개\n", wiseSayings.size());
                System.out.println("-------------------");
                System.out.println("번호 / 작가 / 명언");
                for (int i = 0; i < wiseSayings.size(); i++ ){
                    WiseSaying wiseSaying = wiseSayings.get(i);
                    System.out.printf("%d / %s / %s\n", wiseSaying.getId(),wiseSaying.getAuthorName(),wiseSaying.getContent());
                }
            }
        }
    }
}
