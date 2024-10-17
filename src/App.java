import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas personas desea ingresar?");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine();

        Persona[] personas = new Persona[cantidadPersonas];
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese el nombre de la persona: " + (i + 1));
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona: " + (i + 1));
            int edad = scanner.nextInt();
            scanner.nextLine();
            personas[i] = new Persona(nombre, edad);
        }

        MetodoOrdanamiento.sortByEdad(personas);

        System.out.println("Personas ordenadas por edad:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        System.out.println("Ingrese la edad que desea buscar:");
        int edadBuscada = scanner.nextInt();

        Persona personaEncontrada = MetodoOrdanamiento.binarySearchByEdad(personas, edadBuscada);

        if (personaEncontrada != null) {
            System.out.println("Persona encontrada: " + personaEncontrada.getNombre());
        } else {
            System.out.println("No se encontró ninguna persona con esa edad.");
        }

        scanner.close();
    }
}
