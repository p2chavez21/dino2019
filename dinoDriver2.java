
/**
 * Write a description of class dinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dinoDriver2
{
    public static void main(String[] args) //void is a return type 
                                           //static is a term that's for an entire class
    {
       Dinosaur[] pop = new Dinosaur[100];
       
       for(int i=0; i<33; i++)
       { pop[i] = new TRex();
       }
       
       for(int i=33; i<66; i++)
       { pop[i] = new Pterodactyl();
       }
       
       for(int i=66; i<pop.length; i++)
       { pop[i] = new Triceratops();
       }
       
       for(int i=0; i<pop.length; i++)
       {
           int rand = (int)(Math.random()*32);
           for(int j = 0; j<rand; j++)
           {
               pop[i].ageUp();
           }
       }
       
       int winCount = 0, deadCount = 0, battleCount = 0, rndCount = 0;
       
       while(dinoDriver2.livingDinos(pop) >= 2)
       {
           for(Dinosaur d: pop) //for each loop     //d is a local variable
           {
               if(d.getIsAlive() == true && dinoDriver2.livingDinos(pop) >= 2) //write code to ensure that 2 dinos are alive
               {
                   Dinosaur defend = dinoDriver2.getDefender(pop, d);
                   battleCount++;
                   if(d.attack(defend))
                   winCount++;
                }
           }
       }
       
       System.out.println("Dead Dinos: "+deadCount);
       System.out.println("Total Battles: "+battleCount +" Total Wins: "+winCount);
        
    }  
    
    public static int livingDinos (Dinosaur [] p )
    {
        int living = 0;
        for(Dinosaur d: p)
       
        if(d.getIsAlive())
        living++;

        return living;
    }
   
        
    public static Dinosaur getDefender(Dinosaur[] p, Dinosaur attacker)
    {
        Dinosaur def;
        //write code that will get a random dino from p that is not the attacker
        
        //Write code that will ensure def is alive
        
        do //def is the attcking dino //memory location of both dinosaur are the same
        {                 
            int rand = (int)(Math.random()*p.length);
            def = p[rand];
        }   while(def == attacker || !def.getIsAlive());
        
        return def;
    }
                              
}
