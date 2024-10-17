public class MetodoOrdanamiento {
    public static void sortByEdad(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;
                }
            }
        }
    }

    public static Persona binarySearchByEdad(Persona[] personas, int edadBuscada) {
        int inicio = 0;
        int fin = personas.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (personas[medio].getEdad() == edadBuscada) {
                return personas[medio];
            } else if (personas[medio].getEdad() < edadBuscada) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null; 
    }
}
