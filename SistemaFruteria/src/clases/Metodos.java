package clases;

import Formularios.Registro_Fruta;
import clases.Frutas;
import clases.Persona;
import clases.Proveedor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

/**
 *
 * @author pc
 */
public class Metodos{
        private ArrayList<Frutas> fru = new ArrayList<>();
        private ArrayList<Persona> per = new ArrayList<>();
        private ArrayList<Proveedor> pro = new ArrayList<>();        
        int  contador = 0;

        public int getContador() {
            contador = 0;
            for(int i =0;i<fru.size();i++){
                contador++;
            }
            return contador;
    }

   
         
        
       
    public void guardar(String Nombre, int cedula, String fruta, String codigo, String tipo, float precio, int cantidad, String proovedor, String fecha){    
             
            Frutas f = new Frutas();
            Persona p = new Persona();
            Proveedor pr = new Proveedor();
    
            p.setNombre(Nombre);
            p.setCedula(cedula);
            f.setNombre(fruta);
            f.setCodigo(codigo);
            f.setTipo(tipo);
            f.setPrecio(precio);
            f.setCantidad(cantidad);
            pr.setProvedor(proovedor);
            f.setFecha(fecha);
            
            per.add(p);
            fru.add(f);
            pro.add(pr);
            
}


    public void guardarArchivo() throws IOException{
    vaciarArchivo();
    try {
        
        FileWriter fw = new FileWriter("D:\\frutas.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
       
       for(int i =0;i<fru.size();i++){            
            bw.write(per.get(i).getNombre()+","+per.get(i).getCedula()+","+fru.get(i).getNombre()+","+fru.get(i).getCodigo()+
                    ","+fru.get(i).getTipo()+","+fru.get(i).getPrecio()+","+fru.get(i).getCantidad()+
                    ","+pro.get(i).getProvedor()+","+fru.get(i).getFecha()+"\n");
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
        cabecera.addElement("Nombre");
        cabecera.addElement("Cedula");
        cabecera.addElement("Fruta");
        cabecera.addElement("Codigo");
        cabecera.addElement("Tipo");
        cabecera.addElement("Precio 1Kg");
        cabecera.addElement("Disponible");
        cabecera.addElement("Proveedor");
        cabecera.addElement("fecha");
        
        //CREAMOS LA TABLA PARA AGREGAR LOS DATOS DEL VECTOR
        DefaultTableModel mdTabla = new DefaultTableModel(cabecera,0);
        
        try {
            
            FileReader fr = new FileReader("D:\\frutas.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String d;
            while ((d = br.readLine())!=null) {                
                StringTokenizer dato = new StringTokenizer(d,",");//Separa una cadena con un delimitador - Los tokens se separan mediante delimitadores.                 
                Vector x = new Vector();
                
                while (dato.hasMoreTokens()) {//devuelve true si hay más tokens que obtener en la cadena.                    
                    x.addElement(dato.nextToken());//
                }
                mdTabla.addRow(x);
            }
            
        } catch (Exception e) {
        }
            return mdTabla;
    }
    
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
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error en la CLASE METODOS - LeerArchivo()"+ e);
        }
    
    }   
    
    public void eliminar (int n) throws IOException{
        fru.remove(n);
        per.remove(n);
        pro.remove(n);
        guardarArchivo();
        
    }
    
    public String Fecha() {//Retorna Fecha del Sistema
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YY");
        return formatofecha.format(fecha);
    }
    
    public void vaciarArchivo() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\frutas.txt"));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("D:\\frutascliente.txt"));
        bw.write("");
    }
      
////DATOS DE ARCHIVO Y TABLA DEL CLIENTE***************************************************   
    
    public void guardarArchivoCliente() throws IOException{
            
    try {
        
        FileWriter fw = new FileWriter("D:\\frutascliente.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
       
       for(int i =0;i<fru.size();i++){            
            bw.write(fru.get(i).getNombre()+","+fru.get(i).getCodigo()+
                    ","+fru.get(i).getTipo()+","+fru.get(i).getPrecio()+","+fru.get(i).getCantidad()+
                    ","+pro.get(i).getProvedor()+"\n");
        }
           
        pw.close();
        fw.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public DefaultTableModel MostrarFrutasCliente() throws IOException{        
                
        //CREAMOS VECTOR QUE CONTENGA CODIGO EDAD NOMBRE
        Vector cabecera = new Vector();
        cabecera.addElement("Fruta");
        cabecera.addElement("Codigo");
        cabecera.addElement("Tipo");
        cabecera.addElement("Precio 1Kg");
        cabecera.addElement("Disponible");
        cabecera.addElement("Proveedor");
        
        //CREAMOS LA TABLA PARA AGREGAR LOS DATOS DEL VECTOR
        DefaultTableModel mdTabla = new DefaultTableModel(cabecera,0);
        
        try {
            
            FileReader fr = new FileReader("D:\\frutascliente.txt");
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
    
    
    
    //PREGUNTAR POR QUE NO FUNCIONA
    public void restarcantidad(int pos, int cant,int catactual) throws IOException{
            int aux;
        
          if (catactual>cant) {
              aux = catactual-cant;
              fru.get(pos).setCantidad(aux);
              guardarArchivo();
              JOptionPane.showMessageDialog(null, fru.get(pos).getCantidad());
          }else{
              JOptionPane.showConfirmDialog(null, "FRUTAS INSUFICIENTES"+" VERIFICA LA CANTIDAD DISPONIBLE");
          }
          
     
          
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //PRUEBAS*****************
        
    /*
    
    public void ActualizarTabla(){
        DefaultTableModel mdTabla = new DefaultTableModel();
        
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