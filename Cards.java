import java.util.*;
public class Cards{
    public static void main(String []args){
            Scanner input = new Scanner(System.in);
            Random random = new Random();
            String[] card = new String [4];
            String [] C = {"Red","Black"};
            int Select1 = random.nextInt(C.length);
            String c = C[Select1];
            card[0]=c;
            if(c.equals("Red")){
                    String [] T1 = {"Heart","Diamond"};
                    int Select21 = random.nextInt(T1.length);
                    String t1 = T1[Select21];
                    card[1]=t1;
            }
            if(c.equals("Black")){
                    String [] T2 = {"Spade","Clubs"};
                    int Select22 = random.nextInt(T2.length);
                    String t2 = T2[Select22];
                    card[1]=t2;
            }
            String []F1 = {"Face","Number"};
            int Select31 = random.nextInt(F1.length);
            String f1 = F1[Select31];
            card[2]=f1;
            if(f1.equals("Face")){
                    String []F11 = {"King","Queen","Jack"};
                    int f11 = random.nextInt(F11.length);
                    String F111 = F11[f11];
                    card[3]=F111;
            }
            if(f1.equals("Number")){
                    String []F12 = {"1","2","3","4","5","6","7","8","9","10"};
                    int f12 = random.nextInt(F12.length);
                    String F112 = F12[f12];
                    card[3]=F112;
            }
            int S=0;
            System.out.println("Lets play the guessing game");
            System.out.println("Guess the colour of the card");
            String CC1 = input.next();
            if(Objects.equals(CC1, card[0])){
                    S=S+1;
                    System.out.println("You guessed right");
            }
            if(!Objects.equals(CC1, card[0])){
                    System.out.println("You guessed Wrong");
            }
            System.out.println("Guess the Shape of the card");
            String CC2 = input.next();
            if(Objects.equals(CC2, card[1])){
                    S=S+1;
                    System.out.println("You guessed right");
            }
            if(!Objects.equals(CC2, card[1])){
                    System.out.println("You guessed wrong");
            }
            System.out.println("Guess the Type of the card");
            String CC3 = input.next();
            if(Objects.equals(CC3, card[2])){
                    S=S+1;
                    System.out.println("You guessed right");
            }
            if(!Objects.equals(CC3, card[2])){
                    System.out.println("You guessed wrong");
            }
            System.out.println("Guess the Final of the card");
            String CC4 = input.next();
            if(Objects.equals(CC4, card[3])){
                    S=S+1;
                    System.out.println("You guessed right");
            }
            if(!Objects.equals(CC4, card[3])){
                    System.out.println("You guessed wrong");
            }
            System.out.println("Right answers");
            for(int i=0;i<4;i++){
                    System.out.print("\t"+card[i]);
            }
            System.out.println("\n"+"Final Score"+S);
    }
}