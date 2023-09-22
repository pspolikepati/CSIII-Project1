import mayflower.*;
public class MovableBackground extends Actor
{
    
    public MovableBackground()
    {
        
    }

    public void act()
    {
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        setLocation(x - 1, y);
        
    }
}
