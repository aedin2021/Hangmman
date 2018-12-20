import java.util.Scanner;

public class TheManTheyHung {

    public static void main(String args[]) {

        int playAgain;
        int guesses;
        boolean TheAnswer;
        String TheWordToGuess, Letter,printArray;
        String yes, no, maybe, know, what, good, bad, mississippi, word, name, school, back, mouse, computer, tank, mause, tiger, panther, day, night;
        String altf4, git_gud, scrub, over, power, health, games, control, java, hang, man, redit, twiter, social, media, CCN, news, pink, black, green;
        String purple, blue, brown, last, first, bye, sad, happy, pay, credit, job, debit, and, saboton, iron, fist, paper, money, cash, dough, something;


        do {
            guesses = 0;

            Scanner key = new Scanner(System.in);

            System.out.println("This is a game of hang man, there can either be two players or there can be one.");

            System.out.println("Player one will pick a word and player two will be the one to guess that word.");

            System.out.println("First player one pick a word with player two looking away");

            System.out.println("Here are also some lines to help you pick a word");

            System.out.println("yes,no,maybe,know,what,good,bad,mississippi,word,name,school,back,mouse,computer,tank,mause,tiger,panther,day,night,altf4,git_gud,scrub,over,power,health,games,control,java,hang,man,redit,twiter,social,media,CCN,news,pink,black,green;\n" + "purple,blue,brown,last,first,bye,sad,happy,pay,credit,job,debit,and,saboton,iron,fist,paper,money,cash,dough,something");

            TheWordToGuess = key.nextLine();



            String asterisk = new String(new char[TheWordToGuess.length()]).replace("\0", "_");

            TheWordToGuess = TheWordToGuess.replaceAll("[a-zA-Z]", "_");

            System.out.println(TheWordToGuess);

            while(!TheAnswer && guesses!=7){
                System.out.println("Enter a single letter");

                char input = Scanner.nextLine().charAT(0);


            }


            String newasterisk = "";
            for (int i = 0; i < TheWordToGuess.length(); i++) {
                if (TheWordToGuess.charAt(i) == TheWordToGuess.charAt(0)) {
                    newasterisk += TheWordToGuess.charAt(0);
                } else if (asterisk.charAt(i) != '_') {
                    newasterisk += TheWordToGuess.charAt(i);
                } else {
                    newasterisk += "*";
                }
            }

            if (asterisk.equals(newasterisk)) {
                guesses++;
            } else {
                asterisk = newasterisk;
            }
            if (asterisk.equals(TheWordToGuess)) {
                System.out.println("Correct! You win! The word was " + TheWordToGuess);
            }
            guesses = 0;

            if (guesses == 1) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 2) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 0");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 3) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 O");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 4) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 O");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 5) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 0");
                System.out.println("|                /|");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 6) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 0");
                System.out.println("|                /|\\");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 7) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 0");
                System.out.println("|                /|\\");
                System.out.println("|                 | \\");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 8) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 O");
                System.out.println("|                /|\\");
                System.out.println("|               / | \\");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 9) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 O");
                System.out.println("|                /|\\");
                System.out.println("|               / | \\");
                System.out.println("|                 |");
                System.out.println("|                /");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 10) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 0");
                System.out.println("|                /|\\");
                System.out.println("|               / | \\");
                System.out.println("|                 |");
                System.out.println("|                / \\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 11) {
                System.out.println("Wrong guess again.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 0");
                System.out.println("|                /|\\");
                System.out.println("|               / | \\");
                System.out.println("|                 |");
                System.out.println("|                / \\");
                System.out.println("|               /   ");
                System.out.println("|");
                System.out.println("====================");
            }
            if (guesses == 12) {
                System.out.println("You lost.");
                System.out.println("-------------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 0");
                System.out.println("|                /|\\");
                System.out.println("|               / | \\");
                System.out.println("|                 |");
                System.out.println("|                / \\");
                System.out.println("|               /   \\");
                System.out.println("|");
                System.out.println("====================");
            }
            System.out.println("would you like to work a gain? 1 is yes 2 is no.");

            playAgain = key.nextByte();

            if (playAgain == 2) {

                System.out.println(" _____   ___  ___  ___ _____   _____  _   _ ___________ \n" +
                        "|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\\n" +
                        "| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ /\n" +
                        "| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    / \n" +
                        "| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\ \n" +
                        " \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_|");
            }
            System.out.println("Play again soon!");
        }while (playAgain == 1);
    }
}