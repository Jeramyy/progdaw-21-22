public class ejercicio9 {
  public static void main(String[] args) {
    int[] numeros = new int [8];
    System.out.print("Introduce 8 números e iré diciendo si es par o impar: ");
    for(int i=0;i<8;i++){
    numeros[i] = Integer.parseInt(System.console().readLine());
    if(numeros[i] % 2 == 0){
      System.out.print(numeros[i]+" siendo par");} else {
        System.out.print(numeros[i]+" siendo impar");}
        System.out.println();}
    
    
    
    
    
  }
}
