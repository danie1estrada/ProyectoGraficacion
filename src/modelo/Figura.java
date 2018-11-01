package modelo;

import javax.swing.JPanel;
import java.awt.Color;

public abstract class Figura extends JPanel {
    
    protected int x, y, ancho, alto;
    protected Color color;
    
    public Figura(int x, int y, int ancho, int alto, Color color) {
        setBackground(new Color(0f, 0f, 0f, 0f));
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
        this.x = x;
        this.y = y;
    }
    
    public abstract void dibujar();
    public abstract void redibujar();
}
