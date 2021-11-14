public class ejercicio1 {
  public static void main(String[] args) {
    int dadoUno =(int)(Math.random()*6 + 1);
    int dadoDos =(int)(Math.random()*6 + 1);
    int dadoTres =(int)(Math.random()*6 + 1);
    System.out.print("Se van a tirar 3 dados \n");
    System.out.print("El primer dado ha sacado un: ");    
    for(int i=0;i<1;i++){
    System.out.println(dadoUno);
  }
  System.out.println();
    System.out.print("El segundo dado ha sacado un: ");    
    for(int i=0;i<1;i++){
      System.out.println(dadoDos);
  }
  System.out.println();
    System.out.print("El tercer dado ha sacado un: ");    
    for(int i=0;i<1;i++){
      System.out.println(dadoTres);
  }
  int suma = dadoUno + dadoDos + dadoTres;
  System.out.println();
  System.out.print("La suma de los 3 valores es de: "+suma);
}
}
