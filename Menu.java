import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    private void prepare()
    {
        Pingu.powerup = 0;
        PlayButton playButton = new PlayButton();
        addObject(playButton,169,357);

        ControlsButton controlsButton = new ControlsButton();
        addObject(controlsButton,455,357);
        
    }
}
