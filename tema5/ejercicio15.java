public class ejercicio15 {
  public static void main(String[] args) {
    int base,exponente = 0,exponentefinal = 1,resultado,i;
    int potencia = 0;
    System.out.print("Introduzca la base de la potencia: \n");
    base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduca el exponente: \n");
    exponente = Integer.parseInt(System.console().readLine());
    
    for (i=1;i<=exponente;i++){
      System.out.print(+base+ "^" +(exponentefinal)+"\n");
      exponentefinal = exponentefinal + 1  ;
      
      
    }
    
    
    
  }
}
    
