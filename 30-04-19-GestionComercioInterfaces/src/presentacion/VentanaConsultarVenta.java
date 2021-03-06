
package presentacion;

import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import negocio.Articulo;
import negocio.Comercio;
import negocio.Item;
import negocio.Venta;

public class VentanaConsultarVenta extends javax.swing.JFrame {
    private VentanaPrincipal ventPrin;
    private Comercio comercio;
    private DefaultTableModel modelo;

    public VentanaConsultarVenta(VentanaPrincipal vp, Comercio c) {
        initComponents();
        modelo=(DefaultTableModel)tabla.getModel();
        tabla.setModel(modelo);
        ventPrin=vp;
        comercio=c;
        for(Venta iter:comercio.getListadoVentas())
            cmbListaVentas.addItem(iter);
        cmbListaVentas.setSelectedIndex(-1);
        disableAllComponentsButVolverYSel();
    }


    public void disableAllComponentsButVolverYSel(){
        Component[] componentes=this.getContentPane().getComponents();
        for(Component iter:componentes)
            iter.setEnabled(false);
        tabla.setEnabled(false);
        btnVolver.setEnabled(true);
        cmbListaVentas.setEnabled(true);
    }
    
    public void enableAllComponents(){
        Component[] componentes=this.getContentPane().getComponents();
        for(Component iter:componentes)
            iter.setEnabled(true);
        tabla.setEnabled(true);
    }
    
    public void limpiarPantalla(){
        txtCodigoVenta.setText("");
        txtMontoTotal.setText("");
        txtDniComprador.setText("");
        int cantFilas=modelo.getRowCount();
        for(int i=0;i<cantFilas;i++)
            modelo.removeRow(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        cmbListaVentas = new javax.swing.JComboBox<>();
        lblCodigoVenta = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        lblDetalleDeArticulosVendidos = new javax.swing.JLabel();
        lblSeleccione = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblMontoTotal = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        lblDniComprador = new javax.swing.JLabel();
        txtDniComprador = new javax.swing.JTextField();
        jScrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consultar Venta");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cmbListaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaVentasActionPerformed(evt);
            }
        });

        lblCodigoVenta.setText("Codigo de Venta: ");

        txtCodigoVenta.setEditable(false);

        lblDetalleDeArticulosVendidos.setText("Detalle de articulos vendidos:");

        lblSeleccione.setText("Seleccione la Venta a consultar: ");

        lblMontoTotal.setText("Monto Total:");

        txtMontoTotal.setEditable(false);

        lblDniComprador.setText("D.N.I.: Comprador: ");

        txtDniComprador.setEditable(false);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANT.", "Cod.", "DESCRIPCION", "Costo U.", "% Gan.", "Origen", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollTabla.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDetalleDeArticulosVendidos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigoVenta)
                                    .addComponent(lblDniComprador, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDniComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSeleccione)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbListaVentas, 0, 271, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblMontoTotal)
                                .addGap(4, 4, 4)
                                .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeleccione)
                    .addComponent(cmbListaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoVenta)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniComprador)
                    .addComponent(txtDniComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetalleDeArticulosVendidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoTotal)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventPrin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbListaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaVentasActionPerformed
        if(cmbListaVentas.getSelectedIndex()==-1){
            disableAllComponentsButVolverYSel();
            limpiarPantalla();
        }
        else{
            limpiarPantalla();
            enableAllComponents();
            Venta venta=(Venta)cmbListaVentas.getSelectedItem();
            for(Item iter:venta.getDetalleVenta()){
                Articulo art=iter.getArt();
                Object[] fila={iter.getCant(),art.getCodigo(),art.getDescripcion(),art.getCostoUnitario(),art.getPorcGanancia(),art.descripcionImportado(),iter.valorVentaItem()};
                modelo.addRow(fila);
            }
            txtCodigoVenta.setText(String.valueOf(venta.getCodigo()));
            txtMontoTotal.setText(String.valueOf(venta.montoTotalVenta()));
            txtDniComprador.setText(venta.getDni());
        }
    }//GEN-LAST:event_cmbListaVentasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Venta> cmbListaVentas;
    private javax.swing.JScrollPane jScrollTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCodigoVenta;
    private javax.swing.JLabel lblDetalleDeArticulosVendidos;
    private javax.swing.JLabel lblDniComprador;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtDniComprador;
    private javax.swing.JTextField txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}
