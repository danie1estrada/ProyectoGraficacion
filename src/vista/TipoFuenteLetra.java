package vista;

import javax.swing.JComboBox;

public class TipoFuenteLetra {
    
    private static JComboBox<String> comboFuenteLetra, comboTamañoLetra;
    private static String fuentes [] = {
        "Arial", "Verdana", "Calibri"
    };
    private static String tamaños [] = {
        "10", "11", "12", "14", "16", "18"
    };
    
    public static JComboBox getComboFuente() {
        if (comboFuenteLetra == null)
            comboFuenteLetra = new JComboBox<>(fuentes);
        comboFuenteLetra.setEnabled(false);
        return comboFuenteLetra;
    }
    
    public static JComboBox getComboTamaño() {
        if (comboTamañoLetra == null)
            comboTamañoLetra = new JComboBox<>(tamaños);
        comboTamañoLetra.setEnabled(false);
        return comboTamañoLetra;
    }
}
