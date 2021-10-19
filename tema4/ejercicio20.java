public class ejercicio20 {
  public static void main(String[] args) {
   int n;
   boolean capicua = false;
   System.out.print("Escribe un número y te diré si es capicua");
   String linea;
   linea = System.console().readLine();
   n = Integer.parseInt(linea);
   if (n <= 9 ) {
     capicua = true; }
     if ((n >= 10 ) && (n <=99)) {
       if ((n / 10 ) == (n % 10)){
         capicua = true; ;} }
         if ((n >= 100) && (n <= 999)) {
           if ((n / 100)  == (n % 10)){
             capicua = true; } }
             if ((n >= 1000) && (n <= 9999)) {
                if (((n / 1000)  == (n % 10)) && (((n/100) % 10)  == ((n % 100) / 10))){
                      capicua = true; } }
                      if ((n >= 10000) && (n <= 99999)) {
                        if ((n / 10000)  == (n % 10)){
                          if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10)))
                            capicua = true; } }
             
        if (capicua) {
        System.out.println("El número introducido es capicúa.");
          } else {
            System.out.println("El número introducido no es capicúa.");
        }

    
    
  }
}
