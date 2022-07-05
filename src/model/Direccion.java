package model;

public class Direccion {
    String nombre_calle;
    int codigo_postal;
    String numero_calle;
    String numero_piso;

    public Direccion() {
    }

    public Direccion(String nombre_calle, int codigo_postal, String numero_calle, String numero_piso) {
        this.nombre_calle = nombre_calle;
        this.codigo_postal=codigo_postal;
        this.numero_calle=numero_calle;
        this.numero_piso=numero_piso;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

    public void setNombre_calle(String nombre_calle) {
        this.nombre_calle = nombre_calle;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getNumero_calle() {
        return numero_calle;
    }

    public void setNumero_calle(String numero_calle) {
        this.numero_calle = numero_calle;
    }

    public String getNumero_piso() {
        return numero_piso;
    }

    public void setNumero_piso(String numero_piso) {
        this.numero_piso = numero_piso;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "nombre_calle='" + nombre_calle + '\'' +
                ", codigo_postal=" + codigo_postal +
                ", numero_calle='" + numero_calle + '\'' +
                ", numero_piso='" + numero_piso + '\'' +
                '}';
    }
}
