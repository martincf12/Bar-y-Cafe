package Interfaz;

import Clases.Producto;
import static Interfaz.VentAgregarProd.ProductosLista_Mesa_T;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private DefaultTableModel model;
    private String Eliminar_Producto;
    int seleccion_mesa;
    private int Seleccion_T_P;
    private final String barra = File.separator;
    private final String ubicacion_productos = System.getProperty("user.dir")+barra+"Productos"+barra;
    public static boolean TstVentNvoPres=false;
    public static boolean TstVentNvoPres_Stock=false;
    public static boolean Primera_Vez=false;
    public static String Nombre_Producto_Agregar;
    public static String Cantidad_Producto_Agregar;
    public static String Precio_Producto_Agregar;
    public static String Categoria_Producto_Agregar;
    public static ArrayList<Producto> ProductosLista = new ArrayList<>();
    private ArrayList<Producto> Prod_menos = new ArrayList<>();
    public static int Mesa_Seleccionada = 0;
    public static double Total_Total = 0;
         
    public Principal() {
        initComponents();
        Muestra_de_Totales_Noche.setText("0");
    }
    
    private void Restar_Stock(String nombre_resta, int canti_resta)
    {
        File contenedor = new File(ubicacion_productos);
        File[] registros = contenedor.listFiles();
        
        for (File registro : registros) 
        {
            File url = new File(ubicacion_productos + registro.getName());
            try
            {
                FileInputStream fis = new FileInputStream(url);
                Properties mostrar = new Properties();
                mostrar.load(fis);
                String nom_menos = mostrar.getProperty("Nombre");
                String cate_menos = mostrar.getProperty("Categoria");
                int canti_menos = Integer.parseInt(mostrar.getProperty("Cantidad"));
                double preci_menos = Double.parseDouble(mostrar.getProperty("Precio"));
                
                if (nombre_resta == null ? nom_menos == null : nombre_resta.equals(nom_menos))
                {
                    canti_menos = canti_menos - canti_resta;
                }
                Producto cargado = new Producto(nom_menos, preci_menos, cate_menos, canti_menos);
                Prod_menos.add(cargado);
            }
            catch(IOException e)
            {               
            }          
        }
        for (int W = 0; W < Prod_menos.size();W++) {
            String barra_fin = File.separator;
            String ubicacion = System.getProperty("user.dir")+barra_fin+"Productos"+barra_fin;
            try 
            {
                try (FileWriter permite_escrito = new FileWriter(ubicacion+Prod_menos.get(W).getNombre()+".txt"))
                {
                    String Nomb = "Nombre=";
                    String Cant = "Cantidad=";
                    String Prec = "Precio=";
                    String Cate = "Categoria=";
                    PrintWriter guardar = new PrintWriter(permite_escrito);
                    guardar.println(Nomb+Prod_menos.get(W).getNombre());
                    guardar.println(Cant+Prod_menos.get(W).getCantidad());
                    guardar.println(Prec+Prod_menos.get(W).getPrecio());
                    guardar.println(Cate+Prod_menos.get(W).getCategoria());
                }
            }
            catch (IOException e)
            {
            }      
        }
        
    }
    
    private void Cerrar_Mesa()
    {   
        Calendar calendario = Calendar.getInstance();
        int hora,min,seg,dia,mes,anio;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        min = calendario.get(Calendar.MINUTE);
        seg = calendario.get(Calendar.SECOND);
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH);
        anio = calendario.get(Calendar.YEAR);
        String hora_s = String.valueOf(hora);
        String min_s = String.valueOf(min);
        String seg_s = String.valueOf(seg);
        String dia_s = String.valueOf(dia);
        String mes_s = String.valueOf(mes);
        String anio_s = String.valueOf(anio);
        String fecha_final = (hora_s+"."+min_s+"."+seg_s+"  "+dia_s+"-"+mes_s+"-"+anio_s);
        String barra_1 = File.separator;
        String ubicacion_mesa_cerrada = System.getProperty("user.dir")+barra_1+"MesasCerradas"+barra_1;
               
        try
        {
            try (FileWriter permite_escrito = new FileWriter(ubicacion_mesa_cerrada+fecha_final+".txt")) 
            {
                PrintWriter guardar = new PrintWriter(permite_escrito);
                guardar.print("Producto -- Cantidad -- Cantidad");
                ProductosLista_Mesa_T.get(Mesa_Seleccionada).forEach((next) -> {
                    String Nombre_guardar = next.getProducto_M();
                    String Cantidad_guardar = String.valueOf(next.getCantidad_M());
                    String Precio_guardar = String.valueOf(next.getPrecio_M());
                    guardar.println();
                    guardar.print(Nombre_guardar+" -- ");
                    guardar.print(Cantidad_guardar+" -- ");
                    guardar.print(Precio_guardar);
                    Restar_Stock(next.getProducto_M(),next.getCantidad_M());
                });
                JOptionPane.showMessageDialog(null, "Mesa Cerrada con éxito.");
                guardar.println();
                guardar.print("TOTAL: "+Muestra_de_Totales_Mesa.getText());
            }
        } 
        catch (IOException e) 
        {
        }
        MostrarTablaProductos();
    }
    private void Imagen_mesa(Icon mesita)
    {    
        Icono_Foto_Mesa.setIcon(mesita);       
    }
    public void Carga_Objeto_Producto()
    {
      File contenedor = new File(ubicacion_productos);
        File[] registros = contenedor.listFiles();
        for (File registro : registros) 
        {
            File url = new File(ubicacion_productos + registro.getName());
            try
            {
                FileInputStream fis = new FileInputStream(url);
                Properties mostrar = new Properties();
                mostrar.load(fis);
                
                String nomb_obj = mostrar.getProperty("Nombre");
                String cate_obj = mostrar.getProperty("Categoria");
                String cant_obj = mostrar.getProperty("Cantidad");
                String perc_obj = mostrar.getProperty("Precio");
                
                double precio_obj = Double.parseDouble(perc_obj);
                int cantidad_obj = Integer.parseInt(cant_obj);
                
                Producto nuevo = new Producto(nomb_obj,precio_obj,cate_obj,cantidad_obj);
                ProductosLista.add(nuevo);
            }
            catch(IOException e)
            {
                
            }
        }      
    }
    
    private void NoAbrirOtraVentanaJuegos()
    {                                            
        if(TstVentNvoPres==false){
            Juegos_Pantalla VentNvoPres=new Juegos_Pantalla();
            VentNvoPres.setVisible(true);
            VentNvoPres.setLocationRelativeTo(null);
            TstVentNvoPres=true;
           }
           else
           {
            JOptionPane.showMessageDialog(null,"La ventana de Juegos ya esta abierta!!!");
           }
    }
    
    private void NoAbrirOtraVentanaStock()
    {                                            
        if(TstVentNvoPres_Stock==false){
            Stock_mas VentNvoPres=new Stock_mas();
            VentNvoPres.setVisible(true);
            VentNvoPres.setLocationRelativeTo(null);
            TstVentNvoPres_Stock=true;
           }
           else
           {
            JOptionPane.showMessageDialog(null,"La ventana de Stock ya esta abierta!!!");
           }
    }
    
    public void MostrarTablaMesas()
    {
        String data[][]={};
        String col[] = {"Producto","Cantidad","Precio"};
        model = new DefaultTableModel(data,col);
        TablaMesas.setModel(model);
        double Total_Mesa = 0;
        if(Primera_Vez)
        {
            for (int i = 0; i < VentAgregarProd.ProductosLista_Mesa_T.get(Mesa_Seleccionada).size(); i++)
            {
                String a = ProductosLista_Mesa_T.get(Mesa_Seleccionada).get(i).getProducto_M();
                String b = String.valueOf(ProductosLista_Mesa_T.get(Mesa_Seleccionada).get(i).getCantidad_M()); 
                String c = String.valueOf(ProductosLista_Mesa_T.get(Mesa_Seleccionada).get(i).getPrecio_M()); 
                String filas [] = {a,b,c};
                model.addRow(filas);
                Total_Mesa = Total_Mesa+((ProductosLista_Mesa_T.get(Mesa_Seleccionada).get(i).getPrecio_M())*(ProductosLista_Mesa_T.get(Mesa_Seleccionada).get(i).getCantidad_M()));             
            }
            Muestra_de_Totales_Mesa.setText(String.valueOf(Total_Mesa));
        }
    }
    
    public void MostrarTablaProductos()
    {
        File contenedor = new File(ubicacion_productos);
        File[] registros = contenedor.listFiles();
        String data[][]={};
        String col[] = {"Producto","Categoria","Cantidad","Precio"};
        model = new DefaultTableModel(data,col);
        Tabla_Productos.setModel(model);
        for (File registro : registros) 
        {
            File url = new File(ubicacion_productos + registro.getName());
            try
            {
                FileInputStream fis = new FileInputStream(url);
                Properties mostrar = new Properties();
                mostrar.load(fis);
                String filas [] = {mostrar.getProperty("Nombre"),mostrar.getProperty("Categoria")
                        ,mostrar.getProperty("Cantidad"),mostrar.getProperty("Precio")};
                model.addRow(filas);
            }
            catch(IOException e)
            {
                
            }
        }     
    }
    
    private void Eliminar()
    {
        String btns [] ={"Si","Cancelar"};
        File url = new File(ubicacion_productos+Eliminar_Producto+".txt");
        try {
            FileInputStream cerrar = new FileInputStream(url);
            cerrar.close();
            System.gc();
            
            int seguro = JOptionPane.showOptionDialog(rootPane, "Esta seguro de eliminar el producto?", "Eliminacion", 0, 0, null, btns, null);
            
            if (seguro == JOptionPane.YES_OPTION)
            {
                url.delete();
                JOptionPane.showMessageDialog(rootPane, "Producto eliminado.");
            }else
            {      
            }
            
        } catch (HeadlessException | IOException e) 
        {
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaPrincipal = new javax.swing.JTabbedPane();
        Bar = new javax.swing.JPanel();
        PaneldelBar = new javax.swing.JTabbedPane();
        BarMesas = new javax.swing.JPanel();
        Panel_Foto_Acual = new javax.swing.JPanel();
        Icono_Foto_Mesa = new javax.swing.JLabel();
        MenuCarasMesas = new javax.swing.JTabbedPane();
        PanelMesasBar = new javax.swing.JPanel();
        Mesa_SEIS = new javax.swing.JButton();
        Mesa_CINCO = new javax.swing.JButton();
        Mesa_CUATRO = new javax.swing.JButton();
        Mesa_TRES = new javax.swing.JButton();
        Mesa_DOS = new javax.swing.JButton();
        Mesa_UNO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Mesa_DOCE = new javax.swing.JButton();
        Mesa_ONCE = new javax.swing.JButton();
        Mesa_DIEZ = new javax.swing.JButton();
        Mesa_NUEVE = new javax.swing.JButton();
        Mesa_OCHO = new javax.swing.JButton();
        Mesa_SIETE = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Mesa_CATORCE = new javax.swing.JButton();
        Mesa_DIECISIETE = new javax.swing.JButton();
        Mesa_QUINCE = new javax.swing.JButton();
        Mesa_DIECIS = new javax.swing.JButton();
        Mesa_TRECE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Mesa_DIECIOCHO = new javax.swing.JButton();
        Mesa_DIECISIETE1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaMesas = new javax.swing.JTable();
        TOTAL_Palabra1 = new javax.swing.JLabel();
        Muestra_de_Totales_Noche = new javax.swing.JTextField();
        Muestra_de_Totales_Mesa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonAgregarProd = new javax.swing.JButton();
        BotonCerrarMesa = new javax.swing.JButton();
        BotonReiniciarMesa = new javax.swing.JButton();
        BotonEliminarProducto = new javax.swing.JButton();
        BotonRecargar = new javax.swing.JButton();
        TOTAL_Palabra = new javax.swing.JLabel();
        FondoBarMesas = new javax.swing.JLabel();
        BotonJUEGOS = new javax.swing.JButton();
        BarStock = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        AgregarProd = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        Boton_eliminar_producto_stock = new javax.swing.JButton();
        CrearProd = new javax.swing.JButton();
        FondoBarStock = new javax.swing.JLabel();
        Cafe = new javax.swing.JPanel();
        PaneldelCafe = new javax.swing.JTabbedPane();
        CafeMesas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotonEliminarProducto1 = new javax.swing.JButton();
        BotonAgregarProd1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaMesas1 = new javax.swing.JTable();
        BotonReiniciarMesa1 = new javax.swing.JButton();
        BotonCerrarMesa1 = new javax.swing.JButton();
        Muestra_de_Totales1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FondoMesasCafe = new javax.swing.JLabel();
        CafeStock = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        FondoStockCafe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1010, 760));
        setPreferredSize(new java.awt.Dimension(1010, 680));
        setResizable(false);

        TablaPrincipal.setMaximumSize(new java.awt.Dimension(1000, 700));
        TablaPrincipal.setMinimumSize(new java.awt.Dimension(1000, 700));
        TablaPrincipal.setPreferredSize(new java.awt.Dimension(1010, 650));

        Bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarMesas.setMaximumSize(new java.awt.Dimension(1000, 700));
        BarMesas.setMinimumSize(new java.awt.Dimension(1000, 700));
        BarMesas.setPreferredSize(new java.awt.Dimension(1000, 700));
        BarMesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Foto_Acual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel_Foto_Acual.add(Icono_Foto_Mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BarMesas.add(Panel_Foto_Acual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 150, 150));

        PanelMesasBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mesa_SEIS.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_SEIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Spinetta.jpg"))); // NOI18N
        Mesa_SEIS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_SEISMouseClicked(evt);
            }
        });
        Mesa_SEIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_SEISActionPerformed(evt);
            }
        });
        PanelMesasBar.add(Mesa_SEIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 130, 130));

        Mesa_CINCO.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_CINCO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veloso.jpg"))); // NOI18N
        Mesa_CINCO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_CINCOMouseClicked(evt);
            }
        });
        Mesa_CINCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_CINCOActionPerformed(evt);
            }
        });
        PanelMesasBar.add(Mesa_CINCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 130, 130));

        Mesa_CUATRO.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_CUATRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Janis_Jopin.jpg"))); // NOI18N
        Mesa_CUATRO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_CUATROMouseClicked(evt);
            }
        });
        Mesa_CUATRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_CUATROActionPerformed(evt);
            }
        });
        PanelMesasBar.add(Mesa_CUATRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 130, 130));

        Mesa_TRES.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_TRES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amy.jpg"))); // NOI18N
        Mesa_TRES.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_TRESMouseClicked(evt);
            }
        });
        Mesa_TRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_TRESActionPerformed(evt);
            }
        });
        PanelMesasBar.add(Mesa_TRES, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 130, 130));

        Mesa_DOS.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_DOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m_sosa.jpg"))); // NOI18N
        Mesa_DOS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_DOSMouseClicked(evt);
            }
        });
        PanelMesasBar.add(Mesa_DOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 130));

        Mesa_UNO.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_UNO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerati.jpg"))); // NOI18N
        Mesa_UNO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_UNOMouseClicked(evt);
            }
        });
        PanelMesasBar.add(Mesa_UNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25615903_1280x720.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setPreferredSize(new java.awt.Dimension(970, 155));
        PanelMesasBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 870, 190));

        MenuCarasMesas.addTab("Adentro", PanelMesasBar);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mesa_DOCE.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_DOCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bob_m.jpg"))); // NOI18N
        Mesa_DOCE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_DOCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_DOCEMouseClicked(evt);
            }
        });
        Mesa_DOCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_DOCEActionPerformed(evt);
            }
        });
        jPanel2.add(Mesa_DOCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 130, 130));

        Mesa_ONCE.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_ONCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cortazar.jpg"))); // NOI18N
        Mesa_ONCE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_ONCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_ONCEMouseClicked(evt);
            }
        });
        Mesa_ONCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_ONCEActionPerformed(evt);
            }
        });
        jPanel2.add(Mesa_ONCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 130, 130));

        Mesa_DIEZ.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_DIEZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bach.jpg"))); // NOI18N
        Mesa_DIEZ.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_DIEZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_DIEZMouseClicked(evt);
            }
        });
        Mesa_DIEZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_DIEZActionPerformed(evt);
            }
        });
        jPanel2.add(Mesa_DIEZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 130, 130));

        Mesa_NUEVE.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_NUEVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/beethoveen.jpg"))); // NOI18N
        Mesa_NUEVE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_NUEVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_NUEVEMouseClicked(evt);
            }
        });
        Mesa_NUEVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_NUEVEActionPerformed(evt);
            }
        });
        jPanel2.add(Mesa_NUEVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 130, 130));

        Mesa_OCHO.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_OCHO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madonna.jpg"))); // NOI18N
        Mesa_OCHO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_OCHO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_OCHOMouseClicked(evt);
            }
        });
        Mesa_OCHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_OCHOActionPerformed(evt);
            }
        });
        jPanel2.add(Mesa_OCHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 130));

        Mesa_SIETE.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_SIETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/M_jackson.jpg"))); // NOI18N
        Mesa_SIETE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_SIETEMouseClicked(evt);
            }
        });
        Mesa_SIETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_SIETEActionPerformed(evt);
            }
        });
        jPanel2.add(Mesa_SIETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25615903_1280x720.jpg"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setPreferredSize(new java.awt.Dimension(970, 155));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 890, 190));

        MenuCarasMesas.addTab("Afuera", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mesa_CATORCE.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_CATORCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/piazzolla.jpg"))); // NOI18N
        Mesa_CATORCE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_CATORCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_CATORCEMouseClicked(evt);
            }
        });
        Mesa_CATORCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_CATORCEActionPerformed(evt);
            }
        });
        jPanel1.add(Mesa_CATORCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 130));

        Mesa_DIECISIETE.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_DIECISIETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa2.jpg"))); // NOI18N
        Mesa_DIECISIETE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_DIECISIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_DIECISIETEMouseClicked(evt);
            }
        });
        jPanel1.add(Mesa_DIECISIETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 140, 130));

        Mesa_QUINCE.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_QUINCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa1.jpg"))); // NOI18N
        Mesa_QUINCE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_QUINCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_QUINCEMouseClicked(evt);
            }
        });
        jPanel1.add(Mesa_QUINCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 140, 130));

        Mesa_DIECIS.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_DIECIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ASD.jpg"))); // NOI18N
        Mesa_DIECIS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_DIECIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_DIECISMouseClicked(evt);
            }
        });
        Mesa_DIECIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_DIECISActionPerformed(evt);
            }
        });
        jPanel1.add(Mesa_DIECIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 140, 130));

        Mesa_TRECE.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_TRECE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borges.jpg"))); // NOI18N
        Mesa_TRECE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_TRECE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_TRECEMouseClicked(evt);
            }
        });
        Mesa_TRECE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_TRECEActionPerformed(evt);
            }
        });
        jPanel1.add(Mesa_TRECE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25615903_1280x720.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 180));

        MenuCarasMesas.addTab("Otros", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mesa_DIECIOCHO.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_DIECIOCHO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa4.jpg"))); // NOI18N
        Mesa_DIECIOCHO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_DIECIOCHO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_DIECIOCHOMouseClicked(evt);
            }
        });
        jPanel3.add(Mesa_DIECIOCHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 130));

        Mesa_DIECISIETE1.setBackground(new java.awt.Color(255, 225, 61));
        Mesa_DIECISIETE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa3.jpg"))); // NOI18N
        Mesa_DIECISIETE1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mesa_DIECISIETE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_DIECISIETE1MouseClicked(evt);
            }
        });
        jPanel3.add(Mesa_DIECISIETE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 130));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25615903_1280x720.jpg"))); // NOI18N
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setPreferredSize(new java.awt.Dimension(970, 155));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 890, 190));

        MenuCarasMesas.addTab("Mas", jPanel3);

        BarMesas.add(MenuCarasMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JH_CAFE.png"))); // NOI18N
        BarMesas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 435, 150, 140));

        TablaMesas.setBackground(new java.awt.Color(255, 204, 51));
        TablaMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaMesas.getTableHeader().setReorderingAllowed(false);
        TablaMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMesasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaMesas);

        BarMesas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 580, 340));

        TOTAL_Palabra1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TOTAL_Palabra1.setForeground(new java.awt.Color(255, 255, 255));
        TOTAL_Palabra1.setText("TOTAL Noche:");
        BarMesas.add(TOTAL_Palabra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, 30));

        Muestra_de_Totales_Noche.setEditable(false);
        Muestra_de_Totales_Noche.setMaximumSize(new java.awt.Dimension(1000, 1000));
        BarMesas.add(Muestra_de_Totales_Noche, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 100, 30));

        Muestra_de_Totales_Mesa.setEditable(false);
        Muestra_de_Totales_Mesa.setMaximumSize(new java.awt.Dimension(1000, 1000));
        BarMesas.add(Muestra_de_Totales_Mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 100, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 153));
        jLabel8.setText("$");
        BarMesas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("$");
        BarMesas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, 30));

        BotonAgregarProd.setBackground(new java.awt.Color(255, 225, 61));
        BotonAgregarProd.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonAgregarProd.setText("Agregar ");
        BotonAgregarProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarProdActionPerformed(evt);
            }
        });
        BarMesas.add(BotonAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 30));

        BotonCerrarMesa.setBackground(new java.awt.Color(255, 225, 61));
        BotonCerrarMesa.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonCerrarMesa.setText("Cerrar Mesa");
        BotonCerrarMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarMesaActionPerformed(evt);
            }
        });
        BarMesas.add(BotonCerrarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 30));

        BotonReiniciarMesa.setBackground(new java.awt.Color(255, 225, 61));
        BotonReiniciarMesa.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonReiniciarMesa.setText("Reiniciar");
        BotonReiniciarMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonReiniciarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReiniciarMesaActionPerformed(evt);
            }
        });
        BarMesas.add(BotonReiniciarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 30));

        BotonEliminarProducto.setBackground(new java.awt.Color(255, 225, 61));
        BotonEliminarProducto.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonEliminarProducto.setText("Eliminar ");
        BotonEliminarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarProductoActionPerformed(evt);
            }
        });
        BarMesas.add(BotonEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 30));

        BotonRecargar.setBackground(new java.awt.Color(255, 225, 61));
        BotonRecargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3557-illustration-of-a-black-circular-arrow-pv.png"))); // NOI18N
        BotonRecargar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRecargarActionPerformed(evt);
            }
        });
        BarMesas.add(BotonRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 40, 40));

        TOTAL_Palabra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TOTAL_Palabra.setForeground(new java.awt.Color(255, 255, 255));
        TOTAL_Palabra.setText("TOTAL Mesa:");
        BarMesas.add(TOTAL_Palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, 30));

        FondoBarMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_433316lololololo.jpg"))); // NOI18N
        FondoBarMesas.setPreferredSize(new java.awt.Dimension(1300, 800));
        FondoBarMesas.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BarMesas.add(FondoBarMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        BotonJUEGOS.setBackground(new java.awt.Color(153, 153, 153));
        BotonJUEGOS.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonJUEGOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rubik.png"))); // NOI18N
        BotonJUEGOS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonJUEGOS.setEnabled(false);
        BotonJUEGOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJUEGOSActionPerformed(evt);
            }
        });
        BarMesas.add(BotonJUEGOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 60, 60));

        PaneldelBar.addTab("Mesas", BarMesas);

        BarStock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(900, 600));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 550));

        Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Productos);

        BarStock.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 830, -1));

        AgregarProd.setBackground(new java.awt.Color(255, 225, 61));
        AgregarProd.setText("Agregar Stock");
        AgregarProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProdActionPerformed(evt);
            }
        });
        BarStock.add(AgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        jButton18.setBackground(new java.awt.Color(255, 225, 61));
        jButton18.setText("Actualizar");
        jButton18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        BarStock.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, -1));

        Boton_eliminar_producto_stock.setBackground(new java.awt.Color(255, 225, 61));
        Boton_eliminar_producto_stock.setText("Eliminar");
        Boton_eliminar_producto_stock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton_eliminar_producto_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_eliminar_producto_stockActionPerformed(evt);
            }
        });
        BarStock.add(Boton_eliminar_producto_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, -1));

        CrearProd.setBackground(new java.awt.Color(255, 225, 61));
        CrearProd.setText("Crear Prod.");
        CrearProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CrearProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProdActionPerformed(evt);
            }
        });
        BarStock.add(CrearProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        FondoBarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_433316lololololo.jpg"))); // NOI18N
        BarStock.add(FondoBarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PaneldelBar.addTab("Stock", BarStock);

        Bar.add(PaneldelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TablaPrincipal.addTab("CAFE", Bar);

        Cafe.setMaximumSize(new java.awt.Dimension(1000, 700));
        Cafe.setPreferredSize(new java.awt.Dimension(1000, 650));
        Cafe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PaneldelCafe.setMaximumSize(new java.awt.Dimension(1000, 1000));
        PaneldelCafe.setMinimumSize(new java.awt.Dimension(1000, 700));
        PaneldelCafe.setPreferredSize(new java.awt.Dimension(1000, 700));

        CafeMesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JH_CAFE.png"))); // NOI18N
        CafeMesas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        BotonEliminarProducto1.setBackground(new java.awt.Color(255, 255, 51));
        BotonEliminarProducto1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonEliminarProducto1.setText("Eliminar ");
        BotonEliminarProducto1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEliminarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarProducto1ActionPerformed(evt);
            }
        });
        CafeMesas.add(BotonEliminarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 150, 30));

        BotonAgregarProd1.setBackground(new java.awt.Color(255, 255, 51));
        BotonAgregarProd1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonAgregarProd1.setText("Agregar ");
        BotonAgregarProd1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAgregarProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarProd1ActionPerformed(evt);
            }
        });
        CafeMesas.add(BotonAgregarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, 30));

        TablaMesas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaMesas1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(TablaMesas1);

        CafeMesas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 600, 360));

        BotonReiniciarMesa1.setBackground(new java.awt.Color(255, 255, 51));
        BotonReiniciarMesa1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonReiniciarMesa1.setText("Reiniciar");
        BotonReiniciarMesa1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonReiniciarMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReiniciarMesa1ActionPerformed(evt);
            }
        });
        CafeMesas.add(BotonReiniciarMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 150, 30));

        BotonCerrarMesa1.setBackground(new java.awt.Color(255, 255, 51));
        BotonCerrarMesa1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonCerrarMesa1.setText("Cerrar Mesa");
        BotonCerrarMesa1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCerrarMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarMesa1ActionPerformed(evt);
            }
        });
        CafeMesas.add(BotonCerrarMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 150, 30));

        Muestra_de_Totales1.setEditable(false);
        Muestra_de_Totales1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        CafeMesas.add(Muestra_de_Totales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL :");
        CafeMesas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, 30));

        FondoMesasCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_433316lololololo.jpg"))); // NOI18N
        CafeMesas.add(FondoMesasCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PaneldelCafe.addTab("Mesas", CafeMesas);

        CafeStock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setMaximumSize(new java.awt.Dimension(900, 600));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(900, 550));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        CafeStock.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, -1));

        FondoStockCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_433316lololololo.jpg"))); // NOI18N
        CafeStock.add(FondoStockCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PaneldelCafe.addTab("Stock", CafeStock);

        Cafe.add(PaneldelCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TablaPrincipal.addTab("BAR", Cafe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TablaPrincipal.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarProductoActionPerformed
    //Revisar cuando no hay nada seleccionado
    String btns [] ={"Si","Cancelar"};        
    int seguro = JOptionPane.showOptionDialog(rootPane, "Desea eliminar el producto de la mesa?", "Eliminacion", 0, 0, null, btns, null);
            
    if (seguro == JOptionPane.YES_OPTION)
    {
        ProductosLista_Mesa_T.get(Mesa_Seleccionada).remove(seleccion_mesa);
        MostrarTablaMesas();
    }else
    {      
    } 
    }//GEN-LAST:event_BotonEliminarProductoActionPerformed

    private void BotonReiniciarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReiniciarMesaActionPerformed
    String btns [] ={"Si","Cancelar"};        
    int seguro = JOptionPane.showOptionDialog(rootPane, "Desea reiniciar la mesa?", "Reiniciar", 0, 0, null, btns, null);           
    if (seguro == JOptionPane.YES_OPTION)
    {   
        ProductosLista_Mesa_T.get(Mesa_Seleccionada).clear();
        MostrarTablaMesas();
    }else
    {      
    } 
    }//GEN-LAST:event_BotonReiniciarMesaActionPerformed

    private void BotonAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarProdActionPerformed
        Carga_Objeto_Producto();
        VentAgregarProd ventanapopup = new VentAgregarProd();
        ventanapopup.setVisible(true);
        ventanapopup.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotonAgregarProdActionPerformed

    private void BotonEliminarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarProducto1ActionPerformed

    private void BotonAgregarProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarProd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregarProd1ActionPerformed

    private void BotonReiniciarMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReiniciarMesa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonReiniciarMesa1ActionPerformed

    private void Mesa_TRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_TRESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_TRESActionPerformed

    private void AgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProdActionPerformed
        if(Nombre_Producto_Agregar!=null)
        {
            NoAbrirOtraVentanaStock();
        }
    }//GEN-LAST:event_AgregarProdActionPerformed

    private void CrearProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProdActionPerformed
        CrearProducto ventana = new CrearProducto();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_CrearProdActionPerformed

    private void BotonCerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarMesaActionPerformed
       String btns [] ={"Si","Cancelar"};        
    int seguro = JOptionPane.showOptionDialog(rootPane, "Desea cerrar la mesa?", "Cerrar", 0, 0, null, btns, null);
            
    if (seguro == JOptionPane.YES_OPTION)
    {  
        double Total_Operacion;
        Total_Total = Double.parseDouble(Muestra_de_Totales_Mesa.getText());
        double Total_Noche_Operacion = Double.parseDouble(Muestra_de_Totales_Noche.getText());
        Total_Operacion = Total_Total + Total_Noche_Operacion;
        Muestra_de_Totales_Noche.setText(String.valueOf(Total_Operacion));
        Cerrar_Mesa();
        ProductosLista_Mesa_T.get(Mesa_Seleccionada).clear();
        MostrarTablaMesas();
    }else
    {      
    } 
    }//GEN-LAST:event_BotonCerrarMesaActionPerformed

    private void BotonCerrarMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarMesa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrarMesa1ActionPerformed

    private void BotonJUEGOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJUEGOSActionPerformed
        NoAbrirOtraVentanaJuegos();
    }//GEN-LAST:event_BotonJUEGOSActionPerformed

    private void Mesa_CUATROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_CUATROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_CUATROActionPerformed

    private void Mesa_CINCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_CINCOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_CINCOActionPerformed

    private void Mesa_SEISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_SEISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_SEISActionPerformed

    private void Mesa_SIETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_SIETEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_SIETEActionPerformed

    private void Mesa_OCHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_OCHOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_OCHOActionPerformed

    private void Mesa_NUEVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_NUEVEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_NUEVEActionPerformed

    private void Mesa_DIEZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_DIEZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_DIEZActionPerformed

    private void Mesa_ONCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_ONCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_ONCEActionPerformed

    private void Mesa_DOCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_DOCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_DOCEActionPerformed

    private void Mesa_CATORCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_CATORCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_CATORCEActionPerformed

    private void Mesa_TRECEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_TRECEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_TRECEActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        MostrarTablaProductos();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void Tabla_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ProductosMouseClicked
       Seleccion_T_P = Tabla_Productos.getSelectedRow();
       Nombre_Producto_Agregar = (String.valueOf(Tabla_Productos.getValueAt(Seleccion_T_P, 0)));
       Eliminar_Producto = Nombre_Producto_Agregar;
       Cantidad_Producto_Agregar = (String.valueOf(Tabla_Productos.getValueAt(Seleccion_T_P, 2)));
       Categoria_Producto_Agregar = (String.valueOf(Tabla_Productos.getValueAt(Seleccion_T_P, 1)));
       Precio_Producto_Agregar = (String.valueOf(Tabla_Productos.getValueAt(Seleccion_T_P, 3)));
    }//GEN-LAST:event_Tabla_ProductosMouseClicked

    private void Boton_eliminar_producto_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_eliminar_producto_stockActionPerformed
        Eliminar();
        MostrarTablaProductos();
    }//GEN-LAST:event_Boton_eliminar_producto_stockActionPerformed

    private void Mesa_UNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_UNOMouseClicked
        Mesa_Seleccionada = 0;
        Imagen_mesa(Mesa_UNO.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_UNOMouseClicked

    private void Mesa_DOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_DOSMouseClicked
        Mesa_Seleccionada = 1;
        Imagen_mesa(Mesa_DOS.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_DOSMouseClicked

    private void Mesa_TRESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_TRESMouseClicked
        Mesa_Seleccionada = 2;
        Imagen_mesa(Mesa_TRES.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_TRESMouseClicked

    private void Mesa_CUATROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_CUATROMouseClicked
        Mesa_Seleccionada = 3;
        Imagen_mesa(Mesa_CUATRO.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_CUATROMouseClicked

    private void TablaMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMesasMouseClicked
        seleccion_mesa = TablaMesas.getSelectedRow();
        System.out.println(seleccion_mesa);        
    }//GEN-LAST:event_TablaMesasMouseClicked

    private void Mesa_CINCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_CINCOMouseClicked
        Mesa_Seleccionada = 4;
        Imagen_mesa(Mesa_CINCO.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_CINCOMouseClicked

    private void Mesa_SEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_SEISMouseClicked
        Mesa_Seleccionada = 5;
        Imagen_mesa(Mesa_SEIS.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_SEISMouseClicked

    private void Mesa_SIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_SIETEMouseClicked
        Mesa_Seleccionada = 6;
        Imagen_mesa(Mesa_SIETE.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_SIETEMouseClicked

    private void Mesa_OCHOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_OCHOMouseClicked
        Mesa_Seleccionada = 7;
        Imagen_mesa(Mesa_OCHO.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_OCHOMouseClicked

    private void Mesa_NUEVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_NUEVEMouseClicked
        Mesa_Seleccionada = 8;
        Imagen_mesa(Mesa_NUEVE.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_NUEVEMouseClicked

    private void Mesa_DIEZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_DIEZMouseClicked
        Mesa_Seleccionada = 9;
        Imagen_mesa(Mesa_DIEZ.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_DIEZMouseClicked

    private void Mesa_ONCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_ONCEMouseClicked
        Mesa_Seleccionada = 10;
        Imagen_mesa(Mesa_ONCE.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_ONCEMouseClicked

    private void Mesa_DOCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_DOCEMouseClicked
        Mesa_Seleccionada = 11;
        Imagen_mesa(Mesa_DOCE.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_DOCEMouseClicked

    private void Mesa_TRECEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_TRECEMouseClicked
        Mesa_Seleccionada = 12;
        Imagen_mesa(Mesa_TRECE.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_TRECEMouseClicked

    private void Mesa_CATORCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_CATORCEMouseClicked
        Mesa_Seleccionada = 13;
        Imagen_mesa(Mesa_CATORCE.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_CATORCEMouseClicked

    private void Mesa_QUINCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_QUINCEMouseClicked
        Mesa_Seleccionada = 14;
        Imagen_mesa(Mesa_QUINCE.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_QUINCEMouseClicked

    private void BotonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRecargarActionPerformed
        MostrarTablaMesas();
    }//GEN-LAST:event_BotonRecargarActionPerformed

    private void Mesa_DIECISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_DIECISMouseClicked
        Mesa_Seleccionada = 15;
        Imagen_mesa(Mesa_DIECIS.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_DIECISMouseClicked

    private void Mesa_DIECISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_DIECISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_DIECISActionPerformed

    private void Mesa_DIECISIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_DIECISIETEMouseClicked
        Mesa_Seleccionada = 16;
        Imagen_mesa(Mesa_DIECISIETE.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_DIECISIETEMouseClicked

    private void Mesa_DIECISIETE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_DIECISIETE1MouseClicked
        Mesa_Seleccionada = 17;
        Imagen_mesa(Mesa_DIECISIETE1.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_DIECISIETE1MouseClicked

    private void Mesa_DIECIOCHOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_DIECIOCHOMouseClicked
        Mesa_Seleccionada = 18;
        Imagen_mesa(Mesa_DIECIOCHO.getIcon());
        MostrarTablaMesas();
    }//GEN-LAST:event_Mesa_DIECIOCHOMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProd;
    private javax.swing.JPanel Bar;
    private javax.swing.JPanel BarMesas;
    private javax.swing.JPanel BarStock;
    private javax.swing.JButton BotonAgregarProd;
    private javax.swing.JButton BotonAgregarProd1;
    private javax.swing.JButton BotonCerrarMesa;
    private javax.swing.JButton BotonCerrarMesa1;
    private javax.swing.JButton BotonEliminarProducto;
    private javax.swing.JButton BotonEliminarProducto1;
    private javax.swing.JButton BotonJUEGOS;
    private javax.swing.JButton BotonRecargar;
    private javax.swing.JButton BotonReiniciarMesa;
    private javax.swing.JButton BotonReiniciarMesa1;
    private javax.swing.JButton Boton_eliminar_producto_stock;
    private javax.swing.JPanel Cafe;
    private javax.swing.JPanel CafeMesas;
    private javax.swing.JPanel CafeStock;
    private javax.swing.JButton CrearProd;
    private javax.swing.JLabel FondoBarMesas;
    private javax.swing.JLabel FondoBarStock;
    private javax.swing.JLabel FondoMesasCafe;
    private javax.swing.JLabel FondoStockCafe;
    private javax.swing.JLabel Icono_Foto_Mesa;
    private javax.swing.JTabbedPane MenuCarasMesas;
    private javax.swing.JButton Mesa_CATORCE;
    private javax.swing.JButton Mesa_CINCO;
    private javax.swing.JButton Mesa_CUATRO;
    private javax.swing.JButton Mesa_DIECIOCHO;
    private javax.swing.JButton Mesa_DIECIS;
    private javax.swing.JButton Mesa_DIECISIETE;
    private javax.swing.JButton Mesa_DIECISIETE1;
    private javax.swing.JButton Mesa_DIEZ;
    private javax.swing.JButton Mesa_DOCE;
    private javax.swing.JButton Mesa_DOS;
    private javax.swing.JButton Mesa_NUEVE;
    private javax.swing.JButton Mesa_OCHO;
    private javax.swing.JButton Mesa_ONCE;
    private javax.swing.JButton Mesa_QUINCE;
    private javax.swing.JButton Mesa_SEIS;
    private javax.swing.JButton Mesa_SIETE;
    private javax.swing.JButton Mesa_TRECE;
    private javax.swing.JButton Mesa_TRES;
    private javax.swing.JButton Mesa_UNO;
    private javax.swing.JTextField Muestra_de_Totales1;
    private javax.swing.JTextField Muestra_de_Totales_Mesa;
    private javax.swing.JTextField Muestra_de_Totales_Noche;
    private javax.swing.JPanel PanelMesasBar;
    private javax.swing.JPanel Panel_Foto_Acual;
    private javax.swing.JTabbedPane PaneldelBar;
    private javax.swing.JTabbedPane PaneldelCafe;
    private javax.swing.JLabel TOTAL_Palabra;
    private javax.swing.JLabel TOTAL_Palabra1;
    private javax.swing.JTable TablaMesas;
    private javax.swing.JTable TablaMesas1;
    private javax.swing.JTabbedPane TablaPrincipal;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
