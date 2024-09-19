public class EjemploFor {
    public static void main(String args[]) {
        principal: for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                continue; //Salta a la siguiente iteracion
            }
            if (i == 2) {
                break; // Rompe el ciclo y sale del ciclo
            }
            System.out.println(i);

            // Ciclos anidados ciclos dentro de otros
            secundario: for (int j = 0; j < 100; j++) { // Se coloca una tag para especificar un ciclo
                System.out.println(j);
                break principal; // Rompe el ciclo con el tag
            }
        }
    }
}
