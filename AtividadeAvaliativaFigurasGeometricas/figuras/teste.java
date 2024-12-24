import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.Animator;

import javax.swing.*;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de retângulos: ");
        int quantidadeRetangulos = scanner.nextInt();
        System.out.print("Digite a quantidade de círculos: ");
        int quantidadeCirculos = scanner.nextInt();
        scanner.close();

        // Configuração da Janela OpenGL
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        GLCanvas canvas = new GLCanvas(capabilities);
        Renderizador renderizador = new Renderizador(quantidadeRetangulos, quantidadeCirculos);
        canvas.addGLEventListener(renderizador);

        JFrame frame = new JFrame("Figuras Geométricas");
        frame.getContentPane().add(canvas);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Animator animator = new Animator(canvas);
        animator.start();
    }
}

class Renderizador implements GLEventListener {
    private int quantidadeRetangulos;
    private int quantidadeCirculos;

    public Renderizador(int quantidadeRetangulos, int quantidadeCirculos) {
        this.quantidadeRetangulos = quantidadeRetangulos;
        this.quantidadeCirculos = quantidadeCirculos;
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        // Configurações iniciais do OpenGL
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(0, 0, 0, 1); // Cor de fundo preta
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);

        // Desenha os retângulos
        for (int i = 0; i < quantidadeRetangulos; i++) {
            float x = -0.8f + (i * 0.2f);
            desenharRetangulo(gl, x, 0.5f, 0.1f, 0.2f);
        }

        // Desenha os círculos
        for (int i = 0; i < quantidadeCirculos; i++) {
            float x = -0.8f + (i * 0.2f);
            desenharCirculo(gl, x, -0.5f, 0.1f);
        }
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        // Limpeza de recursos, se necessário
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-1, 1, -1, 1, -1, 1);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
    }

    private void desenharRetangulo(GL2 gl, float x, float y, float largura, float altura) {
        gl.glColor3f(0, 1, 0); // Cor verde
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x + largura, y);
        gl.glVertex2f(x + largura, y - altura);
        gl.glVertex2f(x, y - altura);
        gl.glEnd();
    }

    private void desenharCirculo(GL2 gl, float cx, float cy, float raio) {
        gl.glColor3f(1, 0, 0); // Cor vermelha
        gl.glBegin(GL2.GL_TRIANGLE_FAN);
        gl.glVertex2f(cx, cy);
        for (int i = 0; i <= 100; i++) {
            double angle = 2 * Math.PI * i / 100;
            float x = (float) (cx + raio * Math.cos(angle));
            float y = (float) (cy + raio * Math.sin(angle));
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }
}
