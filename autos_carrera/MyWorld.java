import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1);
        crear();
    }
    
    private void crear()
    {
        Ferrari ferrari_1 = new Ferrari();
        addObject(ferrari_1, 175, 640);
        Mclaren mclaren_1 = new Mclaren();
        addObject(mclaren_1, 425, 640);
    }
}
