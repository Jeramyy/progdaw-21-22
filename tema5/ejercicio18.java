public class ejercicio18 {
  public static void main(String[] args) {
    int numero1;
    int numero2;
    int i;
    System.out.print("Introduce 2 números enteros distintos , e incrementaré de 7 en 7 el menor de ellos \n");
    System.out.print("Introduce el primer número: \n");
    numero1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: \n");
    numero2 = Integer.parseInt(System.console().readLine()); 
       if(numero1>numero2){
         for (i = numero1;i>numero2;i+=7){
         System.out.print(+i+"\n");}
         } else {
           for (i = numero2;i>numero1;i+=7){
         System.out.print(+i+"\n");}
       }
     
    
  }
}
