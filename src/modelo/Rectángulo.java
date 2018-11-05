package modelo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectángulo extends Figura {

    private final float tamañoLínea;
    
    public Rectángulo(int x, int y, int ancho, int alto, Color color, String línea) {
        super(x, y, ancho, alto, color);
        tamañoLínea = Float.parseFloat(línea);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.setStroke(new BasicStroke(tamañoLínea));
        g2.draw(new Rectangle2D.Float(
                (int) tamañoLínea,
                (int) tamañoLínea,
                getWidth() - (int) tamañoLínea - 2,
                getHeight() - (int) tamañoLínea - 2)
        );
    }

    @Override
    public void dibujar() {
    }
}
