import java.util.*;

public class witch{
    public static void main(String[] args){
        
        System.out.println("Who is different from the rest? ");
        System.out.println("is it A, Albert");
        System.out.println("is it B, Andy");
        System.out.println("is it C, Adam");
        System.out.println("is it D, Mark");
        
        Scanner input = new Scanner(System.in);
        char[] answer = input.toCharArray();


        switch(answer){

            case 'A' : System.out.println("Wrong, maybe next time.");
                break;
            case 'B' : System.out.println("Wrong, maybe next time.");
                break;
            case 'C' : System.out.println("Wrong, maybe next time.");
                break;
            case 'D' : System.out.println("Wrong, maybe next time.");
                break;
            default:
                System.out.println("Have you given up?");
        }

    }
}