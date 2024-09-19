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
    
//    Si se define otro constructor se quita el default
    Persona(String nombre,  int edad, char genero){
//      Invoca otro constructor solo al inicio
    	this(); 
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;

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
