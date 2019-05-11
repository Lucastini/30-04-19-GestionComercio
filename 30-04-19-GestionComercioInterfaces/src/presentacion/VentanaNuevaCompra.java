
package presentacion;

import java.util.LinkedList;
import javax.swing.DefaultListModel;
import negocio.Comercio;
import negocio.Compra;
import negocio.Item;
import negocio.PedidoEnConstruccion;

public class VentanaNuevaCompra extends javax.swing.JFrame {
    private VentanaPrincipal ventPrin;
    private Comercio comercio;
    private PedidoEnConstruccion pedido;
    private DefaultListModel modeloPedido;

    public VentanaNuevaCompra(VentanaPrincipal vp, Comercio c) {
        ventPrin=vp;
        comercio=c;
        initComponents();
        pedido=new PedidoEnConstruccion();
        modeloPedido=new DefaultListModel();
        lstDetalleCompra.setModel(modeloPedido);
        actualizarListadoItems();
    }
    
    public boolean addItem(Item i){
        return pedido.addItem(i);
    }
    
    public void actualizarListadoItems(){
        modeloPedido.clear();
        for(Item iter:pedido.getDetallePedido())
            modeloPedido.addElement(iter);
    }
    
    public void actualizarMontoTotal(){
        txtMontoTotal.setText(String.valueOf(pedido.montoTotalPedido()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNuevaCompra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDetalleCompra = new javax.swing.JList<>();
        btnAgregarItemALaCompra = new javax.swing.JButton();
        lblMontoTotal = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        btnConfirmarCompra = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblDetalleDeArticulos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nueva Compra");

        lblNuevaCompra.setText("Nueva Compra en carga:");

        jScrollPane1.setViewportView(lstDetalleCompra);

        btnAgregarItemALaCompra.setText("Agregar Item a la Compra");
        btnAgregarItemALaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarItemALaCompraActionPerformed(evt);
            }
        });

        lblMontoTotal.setText("Monto Total:");

        txtMontoTotal.setEditable(false);

        btnConfirmarCompra.setText("Confirmar Compra");
        btnConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCompraActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblDetalleDeArticulos.setText("Detalle de articulos a comprar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnConfirmarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDetalleDeArticulos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarItemALaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNuevaCompra, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addComponent(lblMontoTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 35, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevaCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblDetalleDeArticulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoTotal)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarItemALaCompra)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarCompra)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventPrin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarItemALaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarItemALaCompraActionPerformed
        VentanaNuevoItem vni=new VentanaNuevoItem(this, pedido, comercio);
        vni.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarItemALaCompraActionPerformed

    private void btnConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCompraActionPerformed
        if(pedido.getDetallePedido().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "Agregue primero los items a comprar");
        else{
            LinkedList<Item> copiaDetPed=new LinkedList(pedido.getDetallePedido());
            Compra c=new Compra(copiaDetPed);
            comercio.addCompra(c);
            modeloPedido.clear();
            pedido.getDetallePedido().clear();
            txtMontoTotal.setText("");
            javax.swing.JOptionPane.showMessageDialog(null, "La compra se registro correctamente");
        }
    }//GEN-LAST:event_btnConfirmarCompraActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarItemALaCompra;
    private javax.swing.JButton btnConfirmarCompra;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDetalleDeArticulos;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblNuevaCompra;
    private javax.swing.JList<Item> lstDetalleCompra;
    private javax.swing.JTextField txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}