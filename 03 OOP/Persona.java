// DDefinicion de la clase
class Persona {
    // Atributos
    String nombre;
    int edad;
    char genero;

    // Constructor
    Persona(){
        System.out.println("Esto es un constructor");
    }
    
    Persona(String nom,  int ed, char g){
        nombre = nom;
        edad = ed;
        genero = g;
    }

    // Metodos
    void imprimirInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
    }

    void jugar(Persona p){
        System.out.println(nombre+" esta jugando con "+p.nombre);
    }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "carlos";
        p.edad = 25;
        p.genero = 'M';
        p.imprimirInformacion();

        Persona p1 = new Persona();
        p1.nombre = "Karla";
        p1.edad = 31;
        p1.genero = 'F';
        p1.imprimirInformacion();

        p.jugar(p1);

        Persona p3 = new Persona("Jahir", 18, 'M');
    }
}
