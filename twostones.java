import java.util.Scanner;

public class twostones {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();

        if(x%2 == 0)
            System.out.println("Bob");
        else
            System.out.println("Alice");
    }
}