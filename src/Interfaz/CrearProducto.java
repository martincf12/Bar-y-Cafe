package Interfaz;
        
import Clases.Producto;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class CrearProducto extends javax.swing.JFrame {
            
    public CrearProducto() {
        initComponents();
    }
    
    public static void Error_Garrafal(KeyEvent evt)
    {       
        char c=evt.getKeyChar();
            
        if((Character.isLetter(c))||((c!='0')&&(c!='1')&&(c!='2')&&(c!='3')&&(c!='4')
                &&(c!='5')&&(c!='6')&&(c!='7')&&(c!='8')&&(c!='9')&&(c!='.')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c!=KeyEvent.VK_DELETE)))
        {            
            evt.consume();              
            JOptionPane.showMessageDialog(null, "Ingresa solo números en este campo!\n"
                    + "Para agregar centavos usa el  .  (punto)");            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre_Prod = new javax.swing.JTextField();
        Precio_Prod = new javax.swing.JTextField();
        Combo_Categoria_Add = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Agregar_Prod_Listo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Nombre_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 12, 300, 25));

        Precio_Prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Precio_ProdKeyTyped(evt);
            }
        });
        getContentPane().add(Precio_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 56, 150, 25));

        Combo_Categoria_Add.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inventario", "Comida", "Bebida", "Otros", "Juegos" }));
        getContentPane().add(Combo_Categoria_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, 25));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 25));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 25));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoría :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, -1, 25));

        Agregar_Prod_Listo.setText("Listo");
        Agregar_Prod_Listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_Prod_ListoActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar_Prod_Listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 131, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/a2489559-GRIS-OSCURO.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_Prod_ListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_Prod_ListoActionPerformed
        String Cat_Prod = (String) Combo_Categoria_Add.getSelectedItem();
        if (!"".equals(Nombre_Prod.getText())&&(!"".equals(Cat_Prod)))
        {
            double Precio_Prod_Trans = Double.parseDouble(Precio_Prod.getText());
            Producto nuevo = new Producto(Nombre_Prod.getText(),Precio_Prod_Trans,Cat_Prod);
            nuevo.Crear_Producto();  
            this.setVisible(false);
        }
    }//GEN-LAST:event_Agregar_Prod_ListoActionPerformed

    private void Precio_ProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Precio_ProdKeyTyped
       Error_Garrafal(evt);
    }//GEN-LAST:event_Precio_ProdKeyTyped

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CrearProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Prod_Listo;
    private javax.swing.JComboBox<String> Combo_Categoria_Add;
    private javax.swing.JTextField Nombre_Prod;
    private javax.swing.JTextField Precio_Prod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
