public class Equipaje {
   private double peso;
   private String tipo;
  private  Viajero guarda[];
  //Constructores


    public Equipaje() {
    }

    public Equipaje(double peso, String tipo, Viajero[] guarda) {
        this.peso = peso;
        this.tipo = tipo;
        this.guarda = guarda;
    }

    //get y set

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Viajero[] getGuarda() {
        return guarda;
    }

    public void setGuarda(Viajero[] guarda) {
        this.guarda = guarda;
    }
}
