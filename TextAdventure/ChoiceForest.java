//POV: You chose forest and came to check the code
import java.util.Scanner;

public class ChoiceForest{
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        char fUnCho;
        System.out.println("You walk North to find yourself deep inside a forest. This seems to be the least promising route. Should we turn around, A, or keep going, G?");
        fUnCho = s.nextLine().charAt(0);
        if (fUnCho == 'A'){

        }else if (fUnCho == 'G'){
            System.out.println("Sure. You head deeper into the forest, where the ground has not seen the light of day for a long time. \n It smells of something...rotting.");
            System.out.println("You keep going, and finally you see a tree stump with a rabbit hole in it. A black rabbit moving very slowly enters. \n Do you keep walking, K, or look at the hole, H?");
            fUnCho = s.nextLine().charAt(0);
            switch(fUnCho){
                case 'K':
                    break;
                case 'H':
                    System.out.println("You look intensely at the hole, until a hoarde of black rabbits overtake you and carry you into the hole. \nYou've fallen, and all of a sudden, you feel quite small\n-owww\n-THWACK");
                    pause(5);
                    System.out.println("It's me, Bunny Leader. Come with me, M, if you want to live. Stay with this... boring narrator, N, if you want to die at my wrath.");
                    fUnCho = s.nextLine().charAt(0);
                    switch(fUnCho){
                        case 'M':
                            break;
                        case 'N':
                            break;
                    }

                    break;
            }

        }




    }//Main Method
    public static void pause(int ms) throws InterruptedException {
        Thread.sleep((ms * 100));
    }








}//Class bracket