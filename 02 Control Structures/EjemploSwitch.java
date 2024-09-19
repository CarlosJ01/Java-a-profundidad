public class EjemploSwitch {
    public static void main(String args[]) {
        int option = 0;
        switch (option) {
            case 1: // Se pueden agrupar los case
                System.out.println("Uno");
                break; // sin el break no ejecuta todas las opciones hasta que encuentra el break
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Todos los demas");
                break;
        }

        String option2 = "uno";
        switch (option2) {
            case "cero": //Se pueden usar cadenas depues de java 7
                System.out.println(0);
                break;
            case "uno":
                System.out.println(1);
                break;
            default:
                break;
        }

    }
}
