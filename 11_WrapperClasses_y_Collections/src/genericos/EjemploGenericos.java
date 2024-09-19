package genericos;

class Transporte {};
class Coche extends Transporte{};
class Deportivo extends Coche{};

// T significa que se va a usar el tipo T en la clase
// se pueden limitar los genericos por la herecia que se le especifique
class BeanGenerico<T extends Transporte> {
	private T valor;

	public BeanGenerico(T valor) {
		super();
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
}

public class EjemploGenericos {

	public static void main(String[] args) {
//		Si no se especifica el T entonces es Object
//		BeanGenerico<String> bean = new BeanGenerico<>("Carlos");
//		System.out.println(bean.getValor());
		
//		Falla si no es del tipo que no hereda de la clase que se especifica
//		BeanGenerico<String> bean = new BeanGenerico<>("Hola");
		BeanGenerico<Transporte> bean = new BeanGenerico<>(new Deportivo());
		
	}

}
