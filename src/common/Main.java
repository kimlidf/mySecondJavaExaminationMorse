package common;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            Converter converter = new Converter();
            boolean running = true;

            while (running) {
                try {
                    System.out.println("Type a character from the English alphabet to get it translated to morse code or vice versa. To finish the program, type the word: stop");
                    String userInput = scan.nextLine();

                    if (userInput.equalsIgnoreCase("stop" )) {
                        running = false;
                    } else {
                        String morseCode = converter.getText(userInput);
                        if (morseCode == null) {
                            System.out.println("Incorrect input, please try again.");
                            System.out.println();
                        } else {
                            System.out.println(morseCode);
                            System.out.println();
                        }
                    }
                } catch(Exception e){
                    System.out.println("An error occurred: " +e.getMessage());
                }
            }
        }
    }
