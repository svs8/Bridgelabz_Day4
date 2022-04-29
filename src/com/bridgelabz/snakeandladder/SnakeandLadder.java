package com.bridgelabz.snakeandladder;

public class SnakeandLadder {
    static int START_POSITION = 0;
    static int PLAYERPOSITION = 0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;
    static final int WINNINGPOSITION = 100;

    private static int dieRoll() {
        int dieValue = (int) (Math.random() * 10 % 6) + 1;
        return dieValue;
    }

    private static int getoption() {
        int option = (int) (Math.random() * 10 % 3) + 1;
        return option;
    }

    private static int playgame(int option, int dieValue) {
        switch (option) {
            case NO_PLAY:
                System.out.println("No Play");
                break;
            case LADDER:
                PLAYERPOSITION = PLAYERPOSITION + dieValue;
                break;
            case SNAKE:
                if(PLAYERPOSITION-dieValue <START_POSITION)
                {
                    PLAYERPOSITION=START_POSITION;
                }
                else{
                    PLAYERPOSITION = PLAYERPOSITION - dieValue;
                }

        }

        return PLAYERPOSITION;
    }


    public static void main(String[] args) {
        // welcome to snake ladder program.
        System.out.println("Welcome to snake ladder game");
        System.out.println("Player will start from position " + START_POSITION);

        while (PLAYERPOSITION < WINNINGPOSITION) {
        int dieValue = dieRoll();
        System.out.println("Die: " + dieValue);

        int option = getoption();
        System.out.println("option: " + option);



            PLAYERPOSITION= playgame(option, dieValue);

            System.out.println("Playerposition is " + PLAYERPOSITION);


        }
    }
}
