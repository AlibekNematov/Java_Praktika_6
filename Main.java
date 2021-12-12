package com.company;

import java.util.Scanner;
import com.company.SimpleStack;

public class Main extends  Game{
    public static void main(String[] args){
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        SimpleStack p1 = new SimpleStack();
        SimpleStack p2 = new SimpleStack();

        System.out.println("Введите 1 колоду: ");
        for (int i = 0; i < 5; i++){
            p1.push(scanner.nextInt());
        }

        System.out.println("Введите 2 колоду: ");
        for (int i = 0; i < 5; i++){
            p2.push(scanner.nextInt());
        }
        game.play(p1, p2);
    }
}
