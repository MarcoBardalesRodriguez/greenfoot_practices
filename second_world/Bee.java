import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bee extends Actor
{
    public void act()
    {
        if (Greenfoot.getRandomNumber(10)< 5){
            turn(5);
            move(2);
        }else{
            turn(-5);
            move(2);
        }
        turn(1);
    }
}
