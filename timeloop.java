package JavaWorkshop;


import java.util.Scanner;

public class timeloop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int i = 1; i < number+1; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}