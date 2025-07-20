package Bot;
import Interface.Bot_interface;
public class MathBot implements Bot_interface{
  
    public void respond(String input){
        switch(input){
            case "add":
                System.out.println("MathBot: Let's add the numbers ");
                break;
            case "sub":
                System.out.println("MathBot: Let's subtract the numbers ");
                break;
            case "mul":
                System.out.println("MathBot: Let's multiply the numbers ");
                break;
            case "div":
                System.out.println("MathBot: Let's divide the numbers ");
                break;
            case "mod":
                System.out.println("MathBot: Let's take the modulo of the numbers ");
                break;
            default:
                System.out.println("I ONLY DO THE MATH'S STUFF");
        }
    }
}
