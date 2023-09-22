import mayflower.*;

public class Ninja extends AnimatedActor
{
    private Animation walk;
    
    public Ninja() 
    {
        String[] walking = new String[10];
        for(int i = 0; i < walking.length; i++){
            walking[i] = "img/ninjagirl/Jump_Attack__00" + i + ".png";
        }
        walk = new Animation(50, walking);
        setAnimation(walk);
        walk.scale(80, 100);
        walk.setTransparency(90);
    }
    public void act()
    {
        super.act();
    }
}
