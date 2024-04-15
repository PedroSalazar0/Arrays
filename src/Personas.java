package collection2ArrayList;

// Clase Personas para ClaseColeccion2
public class Personas {

	// Atributos
	private String nombre;
	private int edad;

	// Constructores
	public Personas() {
		super();
	}
	
	public Personas(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getter y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
