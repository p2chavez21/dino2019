
/**
 * Write a description of class dinoDriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dinoDriver1
{
    public static void main (String[] args)
    {
        Dinosaur d1 = new TRex();
        Dinosaur d2 = new Pterodactyl();
        Dinosaur d3 = new Triceratops();
        d1.setHealth(100);
        d2.setHealth(100);
        d3.setHealth(100);
        
        int winCount = 0;
        for(int i =0; i<1000; i++)
        {
            if(d1.attack(d2))
                winCount++;    
            System.out.println(d1.toString()+" *** "+d2.toString());
        }
        System.out.println(""+winCount+" out of 100 attacks");
        
    }
}
    
