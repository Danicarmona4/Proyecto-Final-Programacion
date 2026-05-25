package PROYECTO_ATLETICO;

import java.util.*;

public class Jugadores {
    String dorsal;
    String nombre;
    String apellido;
    String posicion;
    Date fecha_vencimiento;

    public Jugadores(String dorsal, String apellido, String nombre, String posicion, Date fecha_vencimiento) {
        this.dorsal = dorsal;
        this.apellido = apellido;
        this.nombre = nombre;
        this.posicion = posicion;
        this.fecha_vencimiento = fecha_vencimiento;
    }


    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dorsal='" + dorsal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion='" + posicion + '\'' +
                ", Contrato hasta=" + fecha_vencimiento +
                '}';
    }
}
