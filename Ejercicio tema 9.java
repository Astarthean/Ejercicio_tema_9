//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Jorge";
        cliente.edad = 25;
        cliente.telefono = 123456789;
        cliente.credito = 1800;
        System.out.println("Nombre de Cliente: " + cliente.nombre);
        System.out.println("Edad del cliente: " + cliente.edad);
        System.out.println("Telefono del cliente: " + cliente.telefono);
        System.out.println("Credito disponible del cliente: " + cliente.credito);

        System.out.println("                ");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Ana";
        trabajador.edad = 23;
        trabajador.telefono = 987654321;
        trabajador.salario = 1500;
        System.out.println("Nombre del Trabajador: " + trabajador.nombre);
        System.out.println("Edad del Trabajador: " + trabajador.edad);
        System.out.println("Telefono del Trabajador: " + trabajador.telefono);
        System.out.println("Salario del Trabajador: " + trabajador.salario);
        }
static class Persona {
    String nombre;
    int edad;
    int telefono;
}
static class Cliente extends Persona{
    double credito;
}

static class Trabajador extends Persona {
    double salario;
}


}