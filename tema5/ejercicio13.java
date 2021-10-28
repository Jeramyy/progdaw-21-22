public class ejercicio13 {
  public static void main(String[] args) {
    int n;
    int nconteo = 0;
    int pconteo = 0;
    
    for (int i = 0; i < 10; i++) {
    System.out.print("Introduzca los números que quiera , diré cuales son positivos y negativos: ");
      n = Integer.parseInt(System.console().readLine());
      if(n > 0) {
        pconteo++; } else {
          nconteo++;}
         }
    System.out.print("Son " +pconteo+ " positivos , y " +nconteo+ " negativos");
   
    
    
    
  }
}
