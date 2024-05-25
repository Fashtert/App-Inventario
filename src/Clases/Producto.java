package Clases;

public class Producto {

    private String cod_pro;
    private String nombre_pro;
    private String descripcion;
    private int cantidad;
    private double precio;
    private String categoria;
    private int cod_ubicacion; //NUMRERO DE RACK DEL 1 AL 10
    private String fechaven;

    public Producto() {
    }

    public Producto(String cod_pro, String nombre_pro, String descripcion, int cantidad, double precio, String categoria, int cod_ubicacion, String fechaven) {
        this.cod_pro = cod_pro;
        this.nombre_pro = nombre_pro;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.categoria = categoria;
        this.cod_ubicacion = cod_ubicacion;
        this.fechaven = fechaven;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCod_ubicacion() {
        return cod_ubicacion;
    }

    public void setCod_ubicacion(int cod_ubicacion) {
        this.cod_ubicacion = cod_ubicacion;
    }

    public String getFechaven() {
        return fechaven;
    }

    public void setFechaven(String fechaven) {
        this.fechaven = fechaven;
    }

   
}
