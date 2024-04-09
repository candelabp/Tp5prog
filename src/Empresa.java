public class Empresa {
    public String rSocial;
    Trabajador empleado[];
//constructores
    public Empresa(String rSocial, Trabajador[] empleado) {
        this.rSocial = rSocial;
        this.empleado = empleado;
    }
    public Empresa(){}
    //getter y setter


    public String getrSocial() {
        return rSocial;
    }

    public void setrSocial(String rSocial) {
        this.rSocial = rSocial;
    }

    public Trabajador[] getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Trabajador[] empleado) {
        this.empleado = empleado;
    }
}
