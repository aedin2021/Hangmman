import java.util.Scanner;

public class TheManTheyHung {

    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        int playAgain;
        int guesses;
        String TheWordToGuess;
        do {
            System.out.println("This is a game of hang man, there can either be two players or there can be one.");
            System.out.println("Player one will pick a word and player two will be the one to guess that word.");
            System.out.println("First player one pick a word with player two looking away");
            TheWordToGuess = key.nextLine();























            System.out.println("would you like to work a gain? 1 is yes 2 is no.");
            playAgain = key.nextByte();
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
    } }
