
/**
 * Clase para probar objetos
 * 
 * @author (Andrés Llorente) 
 * @version (25/09/2017)
 */
public class Animal{
	private String nombre;
	private int edad;

	public void nace(){
		System.out.println("Holaaa, he nacido");
	}

	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setEdad(int edad){
		this.edad=edad;
	}

}