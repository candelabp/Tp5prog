import java.util.List;
public class Taxi {
    //atributos
    String matricula;
    Chofer conductores[];

    //constructores
    public Taxi(String matricula, Chofer[] conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }
    public Taxi() {
    }

    //Get y set
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Chofer[] getConductores() {
        return conductores;
    }

    public void setConductores(Chofer[] conductores) {
        this.conductores = conductores;
    }

    //metodos
    public String printMatricula(){
        return matricula;
    }
}
