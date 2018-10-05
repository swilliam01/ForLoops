import java.util.Scanner;

public class forLoops {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        userInput = keyboard.next();

        while (!userInput.equals("no"))
        { System.out.println(userInput);
        System.out.println("Do you want to write more ? ");
        userInput= keyboard.next();

        }

    }
}



