import mayflower.*;
public class Animation{
    private MayflowerImage[] frames;
    private int framerate;
    private int currentFrame;
    
    public Animation(int framerate, String[] animation){
        this.framerate = framerate;
        frames = new MayflowerImage[animation.length];
        for (int i = 0; i < animation.length; i++){
            frames[i] = new MayflowerImage(animation[i]);
        }
        currentFrame = 0;
    }
    
    public int getFrameRate(){
        return framerate;
    }
    
    public void scale(int w, int h){
        for(int i = 0; i < frames.length; i++){
            frames[i].scale(w, h);
        }
    }
    public void setTransparency(int percent){
        for(int i = 0; i < frames.length; i++){
            frames[i].setTransparency(percent);
        }
    }
    public void mirrorHorizontally(){
        for(int i = 0; i < frames.length; i++){
            frames[i].mirrorHorizontally();
        }
    }
    public MayflowerImage getNextFrame(){
        currentFrame++;
        if(currentFrame == frames.length + 1){
            currentFrame = 1;
        }
        return frames[currentFrame -1];
    }
    public void setBounds(int x, int y, int w, int h){
        for (int i = 0; i < frames.length; i++){
            frames[i].crop(x, y, w, h);
        }
    }
}