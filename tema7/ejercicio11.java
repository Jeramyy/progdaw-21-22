public class ejercicio11{
  public static void main(String[] args) {
    int primo = 0;
    int normal =0;
    int [] prim = new int [10];
    int [] nor = new int [10];
    int [] num = new int [10];
    boolean esPrimo = false;
    System.out.print("Introduce 10 números: ");
    for(int i=0;i<10;i++){
      num[i] = Integer.parseInt(System.console().readLine());
    esPrimo = true;
    for(int j=2;j<num[i];j++){
      if(num[i] % j == 0){
        esPrimo = false;
      }
     } 
    
    if(esPrimo){
      prim[primo++] = num[i];} else {
        nor[normal++] = num[i];}}
     for(int i=0;i<primo;i++){
       num[i] = prim[i];
     }
     for(int i=primo;i<primo + normal;i++){
     num[i] = nor[i - primo];
     }
     System.out.print("Índice ");
    for(int j=0;j<10;j++){
    System.out.printf("%3s|", j);}
    System.out.println();
    System.out.print("----------------------------------------------- \n");
    System.out.print("Valor: ");
    for(int i=0;i<10;i++){
    System.out.printf("%3s|", num[i]);}
    System.out.println();
     for(int i=0;i<10;i++){
       System.out.print(num[i]+"  ");}
       
    
}
}

