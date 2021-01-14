package com.company;

import java.util.Scanner;

public class Main {

    public static Player player;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        player = new Player(in.next());
        story = new Story();
        while (true) {
            player.Health += story.current_situation.dHealth;
            player.Respect += story.current_situation.dRespect;
            player.Money += story.current_situation.dMoney;
            System.out.println("=====\nЗдоровье:" + player.Health + "\tРепутация:" +player.Respect + "\tДеньги:" + player.Money + "\n=====");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("==========Конец игры==========");
                return;
            }
            story.go(in.nextInt());
        }
    }
}
