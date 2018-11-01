package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menú extends JMenuBar {
    
    public JMenuItem itemAbrir, itemGuardar;
    public JMenu menuArchivo;
    
    public Menú() {
        menuArchivo = new JMenu("Archivo");
        
        itemGuardar = new JMenuItem("Guardar...");
        itemAbrir = new JMenuItem("Abrir...");
        
        add(menuArchivo);
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
    }
}
