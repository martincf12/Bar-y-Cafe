package Clases;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import javax.swing.JOptionPane;

public class Producto {
    
    File archivo;
    private String nombre;
    private int cantidad;
    private double precio;
    private String categoria;
    
    public Producto(String nombre,double precio,String categoria)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }  
    
    public Producto(String nombre,double precio,String categoria, int cantidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }  
    
    public void Crear_Producto ()
    {
        String ArchCli = nombre+".txt";
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir")+barra+"Productos"+barra;  
        File crear_ubica = new File(ubicacion);
        File crear_archivo = new File(ubicacion+ArchCli);
        try 
        {
            if(crear_archivo.exists())
                {
                JOptionPane.showMessageDialog(null,"El Producto ya existe.");
                }else
                {
                    crear_ubica.mkdirs();
                    try (Formatter crea = new Formatter(ubicacion+ArchCli)) 
                    {
                        crea.format("%s\r\n%s\r\n%s\r\n%s\r\n","Nombre="+nombre,"Cantidad="+
                                cantidad,"Precio="+precio,"Categoria="+categoria);
                    }
                    JOptionPane.showMessageDialog(null,"Producto guardado con éxito.");
                }                  
        }
        catch (HeadlessException | FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(null,"No se pudo guardar el Producto. "+e);
            }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
