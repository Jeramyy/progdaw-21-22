public class ejercicio10v2 {
  public static void main(String[] args) {
    //Escribe un programa que calcule la media de un conjunto de numeros positivos introducidos por teclado.EL usuario debe decir cuantos numeros va a poner*//
    double veces = 0;
    double numeros = 0;
    double suma = 0;
    double numeroIntroducido = 0;
    System.out.print("Introduzca la cantidad de números que va a introducir: ");
    veces = Double.parseDouble(System.console().readLine());
    for(int i = 0; i < veces; i++) {
    System.out.print("Introduzca los numeros: ");
    numeros = Double.parseDouble(System.console().readLine());
    suma += numeros;
  }
    System.out.print("La media de las numeros son: "+(suma/veces));

    
    
    
    
    
    
    
    
  }
}
