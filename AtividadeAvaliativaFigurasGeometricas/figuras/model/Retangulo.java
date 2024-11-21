package figuras.model;
import java.util.List;

import figuras.model.Ponto2D;
public class Retangulo extends FiguraGeometrica2D{
    
    public Integer x, y;

    public Retangulo(){};

    public Retangulo(List<Ponto2D> pontos){
       super(pontos);
    }

    public void exibir(){
        System.out.println(this.x + this.y);
    }
}