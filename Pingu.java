import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pingu extends Actor
{
    public static int powerup = 0;
    private boolean spaceDown;
    
    public Pingu()
    {
        setImage("pingu.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 8, image.getHeight() / 8);
        setImage(image);
    }
    
    public void act() 
    {   
        if (!spaceDown && Greenfoot.isKeyDown("space"))
        {
            spaceDown = true;
            if (powerup == 1)
            {
                getWorld().addObject(new PinguSnowball(), getX(), getY());
            }
        }
        if (spaceDown && !Greenfoot.isKeyDown("space"))
        {
            spaceDown = false;
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(0);
            setImage("pingu.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() / 8, image.getHeight() / 8);
            setImage(image);
            move(-5);
            Actor wallCell = getOneIntersectingObject(Wall.class);
            if (wallCell !=null)
            {
                move(5);
            }            
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            setImage("pinguright.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() / 8, image.getHeight() / 8);
            setImage(image);
            move(5);
            Actor wallCell = getOneIntersectingObject(Wall.class);
            if (wallCell !=null)
            {
                move(-5);
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            setImage("pinguup.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() / 8, image.getHeight() / 8);
            setImage(image);
            move(5);
            Actor wallCell = getOneIntersectingObject(Wall.class);
            if (wallCell !=null)
            {
                move(-5);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(270);
            setImage("pinguup.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() / 8, image.getHeight() / 8);
            setImage(image);
            move(-5);
            Actor wallCell = getOneIntersectingObject(Wall.class);
            if (wallCell !=null)
            {
                move(5);
            }
        }
        if(isTouching(Walrus.class))
        {
            setLocation(288, 366);
        }
        if(isTouching(Fish.class))
        {
            Greenfoot.setWorld(new Level2());
        }
        if(isTouching(PowerUp.class))
        {
            powerup = 1;
        }
        if(isTouching(Bed.class))
        {
            Greenfoot.setWorld(new Finish());
        }    
    }    
}
