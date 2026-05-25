package PROYECTO_ATLETICO;

public class Competiciones {
    int id_competicion;
    String nombre_proyecto;
    Boolean nacional;
    int ganadas;

    public Competiciones(String nombre_proyecto, int id_competicion, Boolean nacional, int ganadas) {
        this.nombre_proyecto = nombre_proyecto;
        this.id_competicion = id_competicion;
        this.nacional = nacional;
        this.ganadas = ganadas;
    }

    public int getId_competicion() {
        return id_competicion;
    }

    public void setId_competicion(int id_competicion) {
        this.id_competicion = id_competicion;
    }

    public String getnombre_proyecto() {
        return nombre_proyecto;
    }

    public void setnombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public Boolean getNacional() {
        return nacional;
    }

    public void setNacional(Boolean nacional) {
        this.nacional = nacional;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }
    @Override
    public String toString() {
        return "Competicion{" +
                "id_competicion=" + id_competicion +
                ", nombre_proyecto='" + nombre_proyecto + '\'' +
                ", nacional=" + nacional +
                ", ganadas=" + ganadas +
                '}';
    }
}
