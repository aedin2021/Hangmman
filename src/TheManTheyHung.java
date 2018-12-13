import java.util.Scanner;

public class TheManTheyHung {

    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        int playAgain;
        int guesses, player;
        String TheWordToGuess, answer;
        guesses = 0;
        String yes, no, maybe, know, what, good, bad, mississippi, word, name, school, back, mouse, computer, tank, mause, tiger, panther, day, night;
        String altf4, git_gud, scrub, over, power, health, games, control, java, hang, man, redit, twiter, social, media, CCN, news, pink, black, green;
        String purple, blue, brown, last, first, bye, sad, happy, pay, credit, job, debit, and, saboton, iron, fist, paper, money, cash, dough, something;
        String Player;
        int PlayerPoints;


        do {
            System.out.println("What would you like you name to recorded as.");
            Player = key.nextLine();
            System.out.println(Player);
            PlayerPoints = 1200;
            System.out.println(Player + " you will start with " + PlayerPoints + ", ");
            System.out.println("This is a game of hang man, there will be two players.");
            System.out.println("Player one will pick a word and player two will be the one to guess that word.");
            System.out.println("First player one pick a word with player two looking away");
            TheWordToGuess = key.nextLine();
            player = key.nextByte();
            if (guesses != 12) {
                guesses++;
                System.out.println("Hi " + guesses);
            }


            System.out.println("would you like to play again? 1 is yes 2 is no.");
            playAgain = key.nextShort();
        } while (playAgain == 1);
        if (playAgain == 2) {
            System.out.println(" _____   ___  ___  ___ _____   _____  _   _ ___________ \n" +
                    "|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\\n" +
                    "| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ /\n" +
                    "| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    / \n" +
                    "| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\ \n" +
                    " \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_|");
        }
        System.out.println("Play again soon!");
    }

    public static void pictures(int TheMan[]) {
        /*"-------------------";
        "|                 |";
        "|                 |";
        "|";
        "|";
        "|";
        "|";
        "|";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 0";
        "|";
        "|";
        "|";
        "|";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 O";
        "|                 |";
        "|";
        "|";
        "|";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 O";
        "|                 |";
        "|                 |";
        "|";
        "|";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 0";
        "|                /|";
        "|                 |";
        "|";
        "|";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 0";
        "|                /|\\";
        "|                 |";
        "|                 |";
        "|";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 0";
        "|                /|\\";
        "|                 | \\";
        "|                 |";
        "|";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 O";
        "|                /|\\";
        "|               / | \\";
        "|                 |";
        "|";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 O";
        "|                /|\\";
        "|               / | \\";
        "|                 |";
        "|                /";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 0";
        "|                /|\\";
        "|               / | \\";
        "|                 |";
        "|                / \\";
        "|";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 0";
        "|                /|\\";
        "|               / | \\";
        "|                 |";
        "|                / \\;
        "|               /   ";
        "|";
        "====================";

        "-------------------";
        "|                 |";
        "|                 |";
        "|                 0";
        "|                /|\\";
        "|               / | \\";
        "|                 |";
        "|                / \\;
        "|               /   \\";
        "|";
        "====================";*/
    }

    public static void underscore(String repalce[]) {/*
        String TheWordToGuess;
        String _answer = TheWordToGuess;
        _answer = _answer.replaceAll("[a-zA-Z]", "_");
        System.out.println(_answer);*/
    }
}