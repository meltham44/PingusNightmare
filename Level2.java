import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World
{

    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        prepare();
    }

    private void prepare()
    {
        Pingu pingu = new Pingu();
        addObject(pingu,44,201);
        pingu.setLocation(38,203);
        WalrusWithSnowball walrusWithSnowball = new WalrusWithSnowball();
        addObject(walrusWithSnowball,462,136);
        walrusWithSnowball.setLocation(505,50);
        WalrusWithSnowball walrusWithSnowball2 = new WalrusWithSnowball();
        addObject(walrusWithSnowball2,413,174);
        walrusWithSnowball2.setLocation(398,186);
        WalrusWithSnowball walrusWithSnowball3 = new WalrusWithSnowball();
        addObject(walrusWithSnowball3,485,293);
        walrusWithSnowball3.setLocation(499,302);
        Wall wall = new Wall();
        addObject(wall,178,195);
        wall.setLocation(170,197);
        PowerUp powerUp = new PowerUp();
        addObject(powerUp,41,279);
        powerUp.setLocation(48,281);
        powerUp.getX();
        powerUp.getY();
        powerUp.setLocation(50,326);
        Pingu.powerup = 0;
        Bed bed = new Bed();
        addObject(bed,493,172);
        bed.setLocation(555,196);
    }
}
