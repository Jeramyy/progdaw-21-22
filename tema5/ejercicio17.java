public class ejercicio17 {
  public static void main(String[] args) {
    int i;
    int n;
    int suma = 0;
    System.out.print("Introduza un número positivo y sumaré sus 100 siguientes: \n");
    n = Integer.parseInt(System.console().readLine());
    if (n>0) {
    for(i = n;i <= 100;i++){
     suma += i;}
   } else {
     System.out.print("El número no es positivo"); }
        System.out.print(suma); 
    
  }
}
