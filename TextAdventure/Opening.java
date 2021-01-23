import java.util.Scanner;
//ROOT CLASS- TREE CAN BE MADE LATER
public class Opening {
    

    public static void main(String[] args) throws InterruptedException {
        opening(0);
    }//MAIN METHOD
    public static void opening(int notrequired) throws InterruptedException {

        Scanner s = new Scanner(System.in);
        int numChoice, fightProb, invMat;
        long invToken;
        String answ, question;
        char direct;

        System.out.println("You wake up, amnesiac, in small hut. Surrounded by a Forest, a Jungle, a Desert and your hut, you have four choices for movement. \n Use N, W, E and S to go to each, respectively.");

        direct = s.nextLine().charAt(0);
        
        switch(direct){

            case 'N':
                //Add in class for thingy thing
                
                break;
            case 'E':
                ChoiceDesert.main(new String[0]); 
                
                break;
            case 'W':
                //Add inside the class for each thing
                
                break;
            case 'S':
                // Add in class for the last one
                
                break;
            default:
                //Same as whichever goes back home.
                
        }
        //Theres so much room here...maybe an easter egg could fill it...who knows




    }//Static Void



}//Main Class