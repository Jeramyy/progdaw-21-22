public class ejercicio8 {
  public static void main(String[] args) {
    int multiplicando = 0;
    int multiplicador = 0;
    int multiplicacion = 0;
   System.out.print("Introduce un numero y mostraré su tabla de multiplicar: \n");
   multiplicando = Integer.parseInt(System.console().readLine());
   do {
     multiplicacion = multiplicando * multiplicador;
     System.out.print("\n");
     System.out.print(+multiplicando+"x"+multiplicador+"="+multiplicacion);
     multiplicador++;
   }while (multiplicador <=10);
  }
}
