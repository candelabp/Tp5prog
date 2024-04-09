// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Taxi taxi1 = new Taxi();
        Chofer chofer1 = new Chofer( "Juan");
        Chofer chofer2= new Chofer("Maria");
        Chofer chofer3= new Chofer("Roberto");
        taxi1.setConductores(new Chofer[]{chofer1,chofer2,chofer3});
        for (Chofer chofer : taxi1.getConductores()){
            System.out.println(chofer.getNombre());
        }
        System.out.println(taxi1.getConductores()[0].getNombre());

        Viajero viajero1 = new Viajero( "Maria", "femenino");
        Viajero viajero2 =  new Viajero("Juan", "Masculino");
        Equipaje equipaje1 = new Equipaje();
        equipaje1.setGuarda(new Viajero[]{viajero1,viajero2});
        System.out.println(equipaje1.getGuarda()[0].getNombre());

        Trabajador trabajador1 = new Trabajador(42266007);

        Empresa empresa = new Empresa();
                empresa.setEmpleado(new Trabajador[]{trabajador1});
        System.out.println(empresa.getEmpleado()[0].getDni());

    }
}