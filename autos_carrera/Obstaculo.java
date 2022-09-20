import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstaculo extends Actor
{
    private int velocidad;
    
    public Obstaculo(int v){
        velocidad = v;
    }
    
    public void act()
    {
        setLocation(getX(),getY()+velocidad);
        
        if (getY() >= getWorld().getHeight()-1)
        {
            MyWorld pantalla = (MyWorld) getWorld();
            pantalla.removeObject(this);
        }
    }
}
