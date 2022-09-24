    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    public class WalrusSnowball extends Actor
    {
        
        int WalrusSnowballRemoved = 0;
        
        public WalrusSnowball()
        {
            setImage("snowball.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() / 8, image.getHeight() / 8);
            setImage(image);
        }    
        
        public void act() 
        {   
            move(10);
            Pingu location = (Pingu)getWorld().getObjects(Pingu.class).get(0);
            turnTowards(location.getX(), location.getY());
            
            WalrusSnowballRemoved = 0;
            
            Actor wallCell = getOneIntersectingObject(Wall.class);
            if (wallCell !=null)
            {
               getWorld().removeObject(this);
               WalrusSnowballRemoved = 1;
            }
            
            if (WalrusSnowballRemoved == 0)
            {
                Actor touchingPingu = getOneIntersectingObject(Pingu.class);
                if (touchingPingu !=null)
                {
                    getWorld().removeObject(this);
                    touchingPingu.setLocation(38, 203);
                    Greenfoot.setWorld(new Level2());
                }
            }
        
        }
    }
