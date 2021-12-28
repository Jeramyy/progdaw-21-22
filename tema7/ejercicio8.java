public class ejercicio8 {
  public static void main(String[] args) {
        String mes = "";
        int[] temp = new int[12];
        System.out.print("Introduzca la media del frío en cada mes \n");
        for(int i=0;i<12;i++){
      temp[i] = Integer.parseInt(System.console().readLine()); }
      for(int i=0;i<12;i++){
        System.out.println();
        switch (i) {
          case 0:
          mes = "enero";
          break;
          case 1:
          mes = "febrero";
          break;
          case 2:
          mes = "marzo";
          break;
          case 3:
          mes = "abril";
          break;
          case 4:
          mes = "mayo";
          break;
          case 5:
          mes = "junio";
          break;
          case 6:
          mes = "julio";
          break;
          case 7:
          mes = "agosto";
          break;
          case 8:
          mes = "septiembre";
          break;
          case 9:
          mes = "octubre";
          break;
          case 10:
          mes = "noviembre";
          break;
          case 11:
          mes = "diciembre";
          break;}
          String caracter = "*";
      System.out.printf("%12s"+"|",mes);
      for(int j=0;j<=temp[i];j++){
      System.out.print(caracter);
      }
      System.out.print(temp[i]+"Cº");
      }
      
        
    
    
    
    
    
    
    
    
  }
}
