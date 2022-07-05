package model;

public class Alumno {
    String nombre ;
    String apellido ;
    int edad;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(){
        this.nombre=nombre;
    }

    public void setApellido(){
        this.apellido=apellido;
    }
    public void setEdad(){
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
