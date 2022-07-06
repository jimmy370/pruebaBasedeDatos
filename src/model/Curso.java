package model;

import java.time.LocalDate;

public class Curso {
    int idCurso;
    String nombre;
    LocalDate fecha_inicio;
    LocalDate fecha_salida;

    public Curso() {
    }

    public Curso(int idCurso,String nombre, LocalDate fecha_inicio, LocalDate fecha_salida) {
        this.idCurso=idCurso;
        this.nombre=nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_salida=fecha_salida;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nombre='" + nombre + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_salida=" + fecha_salida +
                '}';
    }
}

