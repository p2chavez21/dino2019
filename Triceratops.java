
public class Triceratops extends Dinosaur
{
    public Triceratops()
    {
        super("Triceratops");
    }
    
    public boolean attack(Dinosaur def)
    {
        if(def.getType().equals("Tericeratops")) //both attcker and defender are TRex
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
