
public class Practice {

	public static void main(String[] args) {
		
		Practice c = new Practice();
		int[] myArray = new int[15];
		String[] nombres = new String[20];
		
		//Ejemplos de los metodos
		//c.asignarValor(myArray);
		//c.ArregloDe100Estudiantes();
		//c.mostrarValores(myArray);
		//c.asignarNombre(nombres);
		//c.buscarValor(myArray, 5);
		//c.eliminarValor(myArray, 5);
	}
	public void asignarValor (int[] array) {
		 array[9] = 5;
		System.out.println("La décima posición del arreglo es: " + array[9]);
	}
	public void asignarNombre (String[] array) {
		array[0] = "Francisco";
		System.out.println("La primera posición del arreglo es: " + array[0]);
	}
	public void ArregloDe100Estudiantes () {
		String[] myArray = new String[100];
		for(int i = 0; i <= myArray.length-1; i++) {
			Estudiante c = new Estudiante();
			myArray[i] = c.nombre;
			System.out.println(myArray[i] + i);
		}
	}
	public void mostrarValores (int[] array) {
		for(int i = 0; i <= array.length-1; i++) {
			System.out.println("El arreglo en la posición " + (i+1) + " tiene como valor: " + array[i]);
		}
	}
	public void buscarValor (int[] array, int valor) {
		for(int i = 0; i <= array.length-1; i++) {
			if(valor == array[i]) {
				System.out.println("El valor: " + valor + " está en el arreglo en la posición " + (i+1));
				System.exit(0);
			}
		}
		System.out.println("el valor no se encuentra en el arreglo");
	}
	public void eliminarValor(int[] array, int valor) {
		for(int i = 0; i <= array.length-1; i++) {
			if(i == array.length-1) {
				array[i] = 0;
			}else if(valor == array[i]) {
				array[i] = array[(i+1)];
				array[(i+1)] = valor;
			}
		}
	}
}
