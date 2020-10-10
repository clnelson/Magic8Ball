import java.util.Random;
import java.util.Scanner;

public class Magic8 {
    // This declares my random number objects
  Random random = new Random();
  int num = random.nextInt(100);

    public int shake() {
        // My shake method, nothing fancy
      return num;
    }
    public void answer() {
        // The answers to be returned at random to the user
        if (num <= 10) {
            System.out.println("It's not looking good...");
        } else if (num <= 20) {
            System.out.println("I'm thinking YES!");
        } else if (num <= 30) {
            System.out.println("YES!!!");
        } else if (num <= 40) {
            System.out.println("Probably NOT!");
        } else if (num <= 50) {
            System.out.println("I could'nt say...");
        } else if (num <= 60) {
            System.out.println("Better luck tommorrow.");
        } else if (num <= 70) {
            System.out.println("You just had to ask...");
        } else if (num <= 80) {
            System.out.println("It's a NO from me!");
        } else if (num <= 90) {
            System.out.println("Sleep on it and ask again tommorrow!");
        } else if (num <= 100) {
            System.out.println("Definitely NOT!!!");
        }
    }
    public static void main(String[] args) {

    	  // Printing the object of the game
 	  System.out.println("Ask Your Question...");
	  System.out.println("Then give me a good shake!");

	  // Reading input from the user
        Scanner sc = new Scanner(System.in);
  	  String str = sc.nextLine();

        // Initializing a way to call my methods
        Magic8 user = new Magic8();

	  // Returning the answer in a formatted manner!
        System.out.println("Your number is: " + user.shake());
        System.out.println("Now for your answer to..." + str + ":");
        user.answer();
    }
}
