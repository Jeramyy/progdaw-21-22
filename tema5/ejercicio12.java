public class ejercicio12 {
  public static void main(String[] args) {
  int a,b,c,n;
  a = 0;
  b = 1;
  System.out.print("Introduce la cantidad de numeros para la serie de fibonacci: ");
  n = Integer.parseInt(System.console().readLine());
  for(int i=0;i<n;i++) {
  System.out.print(+a+"\n");
    c = a + b;
    a = b;
    b = c;   
    /**primero se ve lo de for , se cumple que n(introducido(6)) es mayor que lo que vale i (0) entonces pintan a(0),
     * luego se cambian todos los valores de c ,a y b para la siguiente pasada , entonces , se ve lo de for , n(6) es mayor que lo que valle i(1),
     * entonces pinta a(1) y se cambian los valores de c ,a y b , y asi una y otra vez*/
    }
  
  }
}
