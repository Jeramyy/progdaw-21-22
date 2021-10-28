public class ejercicio14 {
  public static void main(String[] args) {
    double base;
    double exponente;
    double potencia = 1;
    System.out.print("Introduce una base: ");
    base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce un exponente: ");
    exponente = Double.parseDouble(System.console().readLine());
    if (exponente == 0) {
      potencia = 1;}
      if (exponente == 1) {
        potencia = base;}
        if (exponente > 0) {
          for(int i = 0; i < exponente; i++){
            potencia = potencia * base;
            /**potencia en la primera pasada vale 5(base introducida), en la siguiente potencia vale 5 y seria potencia=5*5 ,luego potencia=25*5,
             * y asi hasta que sea 5 menor a i*/
            } }else {
              potencia = +(1 / (potencia = potencia * base));}
          
        System.out.print("La potencia es de: "+potencia);
          
          

  }
}
