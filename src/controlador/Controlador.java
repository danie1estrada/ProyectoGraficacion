package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.VentanaII;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.*;

public class Controlador {
    
    private final VentanaII ventana;
    private int x1, y1, x2, y2, fig;
    private boolean primerClic;
    private Color color;
    
    public Controlador() {
        ventana = new VentanaII();
        color = Color.BLACK;
        primerClic = true;
        escuchas();
    }
    
    private void escuchas() {
        ControladorMouse cm = new ControladorMouse();
        
        ventana.btnRectángulo.addMouseListener(cm);
        ventana.btnImagen.addMouseListener(cm);
        ventana.btnLínea.addMouseListener(cm);
        ventana.btnTexto.addMouseListener(cm);
        ventana.lienzo.addMouseListener(cm);
        ventana.color.addMouseListener(cm);
    }
    
    private void dibujar() {
        String línea = (String) ventana.tipoLínea.getSelectedItem();
        
        switch(fig) {
            case 0:
                ventana.lienzo.add(new Línea(x1, y1, x2, y2, color, línea)); 
                break;
            case 1:
                ventana.lienzo.add(new Rectángulo(x1, y1, x2 - x1, y2 - y1, color, línea)); 
                break;
            case 2:
                JFileChooser jfc = new JFileChooser();
                jfc.showOpenDialog(null);
                File imageFile = jfc.getSelectedFile();

                if (imageFile != null) {
                    Image bgImage = new ImageIcon(imageFile.getAbsolutePath()).getImage();
                    ventana.lienzo.add(new Imagen(bgImage, x1, y1, x2 - x1, y2 - y1, color));
                }
                break;
            case 3:
                String texto, fuente, tamaño;
                texto = JOptionPane.showInputDialog("Ingrese el texto");
                fuente = (String) ventana.tipoFuente.getSelectedItem();
                tamaño = (String) ventana.tamañoFuente.getSelectedItem();
                ventana.lienzo.add(new Texto(texto, x1, y1, x2, y1, color, fuente, tamaño));
                break;
        }
        ventana.lienzo.repaint();
    }
    
    public void lanzar() {
        ventana.setVisible(true);
    }
    
    class ControladorMouse extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent me) {
            Object o = me.getSource();
            
            if (o.equals(ventana.lienzo)) {
                if (primerClic) {
                    x1 = me.getX();
                    y1 = me.getY();
                    primerClic = !primerClic;
                } else {
                    x2 = me.getX();
                    y2 = me.getY();
                    primerClic = !primerClic;
                    dibujar();
                }
            } else if (o.equals(ventana.btnLínea)) {
                fig = 0;
            } else if (o.equals(ventana.btnRectángulo)) {
                fig = 1;
            } else if (o.equals(ventana.btnImagen)) {
                fig = 2;
            } else if (o.equals(ventana.btnTexto)) {
                fig = 3;
            } else if (o.equals(ventana.color)) {
                color = JColorChooser.showDialog(null, "Seleccionar color", color);
                ventana.color.setBackground(color != null ? color : Color.BLACK);
            }
        }
        
        @Override
        public void mouseEntered(MouseEvent me) {
            if (me.getSource().equals(ventana.color))
                ventana.color.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }
    
    public static void main(String[] args) {
        new Controlador().lanzar();
    }
}
