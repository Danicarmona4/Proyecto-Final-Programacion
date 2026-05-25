package PROYECTO_ATLETICO;

public class Cuerpo_tecnico {
    int id_tecnico;
    String nombre_tecnico;
    String ocupacion;

    public Cuerpo_tecnico(int id_tecnico, String nombre_tecnico, String ocupacion) {
        this.id_tecnico = id_tecnico;
        this.nombre_tecnico = nombre_tecnico;
        this.ocupacion = ocupacion;
    }

    public String getNombre_tecnico() {
        return nombre_tecnico;
    }

    public void setNombre_tecnico(String nombre_tecnico) {
        this.nombre_tecnico = nombre_tecnico;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    @Override
    public String toString() {
        return "Tecnico{" +
                " id_tecnico ='" + id_tecnico + '\'' +
                ", nombre_tecnico='" + nombre_tecnico + '\'' +
                ", ocupacion='" + ocupacion + '\'';
    }
}

