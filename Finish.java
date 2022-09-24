import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Finish extends World
{

    public Finish()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,440,276);
        playButton.setLocation(436,289);
    }
}
