
package clases;

/*
@Author Sergio Agudelo
*/

    public class Frutas {
         private String codigo;
         private String nombre;
         private String tipo;
         private float precio;
         private int cantidad;
         private String fecha;
         private int contador;
         
         
    public Frutas(String codigo, String nombre, String tipo, float precio, int cantidad,String fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    
    
    public Frutas() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
    
}
