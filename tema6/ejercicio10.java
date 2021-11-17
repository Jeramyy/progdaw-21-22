public class ejercicio10 {
  public static void main(String[] args) {
    String simbolo ="";
    for(int i=0;i<=10;i++){
    int caracter = (int)(Math.random() * 6) + 1;
    int longitud = (int)(Math.random() * 40) + 1;
    switch (caracter) {
      case 1:
      simbolo = "*";
      break;
      case 2:
      simbolo = "-";
      break;
      case 3:
      simbolo = "=";
      break;
      case 4:
      simbolo = ".";
      break;
      case 5:
      simbolo = "|";
      break;
      case 6:
      simbolo = "@";
      break;
      default:
    }
  for(int j=0;j<=longitud;j++){
    System.out.print(simbolo);
    }
    System.out.println();
    
    
    
    
    
    
    
    
    
  }
}
}
