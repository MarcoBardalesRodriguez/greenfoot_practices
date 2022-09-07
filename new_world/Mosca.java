import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mosca extends Actor
{
    /**
     * Act - do whatever the Mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int y = getY();
        
        if (Greenfoot.isKeyDown("e")){
            move(10);
        }
        if (Greenfoot.isKeyDown("a")){
            move(-10);
        }
        if (Greenfoot.isKeyDown(",")){
            y-=10;
        }
        if (Greenfoot.isKeyDown("o")){
            y+=10; 
        }
        setLocation(getX(),y);
    }
}
