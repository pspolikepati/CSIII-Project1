import mayflower.*;
public class GravityActor extends Actor{
    public void act(){
        setLocation(getX(), getY() + 1);
        
        if(isBlocked())
            setLocation(getX(), getY() - 1);
       
    }
    
    public boolean isFalling()
    {
        boolean ret;
        // move the actor down and see if it touches a block
        setLocation(getX(), getY() + 1);
        ret = isTouching(Block.class);
        setLocation(getX(), getY() - 1);
        return !ret;
    }
    
    public GravityActor(){
    
    }
    
    public boolean isBlocked(){
        return isTouching(Block.class);
    }
}