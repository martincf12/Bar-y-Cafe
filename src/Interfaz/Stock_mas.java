package Interfaz;

import static Interfaz.Principal.TstVentNvoPres_Stock;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Stock_mas extends javax.swing.JFrame {

    private final int cant_anterior = Integer.parseInt(Principal.Cantidad_Producto_Agregar);
    
    public Stock_mas() 
    {
        initComponents();
        Nombre_agregar_stock.setText(Principal.Nombre_Producto_Agregar);
        Cantidad_stock_mas.setValue(cant_anterior);   
        Cambiar_Precio.setText(Principal.Precio_Producto_Agregar);
    }

    private void Agregar_Stock()
    {
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir")+barra+"Productos"+barra;
        try
        {
            try (FileWriter permite_escrito = new FileWriter(ubicacion+Nombre_agregar_stock.getText()+".txt")) 
            {
                String Nomb = "Nombre=";
                String Cant = "Cantidad=";
                String Prec = "Precio=";
                String Cate = "Categoria=";
                PrintWriter guardar = new PrintWriter(permite_escrito);
                guardar.println(Nomb+Nombre_agregar_stock.getText());
                int cant_posterior = (int) Cantidad_stock_mas.getValue();
                guardar.println(Cant+cant_posterior);
                guardar.println(Prec+Cambiar_Precio.getText());
                guardar.println(Cate+Principal.Categoria_Producto_Agregar);
            }
        } 
        catch (IOException e) 
        {
        }      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonListo_Salir = new javax.swing.JButton();
        BotonListo_Stock = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cambiar_Precio = new javax.swing.JTextField();
        Cantidad_stock_mas = new javax.swing.JSpinner();
        Nombre_agregar_stock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonListo_Salir.setBackground(new java.awt.Color(255, 225, 61));
        BotonListo_Salir.setText("Salir");
        BotonListo_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListo_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonListo_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, 30));

        BotonListo_Stock.setBackground(new java.awt.Color(255, 225, 61));
        BotonListo_Stock.setText("Listo");
        BotonListo_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListo_StockActionPerformed(evt);
            }
        });
        getContentPane().add(BotonListo_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 11, -1, 30));

        Cambiar_Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cambiar_PrecioKeyTyped(evt);
            }
        });
        getContentPane().add(Cambiar_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 80, 30));

        Cantidad_stock_mas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad_stock_masKeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad_stock_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 11, 50, 30));

        Nombre_agregar_stock.setEditable(false);
        getContentPane().add(Nombre_agregar_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 30));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_433316lololololo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 680, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListo_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListo_StockActionPerformed
        Agregar_Stock();
        this.setVisible(false);
        TstVentNvoPres_Stock=false;
    }//GEN-LAST:event_BotonListo_StockActionPerformed

    private void Cantidad_stock_masKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad_stock_masKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad_stock_masKeyTyped

    private void Cambiar_PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cambiar_PrecioKeyTyped
        CrearProducto.Error_Garrafal(evt);
    }//GEN-LAST:event_Cambiar_PrecioKeyTyped

    private void BotonListo_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListo_SalirActionPerformed
        this.setVisible(false);
        TstVentNvoPres_Stock=false;
    }//GEN-LAST:event_BotonListo_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Stock_mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Stock_mas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonListo_Salir;
    private javax.swing.JButton BotonListo_Stock;
    private javax.swing.JTextField Cambiar_Precio;
    private javax.swing.JSpinner Cantidad_stock_mas;
    private javax.swing.JTextField Nombre_agregar_stock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
