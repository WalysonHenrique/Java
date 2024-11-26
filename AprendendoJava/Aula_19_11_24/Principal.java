import javax.swing.JFrame;
import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

public class SimpleJOGLExample implements GLEventListener {

    private GLU glu = new GLU();

    public static void main(String[] args) {
        // Criação da janela
        JFrame frame = new JFrame("Exemplo Básico JOGL");
        GLCanvas canvas = new GLCanvas();

        // Configuração do Listener para OpenGL
        canvas.addGLEventListener(new SimpleJOGLExample());
        frame.getContentPane().add(canvas);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Inicia o loop principal do OpenGL
        canvas.display();
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        // Configuração inicial
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(0, 0, 0, 1); // Define cor de fundo preta
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        // Método chamado quando a aplicação termina
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        // Desenho do frame
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();

        // Desenhar um triângulo
        gl.glBegin(GL2.GL_TRIANGLES);
        gl.glColor3f(1.0f, 0.0f, 0.0f); // Vermelho
        gl.glVertex2f(-0.5f, -0.5f);
        gl.glColor3f(0.0f, 1.0f, 0.0f); // Verde
        gl.glVertex2f(0.5f, -0.5f);
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Azul
        gl.glVertex2f(0.0f, 0.5f);
        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        // Configuração da viewport quando a janela é redimensionada
        GL2 gl = drawable.getGL().getGL2();
        if (height <= 0) height = 1; // Evita divisão por zero
        final float aspect = (float) width / height;

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-1.0f * aspect, 1.0f * aspect, -1.0f, 1.0f);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
}
