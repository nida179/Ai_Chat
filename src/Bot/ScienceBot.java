package Bot;
import Interface.Bot_interface;
public class ScienceBot impements Bot_interface{
    public void respond(String input){
        if(input.contains("Gravity")){
            System.out.println("Gravity keeps us on the ground.");
        }
        else{
            System.out.println("ScienceBot: I love Science: ");
        }
    }
}
