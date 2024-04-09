public class Viajero {
    String nombre;
    String sexo;
//constructores
    public Viajero() {
    }

    public Viajero(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    //get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
