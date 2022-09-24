import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bed extends Actor
{
    public Bed()
    {
        setImage("bed.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 8, image.getHeight() / 8);
        setImage(image);
    }    
    
    public void act()
    {
        // Add your action code here.
    }    
}
