package JavaWorkshop;

import java.util.Scanner;

public class fyi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int floor = input.nextInt()/10000;
        if(floor == 555){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}