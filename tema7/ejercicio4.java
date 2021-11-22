public class ejercicio4 {
  public static void main(String[] args) {
    
    int[] num = new int [20];
    for(int i=0;i<20;i++){
    num[i] = (int)(Math.random()*101);
    System.out.println();
    int[] cuadrado = new int [20];
    cuadrado[i] = num[i] * num[i];
    System.out.println();
    int[] cubo = new int [20];
    cubo[i] = num[i] * num[i] * num[i];
    System.out.println();

    System.out.print("Numero(Nº"+i+"): "+num[i]+" ");
    System.out.print("Cuadrado(Nº"+i+"): "+cuadrado[i]+" ");
    System.out.print("Cubo(Nº"+i+"): "+cubo[i]+" ");
    
    }
    
  }
}
