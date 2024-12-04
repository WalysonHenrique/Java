 public class Ponto2D{
    private Integer x, y;

    public Ponto2D(){};
    
    public Ponto2D(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }


    
    public int getY(){
        return y;
    }


    
    public void setX(Integer x){
        this.x = x;
    }

    
    public void setY(Integer y){
        this.y = y;
    }




    public void exibir(){
        System.out.println(x + " " + y);
    }

    

}