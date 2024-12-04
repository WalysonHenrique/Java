import com.jogamp.opengl.*;
import java.util.ArrayList;

public class Renderizador implements GLEventListener {
    private ArrayList<Ponto2D> pontos;

    public Renderizador() {
        // Inicialize os pontos do retângulo
        pontos = new ArrayList<>();
        pontos.add(new Ponto2D(0.2, 0.2));  // Canto inferior esquerdo
        pontos.add(new Ponto2D(0.8, 0.2));  // Canto inferior direito
        pontos.add(new Ponto2D(0.8, 0.6));  // Canto superior direito
        pontos.add(new Ponto2D(0.2, 0.6));  // Canto superior esquerdo
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(1f, 1f, 1f, 1f); // Cor de fundo: branca
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        // Método chamado ao liberar recursos (opcional neste caso)
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT); // Limpa a tela

        // Desenha o retângulo
        gl.glColor3f(0f, 0f, 1f); // Azul
        gl.glBegin(GL2.GL_QUADS);
        for (Ponto2D ponto : pontos) {
            gl.glVertex2d(ponto.getX(), ponto.getY());
        }
        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(0, 1, 0, 1, -1, 1); // Define a área visível 2D (normalizada)
    }
}
