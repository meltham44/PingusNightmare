import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PowerUp extends Actor
{

    
    public PowerUp()
    {
        setImage("powerup.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 10, image.getHeight() / 10);
        setImage(image);
    }
    
    public void act() 
    {
        if(Pingu.powerup == 1)
        {
            getWorld().removeObject(this);
        }
    }    
}
