package modelo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Línea extends Figura {

    private final float tamañoLínea;
    
    public Línea(int x, int y, int ancho, int alto, Color color, String línea) {
        super(x, y, ancho - x, alto - y, color);
        tamañoLínea = Float.parseFloat(línea);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.setStroke(new BasicStroke(tamañoLínea));
        g2.drawLine(0, 0, getWidth(), getHeight());
    }
    
    @Override
    public void dibujar() {
        g2.setColor(color);
        g2.drawLine(0, 0, getWidth(), getHeight());
    }
}
