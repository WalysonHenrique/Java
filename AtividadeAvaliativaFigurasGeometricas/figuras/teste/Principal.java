import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.Animator;
import javax.swing.*;
import java.util.Scanner;
import com.jogamp.opengl.glu.*;
import com.jogamp.opengl.util.*;

public class Principal{
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

