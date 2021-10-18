public class ejercicio7 {
  public static void main (String[]args) {
    String linea;
    System.out.print("Inserte el total de la factura sin impuestos: ");
    linea = System.console().readLine();
    double baseim;
    baseim = Integer.parseInt( linea );
    double total = baseim * 0.21f + baseim;
    System.out.print("EL total de la factura sumandole el iva y el impuesto de la Renta sobre las Personas Físicas es de: "+total);
    
    
    
  }
}
