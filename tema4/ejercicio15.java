public class ejercicio15 {
  public static void main(String[] args) {
    System.out.print("Elige un símbolo, una letra o número para formar una piramide: ");
    String a = System.console().readLine();
    System.out.print("Eliga en que direccion verá el vértice de la piramide, si arriba , abajo , izquiera o derecha: ");
    String opcion =System.console().readLine();
    
    switch (opcion) {
      case "arriba":
      System.out.println("     "+a);
      System.out.println("    "+a +a +a   );
      System.out.println("   "+a +a +a +a +a );
      System.out.println("  "+a +a +a +a +a +a +a );
      System.out.println(" "+a +a +a +a +a +a +a +a +a );
      break;
      case "abajo":
      System.out.println(" "+a +a +a +a +a +a +a +a +a );
      System.out.println("  "+a +a +a +a +a +a +a );
      System.out.println("   "+a +a +a +a +a );
      System.out.println("    "+a +a +a   );
      System.out.println("     "+a);

      break;
      case "derecha":
      System.out.println("
      System.out.println("
      System.out.println("
      System.out.println("
      System.out.println("
      System.out.println("
      System.out.println("
      System.out.println("
      System.out.println("

      break;  

      case "izquierda":
      System.out.println(" "+a);
      System.out.println(" "+a+a);
      System.out.println(" "+a+a+a);
      System.out.println(" "+a+a+a+a);
      System.out.println(" "+a+a+a+a+a);
      System.out.println(" "+a+a+a+a);
      System.out.println(" "+a+a+a);
      System.out.println(" "+a+a);
      System.out.println(" "+a);

      break;
    }

    
    
    
    
    
    
    
  }
}
