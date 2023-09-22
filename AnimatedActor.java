import mayflower.*;
public class AnimatedActor extends GravityActor{
    private Animation animation;
    private Timer animationTimer;
    public AnimatedActor(){
        animationTimer = new Timer(1000);
    
    }
    
    public void setAnimation(Animation a){
        animation = a;
        animationTimer.set(100000000 / animation.getFrameRate());
    }
    
    public void act(){
        super.act();
        if(animation != null){
            if (animationTimer.isDone()){
                animationTimer.reset();
                MayflowerImage test = new MayflowerImage(animation.getNextFrame());
                setImage(test);
            }
        }
    }
}