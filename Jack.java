import mayflower.*;

public class Jack extends AnimatedActor
{
    private Animation walk;
    
    public Jack() 
    {
        String[] walking = new String[7];
        for(int i = 0; i < walking.length; i++){
            walking[i] = "img/jack/Walk (" + (i + 1) + ").png";
        }
        walk = new Animation(50, walking);
        setAnimation(walk);
        walk.scale(100, 160);
        walk.setTransparency(60);
    }
    public void act()
    {
        super.act();
    }
}
