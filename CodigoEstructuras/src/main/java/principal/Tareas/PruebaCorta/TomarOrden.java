package principal.Tareas.PruebaCorta;

/**
 *
 * @author Patrick
 */
public class TomarOrden extends javax.swing.JFrame {

    private cola Cola = new cola();
    
        
    public TomarOrden() {
        initComponents();
        
        //Esto permite oprimir enter para ingresar los datos
        this.getRootPane().setDefaultButton(btn_ingresar);
    }
    
    public TomarOrden(cola Cola) {
        initComponents();
        
        this.Cola = Cola;
        
        //Esto permite oprimir enter para ingresar al digitar los datos
        this.getRootPane().setDefaultButton(btn_ingresar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre_cliente = new javax.swing.JLabel();
        lbl_cedula_cliente = new javax.swing.JLabel();
        lbl_producto = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        txt_cedula_cliente = new javax.swing.JTextField();
        txt_nombre_cliente = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_producto = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        chb_discapacidad = new javax.swing.JCheckBox();
        lbl_discapacidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nombre_cliente.setText("Nombre del cliente");

        lbl_cedula_cliente.setText("Cédula del cliente");

        lbl_producto.setText("Producto a comprar");

        lbl_total.setText("Total");

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        mostrar.setText("Ver Ordenes");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        chb_discapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_discapacidadActionPerformed(evt);
            }
        });

        lbl_discapacidad.setText("Discapacidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cedula_cliente)
                            .addComponent(lbl_total)
                            .addComponent(lbl_producto)
                            .addComponent(lbl_nombre_cliente)
                            .addComponent(lbl_discapacidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chb_discapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cedula_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txt_nombre_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txt_total, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txt_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(mostrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre_cliente)
                    .addComponent(txt_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cedula_cliente)
                    .addComponent(txt_cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_producto)
                    .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chb_discapacidad)
                    .addComponent(lbl_discapacidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String sector = txt_nombre_cliente.getText();
        int cedula = Integer.parseInt(txt_cedula_cliente.getText());
        String producto = txt_producto.getText();
        int total = Integer.parseInt(txt_total.getText());
        boolean discapacidad = false;
        
        if (chb_discapacidad.isSelected()){
            discapacidad = true;
        }
        
        node Orden = new node(sector, cedula, producto, total, discapacidad);
        
        Cola.enqueue(Orden);
        
        limpiar_cajas_de_texto();
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
        //System.out.println(Cola.dequeue().getValue3());
    }//GEN-LAST:event_btn_salirActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        
        VerOrdenes ordenes = new VerOrdenes(Cola);
                
        ordenes.setTitle("Ordenes");

        ordenes.setLocationRelativeTo(null);

        ordenes.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_mostrarActionPerformed

    private void chb_discapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_discapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_discapacidadActionPerformed

private void limpiar_cajas_de_texto(){
        
        this.txt_nombre_cliente.setText("");
        this.txt_cedula_cliente.setText("");
        this.txt_producto.setText("");
        this.txt_total.setText("");
    }
    
    
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TomarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TomarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TomarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TomarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TomarOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JCheckBox chb_discapacidad;
    private javax.swing.JLabel lbl_cedula_cliente;
    private javax.swing.JLabel lbl_discapacidad;
    private javax.swing.JLabel lbl_nombre_cliente;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField txt_cedula_cliente;
    private javax.swing.JTextField txt_nombre_cliente;
    private javax.swing.JTextField txt_producto;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
