public class ejercicio3 {
  public static void main(String[] args) {
    double[] num = new double[10];
    for(int i=0;i<10;i++){ //pido 10 numero y se guardan en los 10 huecos que tengo (0-9)
    System.out.print("Introduce 10 números y los mostraré en orden inverso: ");
    num[i] = Integer.parseInt(System.console().readLine());}
    for(int i=9;i>=0;i--){ // empiezo desde el hueco 9 hasta el 0 , eso hará que vaya hacia atrás.
      System.out.print(num[i]+" ");}    
    
    
    
    
    
  }
}
