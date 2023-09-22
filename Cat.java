import mayflower.*;

public class Cat extends MoveableAnimatedActor
{
    private Animation walk;
    private Animation idle;
    private Animation idleLeft;
    private Animation walkLeft;
    private Animation fall;
    private Animation fallLeft;
    
    public Cat() 
    {
        String[] walking = new String[10];
        for(int i = 0; i < walking.length; i++){
            walking[i] = "img/cat/Walk (" + (i + 1) + ").png";
        }
        walk = new Animation(50, walking);
        setWalkRightAnimation(walk);
        walk.scale(100, 87);
        walk.setBounds(18, 5, 54, 80);
        
        String[] idling = new String[10];
        for(int i = 0; i < idling.length; i++){
            idling[i] = "img/cat/Idle (" + (i + 1) + ").png";
        }
        idle = new Animation(50, idling);
        setIdleAnimation(idle);
        idle.scale(100, 87);
        idle.setBounds(18, 5, 54, 80);
        
        String[] idlingLeft = new String[10];
        for(int i = 0; i < idlingLeft.length; i++){
            idlingLeft[i] = "img/cat/Idle (" + (i + 1) + ").png";
        }
        idleLeft = new Animation(50, idlingLeft);
        setIdleLeftAnimation(idleLeft);
        idleLeft.mirrorHorizontally();
        idleLeft.scale(100, 87);
        idleLeft.setBounds(28, 5, 54, 80);
        
        
        String[] walkingLeft = new String[10];
        for(int i = 0; i < walkingLeft.length; i++){
            walkingLeft[i] = "img/cat/Walk (" + (i + 1) + ").png";
        }
        walkLeft = new Animation(50, walkingLeft);
        setWalkLeftAnimation(walkLeft);
        walkLeft.scale(100, 87);
        walkLeft.mirrorHorizontally();
        walkLeft.setBounds(28, 5, 54, 80);
        
        String[] falling = new String[8];
        for(int i = 0; i < falling.length; i++){
            falling[i] = "img/cat/Fall (" + (i + 1) + ").png";
        }
        fall = new Animation(50, falling);
        setFallRightAnimation(fall);
        fall.scale(100, 87);
        fall.setBounds(18, 5, 54, 80);
        
        String[] fallingLeft = new String[8];
        for(int i = 0; i < fallingLeft.length; i++){
            fallingLeft[i] = "img/cat/Fall (" + (i + 1) + ").png";
        }
        fallLeft = new Animation(50, fallingLeft);
        setFallLeftAnimation(fallLeft);
        fallLeft.mirrorHorizontally();
        fallLeft.scale(100, 87);
        fallLeft.setBounds(28, 5, 54, 80);
    }
    public void act()
    {
        super.act();
    }
}
