
package Clases;


public class Proveedores {
private int codigo;
private String nombre_proveedor;
private String tipo_proveedor;
private String nombre_empresa;
private String distrito;
private String telefonocontacto;
private String correo;
private String fecha;
private String frecuencia;

    public Proveedores() {
    }

    public Proveedores(int codigo, String nombre_proveedor, String tipo_proveedor, String nombre_empresa, String distrito, String telefonocontacto, String correo, String fecha, String frecuencia) {
        this.codigo = codigo;
        this.nombre_proveedor = nombre_proveedor;
        this.tipo_proveedor = tipo_proveedor;
        this.nombre_empresa = nombre_empresa;
        this.distrito = distrito;
        this.telefonocontacto = telefonocontacto;
        this.correo = correo;
        this.fecha = fecha;
        this.frecuencia = frecuencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getTipo_proveedor() {
        return tipo_proveedor;
    }

    public void setTipo_proveedor(String tipo_proveedor) {
        this.tipo_proveedor = tipo_proveedor;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefonocontacto() {
        return telefonocontacto;
    }

    public void setTelefonocontacto(String telefonocontacto) {
        this.telefonocontacto = telefonocontacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

}
