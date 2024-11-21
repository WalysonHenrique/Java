package figuras.model;
 public class Ponto2D{
    public Integer x, y;

    public Ponto2D(){};
    
    public Ponto2D(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    public void exibir(){
        System.out.println(x + " " + y);
    }

    

}