import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Octopus extends Actor
{
    public Octopus()
    {
        GreenfootImage myImage = getImage();
        int nuevo_alto = (int)myImage.getHeight() * 2;
        int nuevo_ancho = (int)myImage.getWidth() * 2;
        myImage.scale(nuevo_ancho, nuevo_alto);
    }
    
    public void act()
    {
        comer();
    }
    public void comer()
    {
        World mundo;
        mundo = getWorld();
        
        Actor Bee;
        Bee = getOneObjectAtOffset(0, 0, Bee.class);
        Actor Fly;
        Fly = getOneObjectAtOffset(0, 0, Fly.class);
        Actor Spider;
        Spider = getOneObjectAtOffset(0, 0, Spider.class);
        
        
        if (Bee!=null){
            mundo.removeObject(Bee);
        }
        if (Fly!=null){
            mundo.removeObject(Fly);
        }
        if (Spider!=null){
            mundo.removeObject(Spider);
        }
    }
}
