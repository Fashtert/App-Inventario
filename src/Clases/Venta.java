
package Clases;

public class Venta {
    public int serieVenta;
    public String codigoProducto;
    public String producto;
    public double precio;
    public int cantidadRequerida;
    public double total;

    public Venta() {
    }

    public Venta(int serieVenta, String codigoProducto, String producto, double precio, int cantidadRequerida, double total) {
        this.serieVenta = serieVenta;
        this.codigoProducto = codigoProducto;
        this.producto = producto;
        this.precio = precio;
        this.cantidadRequerida = cantidadRequerida;
        this.total = total;
    }

    public int getSerieVenta() {
        return serieVenta;
    }

    public void setSerieVenta(int serieVenta) {
        this.serieVenta = serieVenta;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadRequerida() {
        return cantidadRequerida;
    }

    public void setCantidadRequerida(int cantidadRequerida) {
        this.cantidadRequerida = cantidadRequerida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
