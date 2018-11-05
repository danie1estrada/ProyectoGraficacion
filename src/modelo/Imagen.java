package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Imagen extends Figura {
    
    private final Image imagen;

    public Imagen(Image imagen, int x, int y, int ancho, int alto, Color color) {
        super(x, y, ancho, alto, color);
        this.imagen = imagen;
        setBackground(color);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public void dibujar() {
    }
}
