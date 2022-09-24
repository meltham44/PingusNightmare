import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ControlsButton extends Actor
{

    public ControlsButton()
    {
        setImage("controlsbutton.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 6, image.getHeight() / 6);
        setImage(image);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Controls());
        }
    }    
}
