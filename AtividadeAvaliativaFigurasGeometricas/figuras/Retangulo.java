import java.util.List;

class Retangulo {
    private List<Ponto2D> pontos;

    public Retangulo(List<Ponto2D> pontos) {
        if (pontos.size() != 2) {
            throw new IllegalArgumentException("Um retângulo precisa de exatamente 2 pontos (cantos opostos).");
        }
        this.pontos = pontos;
    }

    public void exibir() {
        Ponto2D ponto1 = pontos.get(0);
        Ponto2D ponto2 = pontos.get(1);

        System.out.println("Retângulo definido pelos pontos:");
        System.out.println("Ponto 1: " + ponto1);
        System.out.println("Ponto 2: " + ponto2);
    }
}
