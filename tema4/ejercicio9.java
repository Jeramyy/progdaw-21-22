public class ejercicio9 {
  public static void main(String[] args) {
    double a;
    double b;
    double c;
    double x1;
    double x2;
    /*captura de datos*/
    System.out.print("Este programa resuelve esta estructura de una ecuación de segundo grado: ax2 + bx + c = 0");
    System.out.print("\n");
    System.out.print("Ingresa el valor de a: ");
    a = Double.parseDouble(System.console().readLine());
    System.out.print("\n");
    System.out.print("Ingresa el valor de b: ");
    b = Double.parseDouble(System.console().readLine());
    System.out.print("\n");
    System.out.print("Ingresa el valor de c: ");
    c = Double.parseDouble(System.console().readLine());
    /* calculo de las soluciones*/
    if (a==0){
    if (b==0){
    System.out.print("Esto no es una ecuacion");
    } else {
      double radicando;
    radicando = b*b-4*a*c;
     if (radicando >= 0) {
    x1 = (-b + Math.sqrt(radicando))/(2*a);
    x2 = (-b - Math.sqrt(radicando))/(2*a);
    System.out.print("Las soluciones son: ");
    System.out.print("\n");
    System.out.print("x1 = "+x1);
    System.out.print("\n");
    System.out.print("x2 = "+x2);
     } else {
      System.out.print("Esta ecuacion tiene soluciones imaginarias");
      }
    }
    }
    
    /*presentacion de los resultados*/
    
    
    
    
    
    
    
  }
}
