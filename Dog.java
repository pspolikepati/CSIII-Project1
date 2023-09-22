import mayflower.*;

public class Dog extends AnimatedActor
{
    private Animation walk;
    
    public Dog() 
    {
        String[] walking = new String[10];
        for(int i = 0; i < walking.length; i++){
            walking[i] = "img/dog/Walk (" + (i + 1) + ").png";
        }
        walk = new Animation(50, walking);
        setAnimation(walk);
        walk.scale(60, 60);
        walk.setTransparency(30);
    }
    public void act()
    {
        super.act();
    }
}
