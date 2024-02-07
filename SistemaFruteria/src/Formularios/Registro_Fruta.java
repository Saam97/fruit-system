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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Registro_Fruta extends javax.swing.JInternalFrame {
          Frutas frutas = new Frutas();
          Persona persona = new Persona();
          Proveedor provedor = new Proveedor();
          Metodos metodos = new Metodos();
    
    
    
    DefaultTableModel Mdtabla;
    Vector Vcabe = new Vector(); // Cabecera
    
    private TableRowSorter trsfiltro; // Buscar
    /**
     * Autor Sergio Agudelo
     */
    public Registro_Fruta() {        
        initComponents();
        
        Vcabe.addElement("Nombre");
        Vcabe.addElement("Cedula");
        Vcabe.addElement("Fruta");
        Vcabe.addElement("Codigo");
        Vcabe.addElement("Tipo");
        Vcabe.addElement("Precio 1kG");
        Vcabe.addElement("Diponible");
        Vcabe.addElement("Proveedor");
        Vcabe.addElement("Fecha");
        
        
        Mdtabla = new DefaultTableModel(Vcabe,0);
        TblFruta.setModel(Mdtabla);
        metodos.leerArchivo();
        metodos.getContador();
        TblFruta.setModel(metodos.MostrarFrutas()); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblAuto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        TxtCedula1 = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();
        CboTipo = new javax.swing.JComboBox<>();
        BtnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtfiltrar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Txtfruta = new javax.swing.JTextField();
        Cboprovedor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtNombre01 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblFruta = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        jLabel2.setText("Registro Fruta");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 750, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cedula: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tipo Fruta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Precio 1Kg:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Disponible Kg:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        TxtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 160, 30));

        TxtCedula1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TxtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 160, 30));

        TxtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 160, 30));

        TxtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 160, 30));

        CboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Bayas", "Cítricos", "Cucurbitáceas", "Exóticas", "Fruta-dulce", "Frutos-secos" }));
        CboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboTipoActionPerformed(evt);
            }
        });
        jPanel1.add(CboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 147, -1));

        BtnRegistrar.setText("GUARDAR");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grapes.gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 61, -1, -1));

        jButton2.setText("IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        txtfiltrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiltrarActionPerformed(evt);
            }
        });
        txtfiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltrarKeyTyped(evt);
            }
        });
        jPanel1.add(txtfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 220, 30));

        jLabel8.setText("Buscar Fruta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 90, 20));

        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Txtfruta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Txtfruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, 30));

        Cboprovedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Local", "Nacional", "Internacional" }));
        jPanel1.add(Cboprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 160, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Proveedor:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 70, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Fruta:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        TxtNombre01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TxtNombre01, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, 30));

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

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 800, 150));

        jButton3.setText("VACIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jButton4.setText("SALIR");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 610));
        jPanel1.getAccessibleContext().setAccessibleName("REGISTRO Y VENTA DE FRUTAS");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void filtro() {   
    trsfiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtfiltrar.getText(), 2));
        
}
    
    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
         
        String Nombre = TxtNombre01.getText();
        int cedula = Integer.parseInt(TxtCedula1.getText());
        String fruta = Txtfruta.getText();
        String Codigo = TxtCodigo.getText();        
        String Tipo = CboTipo.getSelectedItem().toString();        
        float Precio = Float.parseFloat(TxtPrecio.getText());
        int Cantidad = Integer.parseInt(TxtCantidad.getText());
        String proved = Cboprovedor.getSelectedItem().toString();

        /*persona.setNombre(Nombre);
        persona.setCedula(cedula);
        frutas.setNombre(fruta);
        frutas.setCodigo(Codigo);
        frutas.setTipo(Tipo);
        frutas.setPrecio(Precio);
        frutas.setCantidad(Cantidad);
        provedor.setProvedor(proved);
        */
            
              try {
                  metodos.guardar(Nombre, cedula, fruta, Codigo, Tipo, Precio, Cantidad, proved,metodos.Fecha());
                  metodos.guardarArchivo();
                  metodos.guardarArchivoCliente();
                  JOptionPane.showMessageDialog(null, "FRUTA REGISTRADA CORRECTAMENTE", "Frutas Unicordoba", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Imagenes/fruta.gif"));
              } catch (IOException ex) {
                  Logger.getLogger(Registro_Fruta.class.getName()).log(Level.SEVERE, null, ex);
              }
            
        TxtNombre01.setText("");
        TxtCedula1.setText("");
        Txtfruta.setText("");
        TxtCodigo.setText("");
        TxtCantidad.setText("");
        TxtPrecio.setText("");
        TblFruta.setModel(metodos.MostrarFrutas()); 
        
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        DefaultTableModel modelo = (DefaultTableModel)TblFruta.getModel();
        modelo =(DefaultTableModel)TblFruta.getModel();
        
        //double x= 0.0, precioactual = 0.0, importe = 0.0;
        int fila, resp;
        
        try {
            fila = TblFruta.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el producto que desea eliminar","Advertencia",JOptionPane.WARNING_MESSAGE);
                modelo.removeRow(fila);
            }else{
                resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar este producto","Eliminar",JOptionPane.YES_NO_OPTION);
                if(resp==JOptionPane.YES_OPTION){
                  
                    modelo.removeRow(fila);
                    metodos.eliminar(fila);
                }
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se realizo la eliminación del producto","Error",JOptionPane.ERROR_MESSAGE);
            
        };
 

        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            
            MessageFormat HeaFormat = new MessageFormat("Cantidad Frutas Vendidos");
            MessageFormat footerFormat = new MessageFormat(
                    "Mercado de Frutas  Unicor ");
            TblFruta.print(JTable.PrintMode.NORMAL, HeaFormat, footerFormat);

        } catch (PrinterException e) {
            Logger.getLogger(Registro_Fruta.class.getName()).log(Level.SEVERE, null, e);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void txtfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiltrarActionPerformed
       
    }//GEN-LAST:event_txtfiltrarActionPerformed

    private void TxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoActionPerformed

    private void CboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboTipoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              try {
                  metodos.vaciarArchivo();
              } catch (IOException ex) {
                  Logger.getLogger(Registro_Fruta.class.getName()).log(Level.SEVERE, null, ex);
              }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JComboBox<String> CboTipo;
    private javax.swing.JComboBox<String> Cboprovedor;
    private javax.swing.JTable TblAuto;
    private javax.swing.JTable TblFruta;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtCedula1;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtNombre01;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField Txtfruta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtfiltrar;
    // End of variables declaration//GEN-END:variables

    
    /*
        public void leerArchivo(){
         File file = new File("D:\\frutas.txt");
        
        try {
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                
                Frutas f = new Frutas();
                Persona p = new Persona();
                Proveedor prov = new Proveedor();
                
                p.setNombre(delimitar.next());
                p.setCedula(Integer.parseInt(delimitar.next()));
                f.setNombre(delimitar.next());
                f.setCodigo(delimitar.next());
                f.setTipo(delimitar.next());
                f.setPrecio(Float.parseFloat(delimitar.next()));
                f.setCantidad(Integer.parseInt(delimitar.next()));
                prov.setProvedor(delimitar.next());
                f.setFecha(delimitar.next());
                
                per.add(p);
                fru.add(f);
                pro.add(prov);
                
            }
           
            ActualizarTabla();            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error en la CLASE METODOS - LeerArchivo()"+ e);
        }
    
    }
    
    
     public void ActualizarTabla(){
        DefaultTableModel mdTabla = (DefaultTableModel) TblFruta.getModel();
        
        Object nf[] = {null, null, null,null, null, null,null, null, null};
        
        for(int b= (contador -1); b>=0; b--){
	
            mdTabla.removeRow(b);
        }
        contador =0;
        
        
        Frutas f;
        Persona p;
        Proveedor prov;
        for(Object obj : fru){
            prov = (Proveedor) obj;
            p = (Persona) obj;
            f = (Frutas) obj;
            
            mdTabla.addRow(nf);
            
            mdTabla.setValueAt(p.getNombre(), contador,0);
            mdTabla.setValueAt(p.getCedula(), contador,1);
            mdTabla.setValueAt(f.getNombre(), contador,2);
            mdTabla.setValueAt(f.getCodigo(), contador,3);
            mdTabla.setValueAt(f.getTipo(), contador,4);
            mdTabla.setValueAt(f.getPrecio(), contador,5);
            mdTabla.setValueAt(f.getCantidad(), contador,6);
            mdTabla.setValueAt(prov.getProvedor(), contador,7);
            mdTabla.setValueAt(f.getFecha(), contador,8);
            contador++;
        }
        
    }
    
    
    public void RespaldarArchivo(){
        
        try {
            FileWriter fw = new FileWriter("D:\\frutas.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            Frutas f; Persona p; Proveedor prov;
            
            for(Object obj : fru){
            prov = (Proveedor) obj;
            p = (Persona) obj;
            f = (Frutas) obj;
            
            bw.write(p.getNombre()+","+p.getCedula()+","+f.getNombre()+","+f.getCodigo()+","+
                    f.getTipo()+","+f.getPrecio()+","+f.getPrecio()+","+f.getCantidad()+","+prov.getProvedor()+","+
                    f.getFecha()+"\n");
            }
            fw.close();
            bw.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR METODOS - RespaldarArchivo()"+e);
        }
    }
   
    */
    
    
}
    



