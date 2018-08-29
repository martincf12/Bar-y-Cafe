package Interfaz;

import Clases.Mesas;
import Clases.Producto;
import static Interfaz.Principal.Primera_Vez;
import static Interfaz.Principal.ProductosLista;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public final class VentAgregarProd extends javax.swing.JFrame {

    private final String barra = File.separator;
    private final String ubicacion_productos = System.getProperty("user.dir")+barra+"Productos"+barra;
    private boolean dale_dale_C;
    private boolean dale_dale_B;
    private boolean dale_dale_O;
    public static String Nombre_Comida_Puesta_Mesa;
    public static int Cantidad_Comida_Puesta_Mesa;
    public static double Precio_Comida_Puesta_Mesa;
    public static String Nombre_Bebida_Puesta_Mesa;
    public static int Cantidad_Bebida_Puesta_Mesa;
    public static double Precio_Bebida_Puesta_Mesa;
    public static String Nombre_Otros_Puesta_Mesa;
    public static int Cantidad_Otros_Puesta_Mesa;
    public static double Precio_Otros_Puesta_Mesa;
    public static ArrayList<ArrayList<Mesas>> ProductosLista_Mesa_T = new ArrayList<ArrayList<Mesas>>();
      
    public VentAgregarProd() {
        initComponents();
        Cargar_Productos_Mesa();
        dale_dale_C = false;
        dale_dale_B = false;
        dale_dale_O = false;
        for(int i =0; i<= 21; i++){
            ProductosLista_Mesa_T.add(new ArrayList<>());
        } 
    }
    
    public void Cargar_Productos_Mesa()
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
                String Nomb_Carga = mostrar.getProperty("Nombre");
                String Cate_Carga = mostrar.getProperty("Categoria");
                
                switch(Cate_Carga)
                {
                    case "Bebida" : Box_Bebida.addItem(Nomb_Carga);
                        break;
                    case "Comida": Box_Comidas.addItem(Nomb_Carga);
                        break;
                    case "Juegos" : Box_Otros.addItem(Nomb_Carga);
                    break;
                    default: 
                    break;
                }
            }
            catch(IOException e)
            {               
            }
        }       
    }
 
    public void Agregar_a_Mesa()
    {
        int Nro_Mesa = Principal.Mesa_Seleccionada;
        String Cantidad_Comida = (String) Combo_Comidas.getSelectedItem();
        String Nombre_Comida = (String) Box_Comidas.getSelectedItem();
        String Cantidad_Bebida = (String) Combo_Bebidas.getSelectedItem();
        String Nombre_Bebida = (String) Box_Bebida.getSelectedItem();
        String Cantidad_Otro = (String) Combo_Otros.getSelectedItem();
        String Nombre_Otro = (String) Box_Otros.getSelectedItem();

        if(!"0".equals(Cantidad_Comida))
        {   
            for (Producto ProductosLista : ProductosLista) 
            {       
                if (Nombre_Comida.equals(ProductosLista.getNombre()))
                {   
                    Nombre_Comida_Puesta_Mesa = ProductosLista.getNombre();
                    int Cantidad_Comida_Num = Integer.parseInt(Cantidad_Comida);
                    Cantidad_Comida_Puesta_Mesa = Cantidad_Comida_Num;
                    Precio_Comida_Puesta_Mesa = ProductosLista.getPrecio();
                    dale_dale_C = true;
                    break;               
                }               
            }           
        }else
        {
            Nombre_Comida_Puesta_Mesa = ""; Cantidad_Comida_Puesta_Mesa = 0; Precio_Comida_Puesta_Mesa = 0;
        }
        
        if(!"0".equals(Cantidad_Bebida))
        {   
            for (Producto ProductosLista : ProductosLista) 
            {       
                if (Nombre_Bebida.equals(ProductosLista.getNombre()))
                {   
                    Nombre_Bebida_Puesta_Mesa = ProductosLista.getNombre();
                    int Cantidad_Bebida_Num = Integer.parseInt(Cantidad_Bebida);
                    Cantidad_Bebida_Puesta_Mesa = Cantidad_Bebida_Num;
                    Precio_Bebida_Puesta_Mesa = ProductosLista.getPrecio();
                    dale_dale_B = true;
                    break;               
                }               
            }           
        }else
        {
            Nombre_Bebida_Puesta_Mesa = ""; Cantidad_Bebida_Puesta_Mesa = 0; Precio_Bebida_Puesta_Mesa = 0;
        }
        
        if(!"0".equals(Cantidad_Otro))
        {   
            for (Producto ProductosLista : ProductosLista) 
            {       
                if (Nombre_Otro.equals(ProductosLista.getNombre()))
                {   
                    Nombre_Otros_Puesta_Mesa = ProductosLista.getNombre();
                    int Cantidad_Otro_Num = Integer.parseInt(Cantidad_Otro);
                    Cantidad_Otros_Puesta_Mesa = Cantidad_Otro_Num;
                    Precio_Otros_Puesta_Mesa = ProductosLista.getPrecio();
                    dale_dale_O = true;
                    break;               
                }               
            }           
        }else
        {
            Nombre_Otros_Puesta_Mesa = ""; Cantidad_Otros_Puesta_Mesa = 0; Precio_Otros_Puesta_Mesa = 0;
        } 
        
        if (dale_dale_C)
        {
            Mesas mesa = new Mesas(Nombre_Comida_Puesta_Mesa,Precio_Comida_Puesta_Mesa,Cantidad_Comida_Puesta_Mesa);           
            ProductosLista_Mesa_T.get(Nro_Mesa).add(mesa);
        }
        
        if (dale_dale_B)
        {
            Mesas mesa = new Mesas(Nombre_Bebida_Puesta_Mesa,Precio_Bebida_Puesta_Mesa,Cantidad_Bebida_Puesta_Mesa);
            ProductosLista_Mesa_T.get(Nro_Mesa).add(mesa);
        }
        
        if (dale_dale_O)
        {
            Mesas mesa = new Mesas(Nombre_Otros_Puesta_Mesa,Precio_Otros_Puesta_Mesa,Cantidad_Otros_Puesta_Mesa);
            ProductosLista_Mesa_T.get(Nro_Mesa).add(mesa);  
        }
        Primera_Vez = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Box_Comidas = new javax.swing.JComboBox<>();
        Box_Bebida = new javax.swing.JComboBox<>();
        Box_Otros = new javax.swing.JComboBox<>();
        Combo_Comidas = new javax.swing.JComboBox<>();
        Combo_Bebidas = new javax.swing.JComboBox<>();
        Combo_Otros = new javax.swing.JComboBox<>();
        BotonAcept = new javax.swing.JButton();
        BotonCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Box_Comidas.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Box_Comidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Box_Comidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_ComidasActionPerformed(evt);
            }
        });
        getContentPane().add(Box_Comidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 200, 30));

        Box_Bebida.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Box_Bebida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Box_Bebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 30));

        Box_Otros.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Box_Otros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Box_Otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, 30));

        Combo_Comidas.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Combo_Comidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Combo_Comidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Combo_Comidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 55, 30));

        Combo_Bebidas.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Combo_Bebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Combo_Bebidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Combo_Bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 55, 30));

        Combo_Otros.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Combo_Otros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        Combo_Otros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Combo_Otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 55, 30));

        BotonAcept.setBackground(new java.awt.Color(0, 153, 0));
        BotonAcept.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonAcept.setText("Listo");
        BotonAcept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 90, 25));

        BotonCancel.setBackground(new java.awt.Color(255, 0, 0));
        BotonCancel.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        BotonCancel.setText("Cancelar");
        BotonCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 90, 25));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Comidas :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bebidas :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Juegos :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-gris.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BotonCancelActionPerformed

    private void BotonAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptActionPerformed
       Agregar_a_Mesa();
       this.setVisible(false);
    }//GEN-LAST:event_BotonAceptActionPerformed

    private void Box_ComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_ComidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_ComidasActionPerformed

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
            java.util.logging.Logger.getLogger(VentAgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentAgregarProd().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAcept;
    private javax.swing.JButton BotonCancel;
    private javax.swing.JComboBox<String> Box_Bebida;
    private javax.swing.JComboBox<String> Box_Comidas;
    private javax.swing.JComboBox<String> Box_Otros;
    private javax.swing.JComboBox<String> Combo_Bebidas;
    private javax.swing.JComboBox<String> Combo_Comidas;
    private javax.swing.JComboBox<String> Combo_Otros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
