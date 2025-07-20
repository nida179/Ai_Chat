import Bot.GuessBot;
import Bot.MathBot;
import Bot.ScienceBot;
import Interface.Bot_interface;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
        System.out.println("🌏Welcome! which bot do you want to talk to: ");
        System.out.println("1.MathBot\n2.ScienceBot\n3.GuessBot");
        System.out.print("ENTER YOUR CHOICE: ");
        String choice = scanner.nextLine();
        Bot_interface bot;
        switch(choice.toLowerCase()){

            case "1":
            case "mathbot":
                bot = new MathBot();
                break;
            case "2":
            case "guessbot":
                bot = new GuessBot();
                break;
            case "3":
            case "sciencebot":
                bot = new ScienceBot();
                break;
            default:
                System.out.println("Invalid choice");
                bot = new GuessBot();
        }
        System.out.println("Start chatting with your chatbot");

        while(true){
            System.out.print("You: ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Bot Goodbye");
                break;
            }
            bot.respond(input);
        }
        scanner.close();
    }
}
