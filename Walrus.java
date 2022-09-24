import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Walrus extends Actor
{

    public Walrus()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 8, image.getHeight() / 8);
        setImage(image);
    }
    
    public void act() 
    {
        move(20);
        if (isAtEdge())
        {
            getImage().mirrorVertically();
            turn(180);
        }
    }    
}
