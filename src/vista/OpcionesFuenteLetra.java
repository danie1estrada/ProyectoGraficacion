package vista;

import javax.swing.JComboBox;

public class OpcionesFuenteLetra {
    
    private static JComboBox<String> comboFuenteLetra, comboTamañoLetra, comboLínea;
    private static String fuentes [] = {
        "Arial", "Verdana", "Calibri", "Comic Sans MS"
    };
    private static String tamaños [] = {
        "10", "11", "12", "14", "16", "18"
    };
    private static String línea [] = {
        "1", "2", "3", "4"
    };
    
    public static JComboBox getComboFuente() {
        if (comboFuenteLetra == null)
            comboFuenteLetra = new JComboBox<>(fuentes);
        return comboFuenteLetra;
    }
    
    public static JComboBox getComboTamaño() {
        if (comboTamañoLetra == null)
            comboTamañoLetra = new JComboBox<>(tamaños);
        return comboTamañoLetra;
    }
    
    public static JComboBox getComboLínea() {
        if (comboLínea == null)
            comboLínea = new JComboBox<>(línea);
        return comboLínea;
    }
}
