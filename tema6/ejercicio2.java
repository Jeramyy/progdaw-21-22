public class ejercicio2 {
  public static void main(String[] args) {
    //Realiza un programa que muestre al azar el nombre de una carta de la baraja
    //francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
    //y tréboles.Cada palo está formado por 13 cartas, de las cuales 9 cartas son
    //numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
    //1). Para convertir un número en una cadena de caracteres podemos usar
    //String.valueOf(n).
    
    // 4palos --> picas , corazones , diamantes , treboles = 2,3,4,5,6,7,8,9,10,J,Q,K,A
    
    
    
    System.out.print("Este programa muestra al azar el nombre de una carta de la baraja francesa \n");
    String palo = "";
    String carta = "";
    int npalo = (int)(Math.random()*4) + 1;
    switch (npalo){
      case 1:
      palo = "picas";
      break;
      case 2:
      palo = "corazones";
      break;
      case 3:
      palo = "diamantes";
      break;
      case 4:
      palo = "tréboles";
      break;
      default:
    }
    
    int ncarta = (int)(Math.random()*13) + 1;
    switch (ncarta) {
      case 1:
      carta = "A";
      break;
       case 11:
      carta = "J";
      break;
       case 12:
      carta = "Q";
      break;
       case 13:
      carta = "K";
      break;
    default: 
    carta = String.valueOf(ncarta);
  }
  System.out.print(carta+ " de " +palo);
  }
}
