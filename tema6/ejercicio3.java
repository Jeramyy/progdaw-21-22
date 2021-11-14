public class ejercicio3 {
  public static void main(String[] args) {
    String palo = "";
    String carta = "";
    int npalo = (int)(Math.random()*4) + 1;
    switch (npalo) {
      case 1:
      palo = "oro";
      break;
      case 2:
      palo = "copas";
      break;
      case 3:
      palo = "espadas";
      break;
      case 4:
      palo = "bastos";
      break;
      default:
    }
    int ncarta = (int)(Math.random()*10) + 1;
    switch (ncarta) {
      case 1:
      carta = "As";
      break;
      case 8:
      carta = "sota";
      break;
      case 9:
      carta = "caballo";
      break;
      case 10:
      carta = "rey";
      break;
      default:
      carta = String.valueOf(ncarta);
    }
    System.out.print(carta+" de "+palo);
    
    
    
    
  }
}
