package JavaWorkshop;

import java.util.Scanner;

public class greetings2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        int wordLength = word.length();

        int eFreq = wordLength - 2;

        int newEfreq = eFreq * 2;

        StringBuffer s = new StringBuffer();
        s.append("h");
        for(int i = 0; i < newEfreq; i++){
            s.append("e");
        }
        s.append("y");
        System.out.println(s.toString());
    }
}