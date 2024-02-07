/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import clases.Frutas;
import clases.Metodos;
import clases.Persona;
import clases.Proveedor;
import clases.Ventas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Comprar extends javax.swing.JInternalFrame {
    private TableRowSorter trsfiltro; // Buscar    
    Metodos metodos = new Metodos();
    Ventas ventas = new Ventas();
    //Mostrador
    DefaultTableModel Mdtabla;
    Vector Vcabe = new Vector(); // Cabecera
    
    //Usuario
    DefaultTableModel MdtablaUser;
    Vector Vcabe2 = new Vector(); // Cabecera
    
    /**
     * Autor Sergio Agudelo
     */
    public Comprar() throws IOException {        
        initComponents();       
        //TABLA 1
        Vcabe.addElement("Fruta");
        Vcabe.addElement("Codigo");
        Vcabe.addElement("Tipo");
        Vcabe.addElement("Precio 1kG");
        Vcabe.addElement("Diponible");
        Vcabe.addElement("Proveedor");        
        
        Mdtabla = new DefaultTableModel(Vcabe,0);
        TblFruta.setModel(Mdtabla);
        
        
        //TABLA 2
        Vcabe2.addElement("Pedido N°");
        Vcabe2.addElement("Fruta");
        Vcabe2.addElement("Valor 1 Kg");
        Vcabe2.addElement("Cantidad Kg");
        Vcabe2.addElement("Total");
        
        MdtablaUser = new DefaultTableModel(Vcabe2,0);
        Tblcarrito.setModel(MdtablaUser);
        
        
        metodos.getContador();
        TblFruta.setModel(metodos.MostrarFrutasCliente());       
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblAuto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblFruta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tblcarrito = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtfiltrar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        TblAuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        TblAuto.setForeground(new java.awt.Color(0, 153, 204));
        TblAuto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Numero Placa", "Marca", "Modelo", "Color", "Año Fabri"
            }
        ));
        TblAuto.setGridColor(new java.awt.Color(0, 102, 255));
        TblAuto.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane1.setViewportView(TblAuto);

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema Mercado Frutas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CARRITO");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 670, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grapes.gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        TblFruta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TblFruta);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 660, 150));

        Tblcarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tblcarrito);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 670, 180));

        jButton1.setText("AGREGAR CARRITO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        txtfiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltrarKeyTyped(evt);
            }
        });
        jPanel1.add(txtfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 130, 30));

        jLabel1.setText("BUSCAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jButton2.setText("ELIMINAR PRODUCTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Comprar");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 750, -1));

        jButton3.setText("PAGAR PRODUCTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 630));
        jPanel1.getAccessibleContext().setAccessibleName("REGISTRO Y VENTA DE FRUTAS");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void filtro() {        
    //trsfiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtfiltrar.getText(), 2));
    trsfiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtfiltrar.getText(), 0));
        
}
    
    private void txtfiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyTyped
        txtfiltrar.addKeyListener(new KeyAdapter() {
        public void keyReleased(final KeyEvent e) {
        String cadena = (txtfiltrar.getText());
        txtfiltrar.setText(cadena);
        repaint();
        filtro();
             }
        });
        trsfiltro = new TableRowSorter(TblFruta.getModel());
        TblFruta.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtfiltrarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fruta = null;
        float valor = 0;
        int cantidad = 0;
        float total = 0;
        
        int fila, resp;
        
        try {
            fila = TblFruta.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el producto que desea Agregar","Advertencia",JOptionPane.WARNING_MESSAGE);

            }else{
                int a = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Kilos Desea Comprar de esta fruta?"));
                int aux = Integer.parseInt(TblFruta.getValueAt(fila,4).toString());
                if(a>0 && a<aux){
                 resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de Comprar este producto","Comprar",JOptionPane.YES_NO_OPTION);
                
                if(resp==JOptionPane.YES_OPTION){
                                        
                    fruta = TblFruta.getValueAt(fila,0).toString();
                    valor = Float.parseFloat(TblFruta.getValueAt(fila,3).toString());
                    cantidad = a;
                    total = Float.parseFloat(TblFruta.getValueAt(fila,3).toString())*a;
                    JOptionPane.showMessageDialog(null, "FRUTA AGREGADA AL CARRITO ❤", "Frutas Unicordoba", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Imagenes/fresa.gif"));
                    
                try {
                     ventas.guardar(fruta, valor, cantidad, total);
                     ventas.guardarArchivo();
        } catch (IOException ex) {
                    Logger.getLogger(Comprar.class.getName()).log(Level.SEVERE, null, ex);
        }
                     Tblcarrito.setModel(ventas.MostrarFrutas());;
                
                
                
                
                
                }
                }else{
                        JOptionPane.showMessageDialog(null, "CANTIDAD DE FRUTAS INSUFICIENTES");
                    
                }

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se realizo la Compra del producto","Error",JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)Tblcarrito.getModel();
        modelo =(DefaultTableModel)Tblcarrito.getModel();
        
        //double x= 0.0, precioactual = 0.0, importe = 0.0;
        int fila, resp;
        
        try {
            fila = Tblcarrito.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el producto que desea eliminar","Advertencia",JOptionPane.WARNING_MESSAGE);
                modelo.removeRow(fila);
            }else{
                resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar este producto","Eliminar",JOptionPane.YES_NO_OPTION);
                if(resp==JOptionPane.YES_OPTION){
                  
                    modelo.removeRow(fila);
                    ventas.eliminar(fila);
                }
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se realizo la eliminación del producto","Error",JOptionPane.ERROR_MESSAGE);
            
        };
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      ventas.mostrarfactura();
    }//GEN-LAST:event_jButton3ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblAuto;
    private javax.swing.JTable TblFruta;
    private javax.swing.JTable Tblcarrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtfiltrar;
    // End of variables declaration//GEN-END:variables

}
