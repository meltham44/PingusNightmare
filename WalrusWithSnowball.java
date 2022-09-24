import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WalrusWithSnowball extends Actor
{
    
    public WalrusWithSnowball()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 8, image.getHeight() / 8);
        setImage(image);
    }
    
    public void act() 
    {
        Pingu location = (Pingu)getWorld().getObjects(Pingu.class).get(0);
        turnTowards(location.getX(), location.getY());
        fire();
    }
    
    public void fire()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        {
            getWorld().addObject(new WalrusSnowball(), getX(), getY());
        }
    }
}
