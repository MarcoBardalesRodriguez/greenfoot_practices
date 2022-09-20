import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mclaren extends Actor
{
    public void act()
    {
        int y = getY();
        int x = getX();
        
        if (Greenfoot.isKeyDown("Right") && getX()<440)
        {
            x+=2;
        }
        if (Greenfoot.isKeyDown("Left") && getX()>170)
        {
            x-=2;
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            y-=5;
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            y+=5;
        }
        setLocation(x,y);
    }
}
