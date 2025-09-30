class MyFirstClass{
    public static void main(String[] s){
        MySecondClass o = new MySecondClass(0,0);
        int i,j;
        for ( i = 1; i <=8;i++){
            for(j = 1; j <=8;j++){
                o.setX(i);
                o.setY(j);
                System.out.print(o.substraction());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass{
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
    public int substraction(){
        return x - y;
    }
}


