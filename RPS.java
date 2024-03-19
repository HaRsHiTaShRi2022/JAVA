import java.util.*;
class Check{
    public Check(String C,String P){
        if(Objects.equals(C, P)){
            System.out.print("draw");
        }
        if(Objects.equals(C, "Rock")){
            if(Objects.equals(P, "Paper")){
                System.out.print("you won");
            }
            if(Objects.equals(P, "Scissors")){
                System.out.print("I won");
            }
        }
        if(Objects.equals(C,"Scissors")){
            if(Objects.equals(P,"Paper")){
                System.out.println("I won");
            }
            if(Objects.equals(P,"Rock")){
                System.out.println("you won");
            }
        }
        if(Objects.equals(C,"Paper")){
            if(Objects.equals(P,"Scissors")){
                System.out.println("I won");
            }
            if(Objects.equals(P,"Rock")){
                System.out.println("you won");
            }
        }
    }
}
public class RPS{
    public static void main(String []args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to my game of Rock Paper Scissors");
        System.out.println("please enter your choice from above");
        String g = input.next();
        String [] arr = {"Rock","Scissors","Paper"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
        String r= arr[select];
        Check ob = new Check(r,g);
    }
}