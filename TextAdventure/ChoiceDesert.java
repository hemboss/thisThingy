import java.util.Scanner;

public class ChoiceDesert{
    public static boolean drill;
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        boolean dead;
        int days, number;
        String gamOv = " GAME OVER";

        System.out.println("You walk for days. \n This seems to be a promising route.");
        stop(1);
        System.out.println("You approach...an Oasis. They try to pull you in with their rock.\n Do you listen closer, L, or run away, R?");
        char dUnCho = s.nextLine().charAt(0);
        days = (int)((Math.random())*10)+3;

        if (dUnCho == 'L') { //LIStEN CLOSER!
            //numChoice += 1;
            System.out.println("You approach the Oasis, and as you do, you realize your eardrums are bleeding. \n And then, you remember!");
            stop(1);
            System.out.print("That's your...");
            stop(1);
            System.out.println("wait no, memory gone. \n You keep approaching, until an unspoken ultimatum occurs: \n Search your inventory, I, or attempt to survive, S.");
                dUnCho = s.nextLine().charAt(0);
                if (dUnCho == 'I'){
                    //numChoice += 1;
                    number = (int)(Math.random()*100);
                    System.out.println(number);
                    if (number <= 25){//SAX
                        System.out.println("You look into your inventory, to find a sword. ");
                        System.out.println("You approach to slay the band, but they overtake you! \n They surround you and invite you to their band, to sing with them.");
                        System.out.println(gamOv);
                        dead = true;
                    }else if (number >= 26 && number <= 50){//DRAX
                        drill = true;
                        System.out.println("You look into your inventory to find a drill.");
                        stop(1);
                        System.out.println("You drill down and stumble upon some gold! \n Added to inventory. \n You keep drilling down, until you fall down and realize it was all a trap! Down there, an angry brother clones himself and surrounds you. Do you go back to surface, S, or go further down, D?");
                        dUnCho = s.nextLine().charAt(0);
                        if (dUnCho == 'S'){
                            System.out.println("You drill back to the surface. However, the Oasis is still there. \n Your head begins to hurt.");
                            System.out.println(gamOv);
                        }else if (dUnCho == 'D'){
                            System.out.print("You drill down, and");
                            cave(false);
                        }//DIG STRAIGHT DOWN

                    }else if (number >= 51 && number <= 75){//VAX
                        System.out.println("Looking in your inventory, you find something labeled a 'Memory Vaccine'. You inject the Epi-Pen looking device into your leg and voila! You feel a bit dizzy as your memories rush back, and you sit down on a ledge.");
                        stop(1);
                        System.out.println("Except...No. Something definitely isn't right. These aren't your memories, these are stock photos from Google. You look down at the bottle, and bright red text flashes, 'You didn't think it'd be that easy, did you?'");
                        stop(1);
                        System.out.println("You fall off the ledge, unconscious");
                        cave(false);
                    }else if (number >= 76 && number <= 100){//WAX
                        System.out.println("You find wax!\nYou plug your ears and are now immune to the music. \n You keep going through the desert, and see a house in the distance. ");
                        stop(1);
                        System.out.println("You walk towards it.");
                        house();
                    }//THE INVENTORY

                }//INVENTORY 
                else if (dUnCho == 'S'){
                    number = (int)(Math.random()*100);
                    System.out.println(number);
                    if (number <= 50){
                        System.out.println("You keep listening, and you kinda like it. \n Then");
                        stop(1);
                        System.out.println("BAM!");
                        System.out.println(gamOv);
                    }else if (number >=100){
                        System.out.println("You realize your head hurts and you run past them. \n You see a house in the distance, and run to it.");
                        house();
                    }//DIE OR SURVIVE?
                }//SURVIVE
        } else if (dUnCho == 'R') { //RUN AWAY!
            System.out.println("You leave the Oasis. Now out of water and nutrients, you have " + days + " days left to live.");
            System.out.println("But wait!");
            stop(1);
            System.out.println("You...");
            stop(1);
            System.out.print("you remember something.");
            stop(1);
            System.out.println("Something about...a house! \n A house in the desert! \n But where is it?");
            stop(1);
            System.out.println("Looking around, you realize the sun is being blocked by something to the West.");
            stop(1);
            System.out.println("You can walk towards it, W, or go back to your hut, H.");
                dUnCho = s.nextLine().charAt(0);
                if (dUnCho == 'W'){
                    house();
                } else if (dUnCho == 'H'){
                    Opening.opening(0);
                }//GO BIG OR GO HOME
        }//DESERT PAGE UNO CHOICES
    }//STATIC VOID

    public static void house() throws InterruptedException {
        char dDoCho;
        double number;
        Scanner s = new Scanner(System.in);
        System.out.println("You finally reach the house, but two men guard the doors.");
        stop(1);
        System.out.println("'One of us tells truth, the other tells lies.' \nYou ask 91/7, and the man on the right, R, says 13. \nThe man on the left, L, says 12. Which door do you go through?");
        dDoCho = s.nextLine().charAt(0);
        if (dDoCho == 'R'){
            System.out.println("Congratulations! You beat the game. ");
            stop(2);
            System.out.println("Just kidding! You've made it to a strange new world: The Console. This is your new home. Let's find your memories.");
            stop(1);
            System.out.println("Woah! Is that a dog? Wanna keep it? Y/N");
            dDoCho = s.nextLine().charAt(0);
            if (dDoCho == 'Y'){
                boolean dumb = true;
                System.out.println("He seems to be leading us somewhere! Let's follow him. \n What a...dark cave. \n Wait, it kinda smells like chlorofo-");
                System.out.println("GAME OVER");
            }else if (dDoCho == 'N'){
                boolean noFun = true;
                System.out.print("Sad...");
                stop(1);
                System.out.println("But understandable. We must keep searching. Now what is this...a locked door? \n We must have missed some type of key. Should we brute force, B,  or go back, G?");
                dDoCho = s.nextLine().charAt(0);
                if (dDoCho == 'B'){
                    System.out.print("You smash against the door to...");
                    number = (Math.random()*10);
                    if (number <= 5){
                        System.out.println("no avail.");
                        System.out.println("That's ok, lets go back and look for the key. Look! A cave! Let's go explore.");
                        cave(true);
                    }else {
                        System.out.println("success!");
                        boss();
                    }
                }else if (dDoCho == 'G'){
                    System.out.println("Hey, it looks like there's a cave over there! Let's go explore.");
                    cave(true);
                }
        }else if (dDoCho == 'L'){
            System.out.println("Oh no! You've fallen and you can't get up! 2 choices: Get up or die. \n But I get to choose... ");
            stop(1);
             number = (Math.random()*10);
            if (number == 4.379795454379471 || number == 1){
                System.out.println("Wtf...you survived. Sorry, pardon my french. It's just...\n I Didn't expect for this to happen. There was a 2 in 27,000,000,000,000,000 chance that this would happen. Anyways, \n HACKER");
                System.out.println("GAME un-OVER?");
            }
            else {
               System.out.println("Sorry, you died. \n GAME OVER");
                }


            }
           
        }

    }//HOUSE METHOD

    public static void cave(boolean door) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        if (door){

            System.out.println("What's that?");
            
        }else if (!door){
            int decisive = (int)(Math.random()*10);
            if (decisive <=5){
                System.out.println("You fall, unconscious, down a dark cave and splash into an underground river.");
                System.out.println("Wow! I can't believe we survived that! \n Let's explore the cave. What's that?");
            }else if (decisive >= 6){
                System.out.println("GAME OVER");
                System.exit(0);
            } 

        }
        System.out.println("It appears to be...some kind of KEY_TOKEN left here by the devs.");
        stop(1);
        System.out.println("Who are the devs? To be honest, I have no idea. But I assume they're the ones who took...you know what.");
        boolean key = true;
        System.out.println("Anyways, let's move on and find the lock to this key.");
        System.out.println("You Move forwards and approach a dead end. Check your inventory, maybe you picked something up.");
        if (drill){
            System.out.println("It's the gold! You craft a golden pickaxe and break down the wall.");
        }else {
            System.out.println("Nothing in your inventory... maybe look around? Look- a fallen drill! Maybe we can use that.");
        }
        System.out.println("The wall breaks! Behind it is some sort of...old door. Very thick, and mossy, and a hard wood. \n Oh wait! There's a lock that seems to fit our key, K. Let's try it!");
        char dTrCho = s.nextLine().charAt(0);
        if (dTrCho == 'k' || dTrCho == 'K'){
            if (key){
                System.out.println("creeeeaaaaaakkk");
                stop(1);
                System.out.println("The door opened! Oh my! It's a boss fight. Press A to attack.");
                System.out.print("You have 50/50 health, while the boss...this...");
                stop(1);
                System.out.println("CompSci teacher has...150/150??");
                System.out.println("Again, click A to fight.");
                dTrCho = s.nextLine().charAt(0);
                if (dTrCho == 'a' || dTrCho == 'A'){
                    System.out.println("You swing, and hit! He is now at 100 health. However, he hits you with his usual move-- A LONG ASSIGNMENT!!!! \n DUHN DUHN DUHHHHHHN \n Do you...dodge, D, or attack back, A?");
                   dTrCho = s.nextLine().charAt(0);
                   switch(dTrCho){
                        case 'D':
                        System.out.println("You dodge, and just barely survive. \n Stats: \n You: 35/50 \n That...evil thing: 75/150.");
                        stop(1);
                        System.out.println("Turning around, you leap forwards and immediatly obfuscate your code, making his job 100 times harder...wait no! \n He's using an online deobfuscator! He jumps forwards, already done grading. You, my friend, are done for. I'll see you on the other side.");
                        System.out.println("GAME OVER: Made it all this way, just to die. Pathetic. Play again to win.");
                            break;
                        case 'A':
                            System.out.println("You attack back, and you hit him! He staggers back, dazed by your blow! \n");
                            System.out.println("Stats: \n You: 45/50 \n CompSci Teacher: 50/100 \n He hits you with his final move...");
                            stop(2);
                            System.out.println("A text-adventure project.");
                            stop(1);
                            System.out.println("You fall down, now at 25 health. You get back up and hit one more time, \n and you knock him backwards, taking your code from StackOverflow. He falls down, dropping a FizzBuzz script from an interview, and another script, that holds your memories. \n Click D to claim and continue.");
                            dTrCho = s.nextLine().charAt(0);
                            switch(dTrCho){
                                case 'D':
                                System.out.println("Your memories! You found them. Well, I guess this is it. Goodbye!");
                                System.out.println("GAME OVER: The 2 in 27,000,000,000,000,000. You win.");
                                    break;
                                case 'F':
                                    fizzbuzz.main(new String[0]);
                                    System.out.println("Oh..I guess it works? Idk, anyways, let's go, we lost the memories so you work for the devs now. \n I hear he's a CompSci 2 student now.");
                                    System.out.println("GAME OVER: What an idiot. The devs already know who you are. \n We will reach out shortly ;).");
                                    break;
                            }
                            break;
                   }
                }
            }else if (!key){
                System.out.println("Begone, Hacker! Only real players get to play.");
            }
        }
        
        
    }//CAVE METHOD
    public static void boss() throws InterruptedException {
        char dQuCho;
        Scanner s = new Scanner(System.in);
        System.out.println("creeeeaaaaaakkk");
                stop(1);
                System.out.println("The door opened! Oh my! It's a boss fight. Press A to attack.");
                System.out.print("You have 50/50 health, while the boss...this...");
                stop(1);
                System.out.println("CompSci teacher has...150/150??");
                System.out.println("Again, click A to fight.");
                dQuCho = s.nextLine().charAt(0);
                if (dQuCho == 'a' || dQuCho == 'A'){
                    System.out.println("You swing, and hit! He is now at 100 health. However, he hits you with his usual move-- A LONG ASSIGNMENT!!!! \n DUHN DUHN DUHHHHHHN \n Do you...dodge, D, or attack back, A?");
                   dQuCho = s.nextLine().charAt(0);
                   switch(dQuCho){
                        case 'D':
                        System.out.println("You dodge, and just barely survive. \n Stats: \n You: 35/50 \n That...evil thing: 75/150.");
                        stop(1);
                        System.out.println("Turning around, you leap forwards and immediatly obfuscate your code, making his job 100 times harder...wait no! \n He's using an online deobfuscator! He jumps forwards, already done grading. You, my friend, are done for. I'll see you on the other side.");
                        System.out.println("GAME OVER: Made it all this way, just to die. Pathetic. Play again to win.");
                            break;
                        case 'A':
                            System.out.println("You attack back, and you hit him! He staggers back, dazed by your blow! \n");
                            System.out.println("Stats: \n You: 45/50 \n CompSci Teacher: 50/100 \n He hits you with his final move...");
                            stop(2);
                            System.out.println("A text-adventure project.");
                            stop(1);
                            System.out.println("You fall down, now at 25 health. You get back up and hit one more time, \n and you knock him backwards, taking your code from StackOverflow. He falls down, dropping a script, that holds your memories. \n Click D to claim and continue.");
                            dQuCho = s.nextLine().charAt(0);
                            switch(dQuCho){
                                case 'D':
                                System.out.println("Your memories! You found them. Well, I guess this is it. Goodbye!");
                                System.out.println("GAME OVER: The 2 in 27,000,000,000,000,000. You win.");
                                    break;
                            }
                   }
                }
    }//bossroom
   public static void stop(int ms) throws InterruptedException {
       Thread.sleep((ms * 1000));
   }
   
}//PUBLIC CLASS