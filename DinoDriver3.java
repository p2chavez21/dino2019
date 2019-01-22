
/**
 * Write a description of class DinoDriver3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class DinoDriver3
{
    public static void main(String[] args)
    {
        ArrayList <Dinosaur> myPop = new ArrayList<Dinosaur>();

        //prompt the user to enther the number of dinos in the population
        //Fill the list randomly with the three types
        //Age up these dinos randomly as well

        System.out.print("How many dinosaurs in the population?");
        Scanner scan = new Scanner(System.in);
        int pop = scan.nextInt();
        System.out.println(pop);
        int winCount = 0, deadCount = 0, battleCount = 0, roundCount = 0;

        for(int i=0; i< pop; i++); //begin at 0, then increase by one
        {
            double num = Math.random();
            double age = Math.random();

            if(num < 0.33)
            {
                myPop.add(new TRex()); //creates new TRex
            }
            else if(num > 0.67)
            {
                myPop.add(new Pterodactyl());
            }
            else
            {
                myPop.add(new Triceratops());
            }
            
            for(Dinosaur d : myPop) //for int i = 0; 1 < myPop.size(); i++
                                    //Length is for arrays, size is for Array Lists
            {
                int rand = (int)(Math.random()*33);
                for(int i = 0; i<rand; i++)
                    d.ageUp();
            }
        }
        
         while(DinoDriver3.livingDinos(myPop) > 1)
         {
           for(Dinosaur d: myPop) //for each loop     //d is a local variable
           {
               if(d.getIsAlive() == true && DinoDriver3.livingDinos(myPop) > 1) //write code to ensure that 2 dinos are alive
               {
                   Dinosaur defend = DinoDriver3.getDefender(myPop, d);
                   battleCount++;
                   if(d.attack(defend))
                   winCount++;
                }
           }
        }
        
        System.out.println("Total Battles: "+battleCount +" Total Wins: "+winCount);
        System.out.println("Round: "+roundCount);
    }
    
    public static int livingDinos (ArrayList<Dinosaur> p)
    {
        int living = 0;
        for(Dinosaur d:p)
       
            if(d.getIsAlive())
            living++;

        return living;
    }
    
    public static Dinosaur getDefender(ArrayList<Dinosaur>p, Dinosaur attacker)
    {
        Dinosaur def;
        
        do //def is the attcking dino //memory location of both dinosaur are the same
        {                 
            int rand = (int)(Math.random()*p.size());
            def = p.get(rand);
        }   while(def == attacker || !def.getIsAlive());
        
        return def;
  
    }
    
    public static int Mateable(ArrayList<Dinosaur>p)
    {
        for(Dinosaur d: p)
        if(this.health>20 && this.age>7<32)
        {
            Dinosaur d=true;
        }
        else
        {
            return false;
        }
    }
    
    public static int danceCard(ArrayList<Dinosaur>p)
    {
         rand = (int)(Math.random()*10); //select 10% of population to mate 
    }
    
    public static int Wedding(ArrayList dc, d)
    {
        if(d.mateable())
        {
            for(Dinosaur m: dc)
            {
                for(int i = 0; i<5; i++)
                {
                    myPop.add(newTrex());
                }
            }
        }
        else
        {
            return false;
        }
    }

}