import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rana extends Actor
{
    public void act()
    {
        int y = getY();
        
        if (Greenfoot.isKeyDown("Right"))
        {
            move(5);
            comer();
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            move(-5);
            comer();
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            y-=5;
            comer();
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            y+=5;
            comer();
        }
        setLocation(getX(),y);
        
    }
    public void comer()
    {
        Actor Mosca;
        Mosca = getOneObjectAtOffset(0, 0, Mosca.class);
        
        World mundo;
        mundo = getWorld();
        
        if (Mosca!=null){
            mundo.removeObject(Mosca);
        }   
    }
}
