import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends World
{

    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    private void prepare()
    {
        Pingu.powerup = 0;
        Walrus walrus = new Walrus();
        addObject(walrus,54,119);
        walrus.setLocation(24,111);
        Walrus walrus2 = new Walrus();
        addObject(walrus2,26,172);
        Walrus walrus3 = new Walrus();
        addObject(walrus3,33,253);
        walrus3.setLocation(29,236);
        walrus2.setLocation(29,183);
        walrus3.setLocation(29,229);
        walrus2.setLocation(299,180);
        walrus3.setLocation(573,256);
        Pingu pingu = new Pingu();
        addObject(pingu,290,352);
        pingu.setLocation(296,377);
        pingu.setLocation(436,446);
        walrus3.setLocation(819,295);
        walrus2.setLocation(433,218);
        pingu.setLocation(288,366);
        walrus2.setLocation(292,203);
        walrus3.setLocation(550,284);
        walrus2.setLocation(300,196);
        walrus3.setLocation(589,260);
        walrus2.setLocation(312,193);
        walrus.setLocation(33,100);
        walrus.setLocation(40,111);
        walrus3.setLocation(564,260);
        walrus.setLocation(31,109);
        Fish fish = new Fish();
        addObject(fish,294,28);
        fish.setLocation(294,43);
        fish.setLocation(305,32);
        pingu.setLocation(314,377);
        pingu.setLocation(310,362);
        pingu.setLocation(304,364);
    }
}
