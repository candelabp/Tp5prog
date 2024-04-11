public class Viajero {
    //atributos
    String nombre;
    String sexo;
    private Equipaje equipaje;

    //constructores
    public Viajero() {
    }
    public Viajero(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Viajero(String nombre, String sexo, Equipaje equipaje) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.equipaje = equipaje;
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

    //metodos
    public double obtenerPesoEquipaje(){
        return equipaje.getPeso();
    }
}
