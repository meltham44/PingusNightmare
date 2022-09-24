import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Wall extends Actor
{
  
    public Wall()
    {
        setRotation(90);
        setImage("wall.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
