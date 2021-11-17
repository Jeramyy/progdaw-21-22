public class ejercicio13 {
  public static void main(String[] args) {
    int dado1 , dado2;
    do {
    dado1 = (int)(Math.random() * 7) + 1;
    System.out.print("El resultado del primer dado es: "+dado1);
    System.out.println();
    dado2 = (int)(Math.random() * 7) + 1;
    System.out.print("El resultado del segundo dado es: "+dado2);
    System.out.println();
    } while (dado1 != dado2);
    
    
    
  }
}
