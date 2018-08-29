package Clases;

public class Mesas {
    
    private String Producto_M;
    private double Precio_M;
    private int Cantidad_M;
    
    public Mesas(String Producto_M,double Precio_M,int Cantidad_M)
    {   
        this.Producto_M = Producto_M;
        this.Precio_M = Precio_M;
        this.Cantidad_M = Cantidad_M;
    }
    
    public String getProducto_M() {
        return Producto_M;
    }

    public void setProducto_M(String Producto_M) {
        this.Producto_M = Producto_M;
    }

    public double getPrecio_M() {
        return Precio_M;
    }

    public void setPrecio_M(double Precio_M) {
        this.Precio_M = Precio_M;
    }

    public int getCantidad_M() {
        return Cantidad_M;
    }

    public void setCantidad_M(int Cantidad_M) {
        this.Cantidad_M = Cantidad_M;
    }
}
