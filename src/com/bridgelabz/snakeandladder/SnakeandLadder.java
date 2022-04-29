package com.bridgelabz.snakeandladder;

public class SnakeandLadder {

    private static int dieRoll(){
        int dieValue= (int)(Math.random()*10 %6)+1;
        return dieValue;
    }
    static int START_POSITION = 0;

        public static void main(String[] args) {
            // welcome to snake ladder program.
            System.out.println("Welcome to snake ladder game");
            System.out.println("Player will start from position "+START_POSITION);

            int dieValue= dieRoll();
            System.out.println("Die: "+dieValue);


        }
    }
