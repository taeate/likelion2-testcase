package org.example;


import org.example.system.controller.SystemController;
import org.example.wiseSaying.controller.WiseSayingController;
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


        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController(sc);

        while (true) {

            System.out.print("명령) ");

            String cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                systemController.exit();
                break;
            }
            else if (cmd.equals("등록")) {
                wiseSayingController.write();
            }
            else if (cmd.equals("목록")) {
                wiseSayingController.list();
            }
        }
    }
}
