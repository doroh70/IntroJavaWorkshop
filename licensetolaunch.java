import java.util.Scanner;

public class licensetolaunch {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int numDays = scanner.nextInt();

        // Declare and initialize the spaceJunk array
        int[] spaceJunk = new int[numDays];

        // Read the space junk for each day into the array
        for (int i = 0; i < numDays; i++) {
            spaceJunk[i] = scanner.nextInt();
        }

        // Find the day to launch
        int minJunk = spaceJunk[0]; // Assume the first day has minimum space junk initially
        int launchDay = 0; // Default is day 1
        for (int i = 0; i < numDays; i++) {
            if (spaceJunk[i] < minJunk) {
                minJunk = spaceJunk[i];
                launchDay = i;
            }
        }

        // Output the day to launch
        System.out.println(launchDay);
    }
}