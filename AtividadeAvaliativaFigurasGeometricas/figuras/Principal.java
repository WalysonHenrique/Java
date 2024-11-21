package figuras;
import java.util.ArrayList;

import figuras.model.Ponto2D;
import figuras.model.Retangulo;

class Principal{
    public static void main(String[] args){

        Ponto2D pontos = new ArrayList<>();
        pontos.add(2);
        pontos.add(3);
        Retangulo newRetang = new Retangulo(pontos);
        newRetang.exibir();
    }
}