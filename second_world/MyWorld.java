import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(708, 708, 1);
        crear();
    }
    private void crear()
    {
        Fly fly_1 = new Fly();
        addObject(fly_1, 100, 100);
        
        Fly fly_2 = new Fly();
        addObject(fly_2, 200, 200);
        
        Bee bee_1 = new Bee();
        addObject(bee_1, 200, 100);
        
        Bee bee_2 = new Bee();
        addObject(bee_2, 300, 200);
        
        Spider spider_1 = new Spider();
        addObject(spider_1, 300, 100);
        
        Spider spider_2 = new Spider();
        addObject(spider_2, 400, 200);
        
        Duke duke = new Duke();
        addObject(duke, 354, 454);
        
        Octopus pulpito = new Octopus();
        addObject(pulpito, 600, 600);
        
    }
}
