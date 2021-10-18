public class Prueba3 {
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
        entrada = System.console().readLine();
        System.out.println("La cadena introducida es: ");
        System.out.println(entrada);
        nota1 = Integer.parseInt(entrada);
        System.out.println("El numero introducido es: ");
        System.out.println(nota1);
        
	}
}

