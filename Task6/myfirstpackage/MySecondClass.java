package myfirstpackage;
public class MySecondClass{
    private int x;
    private int y;

    public MySecondClass(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int substraction (){
        return x - y;
    }
}
