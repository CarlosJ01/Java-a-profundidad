class EjemploIf {

    public static void main(String args[]) {
        int edad = 22;

        // Condicional
        boolean mayor = edad >= 18; // Expresion Booleana
        if (mayor) {
            System.out.println("Mayor de edad");
        } else if (edad <= 15) {
            System.out.println("Llamar a los padres");
        } 
        else {
            System.out.println("Menor de edad");
        }
    }
    
}
