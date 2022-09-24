import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PinguSnowball extends Actor
{
    
    int snowballRemoved = 0;
    
    public PinguSnowball()
    {
        setImage("snowball.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 8, image.getHeight() / 8);
        setImage(image);
    }
    
    public void act() 
    {
        move(10);
        if (!getWorld().getObjects(WalrusWithSnowball.class).isEmpty())
        {
            WalrusWithSnowball location = (WalrusWithSnowball)getWorld().getObjects(WalrusWithSnowball.class).get(0);
            turnTowards(location.getX(), location.getY());
        }    
        snowballRemoved = 0;
            
        Actor wallCell = getOneIntersectingObject(Wall.class);
        if (wallCell !=null)
        {
            getWorld().removeObject(this);
            snowballRemoved = 1;
        }
            
        if (snowballRemoved == 0)
        {
            Actor touchingWalrusWithSnowball = getOneIntersectingObject(WalrusWithSnowball.class);
            if (touchingWalrusWithSnowball !=null)
            {
                getWorld().removeObject(this);
                touchingWalrusWithSnowball.getWorld().removeObject(touchingWalrusWithSnowball);
            }
        }
    }    
}
