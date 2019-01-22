
public class Pterodactyl extends Dinosaur
{
    public Pterodactyl()
    {
        super("Pterodactyl");
    }
    
    public boolean attack(Dinosaur def)
    {
        if(def.getType().equals("TRex")) //both attcker and defender are TRex
        {
            if(Math.random() < 0.55)
            {
            this.update (def, true);
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
            if(Math.random() < 0.55)
            {
            this.update(def,true);    
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