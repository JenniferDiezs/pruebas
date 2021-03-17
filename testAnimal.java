import java.util.*;

public class testAnimal{

	public static void main(String[] args) {
		
		Animal animal1=new Animal();
		Scanner teclado=new Scanner(System.in);

		System.out.println("Teclee el nombre del animal");
		animal1.setNombre(teclado.nextLine());
		System.out.println("Teclee la edad del animal");		
		int edad=teclado.nextInt();
		animal1.setEdad(edad);

		animal1.nace();
		System.out.println("Mi nombre es "+animal1.getNombre()+" y mi edad es "+animal1.getEdad()+" años");	

	}
}
