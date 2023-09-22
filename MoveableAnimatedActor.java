import mayflower.*;
public class MoveableAnimatedActor extends AnimatedActor{
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idle;
    private Animation idleLeft;
    private Animation fallRight;
    private Animation fallLeft;
    private String currentAction;
    private String direction;
    
    public MoveableAnimatedActor(){
        direction = "right";
    }
    
    public void act(){
        String newAction = null;
        super.act();
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if(currentAction == null){
            newAction = "idle";
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT)) {
            if(x + w < 800){
                setLocation (x + 1, y);
                newAction = "walkRight";
                direction = "right";
                if(isBlocked()){
                    setLocation (x - 1, y);
                }
            }
        } else if (Mayflower.isKeyDown(Keyboard.KEY_LEFT)){
            if(x > 0){
                setLocation (x - 1, y);
                newAction = "walkLeft";
                direction = "left";
                if(isBlocked()){
                    setLocation (x + 1, y);
                }
            }
        } else if (Mayflower.isKeyDown(Keyboard.KEY_UP)){
            if(y > 0)
            setLocation (x, y - 5);
            if(isBlocked()){
                    setLocation (x, y + 1);
                }
        } else if(Mayflower.isKeyDown(Keyboard.KEY_DOWN)){
            if(y + h < 600)
            setLocation (x, y + 1);
            if(isBlocked()){
                    setLocation (x, y - 1);
                }
        } else{
            newAction = "idle";
            if(direction != null && direction.equals("left")){
                newAction = "idleLeft";
            }
        }
        if(isBlocked()){
                    setLocation (x - 1, y);
                }
        
        if(isFalling()){
            
            if(direction != null && direction.equals("left"))
                newAction = "fallLeft";
             else if(direction != null && direction.equals("right")){
                newAction = "fall";
                }
        }
        
        if (newAction != null && !newAction.equals(currentAction)){
            if(newAction.equals("idle")){
                setAnimation(idle);
                currentAction = newAction;
            }else if(newAction.equals("idleLeft")){
                setAnimation(idleLeft);
                currentAction = newAction;
            }else if(newAction.equals("walkRight")){
                setAnimation(walkRight);
                currentAction = newAction;
            }else if(newAction.equals("walkLeft")){
                setAnimation(walkLeft);
                currentAction = newAction;
            }else if (newAction.equals("fall")){
                setAnimation(fallRight);
                currentAction = newAction;
            }else if (newAction.equals("fallLeft")){
                setAnimation(fallLeft);
                currentAction = newAction;
            }
            
        }
    }
    
    
    public void setIdleAnimation(Animation ani){
        idle = ani;
    }
    
    public void setIdleLeftAnimation(Animation ani){
        idleLeft = ani;
    }
    
        public void setWalkRightAnimation(Animation ani){
        walkRight = ani;
    }
    
        public void setWalkLeftAnimation(Animation ani){
        walkLeft = ani;
    }
    
        public void setFallRightAnimation(Animation ani){
        fallRight = ani;
    }
        public void setFallLeftAnimation(Animation ani){
        fallLeft = ani;
    }
    public void setAnimation(Animation a){
        super.setAnimation(a);
    }
}