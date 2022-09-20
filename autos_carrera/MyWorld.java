import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.TimeUnit;

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1);
        crear();
        crear_obstaculos();
    }
    
    private void crear()
    {
        Mclaren mclaren_1 = new Mclaren();
        addObject(mclaren_1, 300, 640);
    }
    
    public void crear_obstaculos()
    {
        int x;
        int v;
        // int cont = 0;
        // String name;
        for (int i=0; i<20; i++){
            x = Greenfoot.getRandomNumber(600);
            v = Greenfoot.getRandomNumber(20);
            if (x > 180 && x < 420 && v > 0){
                Obstaculo name = new Obstaculo(v);
                addObject(name, x, 50);
                // Thread.sleep(500);
            }
        }
        
        
        // if (x > 180 && x < 420 && v > 0)
        // {
            // Obstaculo name = new Obstaculo(v);
            // addObject(name, x, 50);
            // while (0==0)
            // {
                // name = "obstaculo_"+cont;
                // cont += 1;
                // Obstaculo name = new Obstaculo(v);
                // addObject(name, 20, num);
            // } 
        // }
        
    }
}
