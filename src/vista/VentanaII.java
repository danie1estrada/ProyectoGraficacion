package vista;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class VentanaII extends JFrame {
    
    public JComboBox<String> tamañoFuente, tipoFuente, tipoLínea; 
    public JButton btnLínea, btnRectángulo, btnTexto, btnImagen;
    public JPanel panel, lienzo, color;
    public JMenuBar menú;
    
    public VentanaII() {
        crear();
        armar();
        propiedades();
    }
    
    private void crear() {
        tamañoFuente = OpcionesFuenteLetra.getComboTamaño();
        tipoFuente = OpcionesFuenteLetra.getComboFuente();
        tipoLínea = OpcionesFuenteLetra.getComboLínea();
        btnRectángulo = new JButton("Rectángulo");
        btnImagen = new JButton("Imagen");
        btnLínea = new JButton("Línea");
        btnTexto = new JButton("Texto");
        
        lienzo = new JPanel();
        panel = new JPanel();
        color = new JPanel();
        
        menú = new Menú();
    }
    
    private void propiedades() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graficación");
        setResizable(false);
        setSize(600, 400);
        setJMenuBar(menú);
        
        panel.setLayout(null);
        
        btnLínea.setBounds(25, 20, 100, 25);
        btnRectángulo.setBounds(25, 60, 100, 25);
        btnImagen.setBounds(25, 100, 100, 25);
        btnTexto.setBounds(25, 140, 100, 25);
        
        tipoFuente.setToolTipText("Fuente de letra");
        tipoFuente.setBounds(25, 180, 100,  25);
        
        tamañoFuente.setToolTipText("Tamaño de fuente");
        tamañoFuente.setBounds(25, 220, 100, 25);
        
        tipoLínea.setToolTipText("Tipo de línea");
        tipoLínea.setBounds(25, 260, 100, 25);
        
        color.setBorder(BorderFactory.createEtchedBorder());
        color.setBounds(25, 300, 100, 25);
        color.setBackground(Color.BLACK);
        
        lienzo.setBorder(BorderFactory.createEtchedBorder());
        lienzo.setBounds(150, 20, 420, 310);
        lienzo.setBackground(Color.WHITE);
        lienzo.setLayout(null);
    }
    
    private void armar() {
        add(panel);
        
        panel.add(btnRectángulo);
        panel.add(tamañoFuente);
        panel.add(tipoFuente);
        panel.add(tipoLínea);
        panel.add(btnImagen);
        panel.add(btnLínea);
        panel.add(btnTexto);
        panel.add(lienzo);
        panel.add(color);
    }
}
