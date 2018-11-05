package modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Texto extends Figura {
    
    private final String texto, fuente;
    private final int tamaño;

    public Texto(String texto, int x, int y, int ancho, int alto, Color color, String fuente, String tamaño) {
        super(x, y, ancho, alto, color);
        this.texto = texto;
        this.fuente = fuente;
        this.tamaño = Integer.parseInt(tamaño);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.setFont(new Font(fuente, Font.PLAIN, tamaño));
        g2.drawString(texto != null ? texto : "", 0, tamaño);
    }

    @Override
    public void dibujar() {
    }
}
