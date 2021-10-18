public class ejerciciolectura3 {
  public static void main (String[]args) {
    /* programa que sume, reste, multiplique y divida dos números
     introducidos por teclado*/
     String linea;
     System.out.print("Introduce un número: ");
     linea = System.console().readLine();
     double numero1;
     numero1 = Integer.parseInt( linea );
     System.out.print("Introduce un número: ");
     linea = System.console().readLine();
     double numero2;
     numero2 = Integer.parseInt( linea );
     double sum = numero1 + numero2;
     System.out.print("La suma entre los números es: "+sum);
     System.out.print("\n");
     double res = numero1 - numero2;
     System.out.print("La resta entre los númreos es: "+res);
     System.out.print("\n");
     double div = numero1 / numero2;
     System.out.print("La división entre los números es: "+div);
     System.out.print("\n");
     double mul = numero1 * numero2;
     System.out.print("La multiplicación entre los números es : "+mul);
     


    
    
    
    
    
    
    
  }
}
