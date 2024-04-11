// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        Taxi taxi3 = new Taxi();
        Chofer chofer1 = new Chofer( "Juan", taxi1);
        Chofer chofer2= new Chofer("Maria", taxi2);
        Chofer chofer3= new Chofer("Roberto", taxi3);
        taxi1.setConductores(new Chofer[]{chofer1,chofer2,chofer3});
        System.out.println("Choferes: ");
        for (Chofer chofer : taxi1.getConductores()){
            System.out.println(chofer.getNombre());
        }
        System.out.println("chofer 1: " + taxi1.getConductores()[0].getNombre());

        taxi1.setMatricula("ASE432");
        taxi2.setMatricula("JUL911");
        taxi3.setMatricula("LAO098");
        System.out.println("\nMatricula de " + chofer1.getNombre() + ": " + chofer1.obtenerMateiculaTaxi());
        System.out.println("Matricula de " + chofer2.getNombre() + ": " + chofer2.obtenerMateiculaTaxi());
        System.out.println("Matricula de " + chofer3.getNombre() + ": " + chofer3.obtenerMateiculaTaxi());

        Equipaje equipaje1 = new Equipaje();
        Equipaje equipaje2 = new Equipaje();
        Viajero viajero1 = new Viajero( "Maria", "femenino", equipaje1);
        Viajero viajero2 =  new Viajero("Juan", "Masculino", equipaje2);
        equipaje1.setGuarda(new Viajero[]{viajero1, viajero2});
        System.out.println("\nViajero 1: " + equipaje1.getGuarda()[0].getNombre());

        equipaje1.setPeso(12);
        equipaje2.setPeso(8);
        System.out.println("Peso del equipaje de " + viajero1.getNombre() + ": " + viajero1.obtenerPesoEquipaje());
        System.out.println("Peso del equipaje de " + viajero2.getNombre() + ": " + viajero2.obtenerPesoEquipaje());

        Empresa empresa = new Empresa();
        Trabajador trabajador1 = new Trabajador(42266007, empresa);

        empresa.setEmpleado(new Trabajador[]{trabajador1});
        System.out.println("\nDNI trabajador 1: " + empresa.getEmpleado()[0].getDni());

        empresa.setrSocial("razon social A");
        System.out.println(trabajador1.obtenerRazonSocialEmpleador());

        for (Trabajador trabajador : empresa.getEmpleado()){
            if (trabajador != null){
                System.out.println("DNI: " + trabajador.getDni());
            }
        }
    }
}