import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ferrari extends Actor
{
    public void act()
    {
        int random = Greenfoot.getRandomNumber(4);
        
        int y = getY();
        int x = getX();
        
        if (random==0 && getX()<440)
        {
            if (getY()>200){
                y-=5;
            }else{
                y+=2;
            }
            x+=5;
        }
        if (random==1 && getX()>170)
        {
            if (getY()>200){
                y-=5;
            }else{
                y+=2;
            }
            x-=5;
        }
        if (random==2)
        {
            if (getY()>200){
                y-=5;
            }else{
                y+=2;
            }
        }
        
        setLocation(x,y);
    }
}
