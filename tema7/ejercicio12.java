public class ejercicio12{
  public static void main(String[] args) {
    int inicial;
    int fin;
    int [] num = new int [10];
    int [] re = new int [10];
    System.out.print("Introduzca 10 números: ");
    for(int i=0;i<10;i++){
      num[i] = Integer.parseInt(System.console().readLine());}
      
      System.out.print("Índice");
      
      for(int i=0;i<10;i++){
      System.out.printf("%3s|", i);}
      
      System.out.println();
      System.out.print("Valor ");
      
    for(int i=0;i<10;i++){
    System.out.printf("%3s|", num[i]);}
    
    System.out.println();
    System.out.print("Introduzca la posición inicial de un número(0-9): ");
    inicial = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduzca la posición final de un número(0-9): ");
    fin = Integer.parseInt(System.console().readLine());
    System.out.print("--------------------------------------------\n");
    
    for (int i = 0; i < 10; i++) {
re[i] = num[i];
}
re[fin] = num[inicial];
for (int i = fin + 1; i < 10; i++){
re[i] = num[i - 1];}
re[0] = num[9];
for (int i = 0; i < inicial; i++){
re[i + 1] = num[i];}
System.out.println();
for (int i = 0; i < 10; i++) {
System.out.printf("│%3s ", re[i]);}

  }
}
