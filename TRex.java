
public class TRex extends Dinosaur
{
    public TRex()
    {
        super("TRex");
    }
    
    public boolean attack(Dinosaur def)
    {
        if(def.getType().equals("TRex")) //both attcker and defender are TRex
        {
            if(Math.random() < 0.65)
            {
                this.update(def, true);
                return true;
            }
            else 
            {
                this.update(def, false);
                return false;
            }
        }
        else if(def.getType().equals("Pterodactyl"))
        {
            if(Math.random() < 0.95)
            {   
                this.update(def, true);
                return true;
            }
            else
            {
                this.update(def, false);
                return false;
            }
        }
        else 
        {
            return false;
        }
    }
}
 