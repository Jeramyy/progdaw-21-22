public class ejercicio6 {
  public static void main(String[] args) {   
    int[] numero = new int[15]; //Este programa rota los elementos del array , subiendolos un nivel. 
    System.out.print("Introduce 15 números: \n");
    for(int i=0;i<15;i++){
    numero[i] = Integer.parseInt(System.console().readLine());}
   
    //una posicion a la derecha//
    
    int aux = numero [14]; //directamente el ultimo numero que ponemos se coloca en el puesto [0].
    
    for(int i=14;i>0;i--){
      numero[i] = numero[i-1];
    } 
    numero [0] = aux; // este es el [0].
    
    for(int j=0;j<15;j++){
    System.out.print("La posición "+j+" tiene almacenada el "+numero[j]+"\n");}
    
    
  }
}
