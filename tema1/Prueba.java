public class Prueba {
	public static void main (String[] args) {
		   // esto es un comentario de una sola linea
       /*
         esto es un comentario
         de varias lineas
       */
        
        int nota1 , nota2, nota3;
        String entrada;
        
        System.out.println("Hola");
        System.out.println("Indroduzca un valor entero: ");
        entrada = System.console().readline();
        System.out.println("La cadena introducida es: ");
        System.out.println(entrada);
        nota1 = Interger.parseInt(entrada);
        System.out.print("El numero introducido es: ");
        System.out.print(nota1);
        
	}
}

