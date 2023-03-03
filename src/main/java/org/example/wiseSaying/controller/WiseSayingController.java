package org.example.wiseSaying.controller;

import org.example.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    private final Scanner sc;
    private long lastWiseSayId;
    private List<WiseSaying> wiseSayings;
    public WiseSayingController(Scanner sc){
        this.sc = sc;
        lastWiseSayId = 0;
        wiseSayings = new ArrayList<>();
    }
    public void write() {
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

    public void list() {
        System.out.printf("생성된 명언수: %d개\n", wiseSayings.size());
        System.out.println("-------------------");
        System.out.println("번호 / 작가 / 명언");
        for (int i = 0; i < wiseSayings.size(); i++ ){
            WiseSaying wiseSaying = wiseSayings.get(i);
            System.out.printf("%d / %s / %s\n", wiseSaying.getId(),wiseSaying.getAuthorName(),wiseSaying.getContent());
        }
    }
}
