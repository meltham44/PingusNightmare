import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayButton extends Actor
{
    public PlayButton()
    {
        setImage("playbutton.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 6, image.getHeight() / 6);
        setImage(image);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1());
        }
        
    }    
}
