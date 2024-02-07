/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Ventas {
     private ArrayList<Ventas> ventas = new ArrayList<>();
    
    String fruta;
    float valor;
    int cantidad;
    float total;
    float tootalPagar;

    public Ventas() {
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTootalPagar() {
        tootalPagar =0;
        for(int i =0; i<ventas.size();i++){
            tootalPagar += tootalPagar+ventas.get(i).getTotal();
        }        
        return tootalPagar;        
    }
    
    
    public void guardar(String fruta, float valor, int cantidad, float total){    
        Ventas v = new Ventas();
    
              v.setFruta(fruta);
              v.setValor(valor);
              v.setCantidad(cantidad);
              v.setTotal(total);
            
              ventas.add(v);
            
    }
    
    
    public void vaciarArchivo() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\factura.txt"));
        bw.write("");
    }

    public void guardarArchivo() throws IOException{
        vaciarArchivo();
    try {
        
        FileWriter fw = new FileWriter("D:\\factura.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
       
       for(int i =0;i<ventas.size();i++){            
            bw.write((i+1)+","+ventas.get(i).getFruta()+","+ventas.get(i).getValor()+","+ventas.get(i).getCantidad()+","+ventas.get(i).getTotal()+"\n");
        }
           
        pw.close();
        fw.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }        
    
}
    
    public DefaultTableModel MostrarFrutas(){
        //CREAMOS VECTOR QUE CONTENGA CODIGO EDAD NOMBRE
        Vector cabecera = new Vector();
        cabecera.addElement("Pedido N°");
        cabecera.addElement("Fruta");
        cabecera.addElement("Valor 1Kg");
        cabecera.addElement("Cantidad Kg");
        cabecera.addElement("Total");

        
        //CREAMOS LA TABLA PARA AGREGAR LOS DATOS DEL VECTOR
        DefaultTableModel mdTabla = new DefaultTableModel(cabecera,0);
        
        try {
            
            FileReader fr = new FileReader("D:\\factura.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String d;
            while ((d = br.readLine())!=null) {                
                StringTokenizer dato = new StringTokenizer(d,",");                
                Vector x = new Vector();
                
                while (dato.hasMoreTokens()) {                    
                    x.addElement(dato.nextToken());
                }
                mdTabla.addRow(x);
            }
            
        } catch (Exception e) {
        }
            return mdTabla;
    }
    
    public void eliminar (int n) throws IOException{
        ventas.remove(n);
        guardarArchivo();
        
    }
    
        public String mostrarfactura(){
        getTootalPagar();        
        String frut = "";
        String factura = "";
        float impuestos = (float) (0.05*getTootalPagar());
        float descuento;
        float totalfactura;
        
        if(getTootalPagar() > 100000){
            descuento = (float) (0.20*getTootalPagar()); //20%            
        }else{
            descuento=0;
        }
        
        for(int i=0;i<ventas.size();i++){
            frut = frut + String.valueOf("FRUTA: "+ventas.get(i).getFruta()+"\n"+
                    "VALOR Kg: "+ventas.get(i).getValor()+"\n");
        }
        
        totalfactura = (getTootalPagar() + impuestos) - descuento;
        
        
        factura = "***** FRUTAS UNICORDOBA *****\n"+frut+"TOTAL: "+getTootalPagar()+"\n"+
                "IMPUESTOS 5%: "+impuestos+"\n"+"DESCUENTO: "+descuento+"\n"+"\n"+
                "TOTAL A PAGAR: "+totalfactura;
         
        JOptionPane.showMessageDialog(null, factura);
        return factura;        
    }
    

    
}