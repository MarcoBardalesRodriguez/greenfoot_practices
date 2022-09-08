import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mosca extends Actor
{
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
