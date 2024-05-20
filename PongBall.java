public class PongBall {
    private int x;
    private int y;
    private int xVelocity;
    private int yVelocity;

    x = getX();
    y = getY();

    public PongBall (int initX, int initY, int initXVel, int initYVel){
        x = initX;
        y = initY;
        xvelocity= initXVel;
        yvelocity = initYVel;
    }

    public void move(){
        move();
        x += xVelocity;
        y += yVelocity;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void bounceX(){
        xVelocity = xVelocity * -1;
        
    }
    public void bounceY(){
        yVelocity = yVelocity * -1;
    }

    
    

}
