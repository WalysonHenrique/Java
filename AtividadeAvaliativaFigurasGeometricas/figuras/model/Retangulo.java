package figuras.model;
class Retangulo extends FiguraGeometrica2D{
    
    private Integer x, y;

    public Retangulo(){};

    public Retangulo(List<Ponto2D> pontos){
        this.x = pontos[0];
        this.y = pontos[1];
    }
}