import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mosca extends Actor
{
    public void act()
    {
        Actor Mosca;
        Mosca = getOneObjectAtOffset(0, 0, Mosca.class);

        // World mundo;
        // mundo = getWorld();

        // if (Mosca!=null){
        // mundo.removeObject(Mosca);
        // }
        while (Mosca==Mosca) {
            int random = Greenfoot.getRandomNumber(8);
            int y = getY();

            switch(random) {
                case 0:
                    // right
                    move(10);
                case 1:
                    // left
                    move(-10);
                case 2:
                    // top
                    y-=10;
                case 3:
                    // bottom
                    y+=10;
                case 4:
                    // top rigth
                    y-=10;
                    move(10);
                case 5:
                    // bottom right
                    y+=10;
                    move(10);
                case 6:
                    // top left
                    y-=10;
                    move(-10);
                case 7:
                    // bottom left
                    y+=10;
                    move(-10);
                default:
                    // code block
            }
            setLocation(getX(),y);
        }

    }
}
