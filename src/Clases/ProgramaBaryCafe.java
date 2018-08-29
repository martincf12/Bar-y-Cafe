package Clases;

import Interfaz.Principal;

public class ProgramaBaryCafe { 
    
    public static void main(String[] args)
    {
        Principal ventana = new Principal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.MostrarTablaProductos(); 
    }
    
}
