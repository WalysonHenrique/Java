package figuras.model;
import java.util.List;

class FiguraGeometrica2D{
    private List<Ponto2D> pontos;

    public FiguraGeometrica2D(){};
    public FiguraGeometrica2D(List<Ponto2D> pontos){
        this.pontos = pontos;
    }
}