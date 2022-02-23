import java.util.Scanner;

public class MainHomework {
    public static void main(String[] args) {
        System.out.println("Hi! I am a Friend. Tell me your name: ");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.printf("Hello %s! Nice to meet you. %n", userName);
        System.out.println("Tell me something interesting :) ");
        String firstInput = input.nextLine();
        Friend friend = new Friend(userName,firstInput);
        System.out.println("Nice to know");
        System.out.println("To get my attitude type 'status' ↓");
        boolean talk = true;
        System.out.println("Let's chat ;p");
        while (talk) {
            String userInput = input.nextLine();
            talk = friend.phraseAnalyser(userInput);
        }
        System.out.println("I will never forget your first words: " + firstInput);
    }
}
