import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
    
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

       
        GLCanvas canvas = new GLCanvas(capabilities);
        canvas.addGLEventListener(new Renderizador());

  
        JFrame frame = new JFrame("Exibição de Figuras Geométricas 2D");
        frame.getContentPane().add(canvas);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
} 
    