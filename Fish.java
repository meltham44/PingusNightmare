import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish extends Actor
{

    public Fish()
    {
        setImage("fish.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 4, image.getHeight() / 4);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
