
public class EvaluacionTecnicaPil {

  public static void main(String[] args) {

    imprimirBienvenidaEvaluacionTecnica();

    /****
     * TEMAS:
     *   - Tipos de datos.
     *   - Flujos de control.
     *   - Operadores.
     *   - Clases System.
     ****/

    /****
     * CONSIGNAS:
     * 1. Declará al menos tres variables con tipos de datos primitivos.
     **
     * 2. A las variables declaradas anteriormente asignales un valor
     *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.
     * 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:
     *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
     *         Condición falsa --> Imprimí por pantalla un mensaje de error.
     *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
     *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
     *                                 Finalmente, imprimí por pantalla el valor final.
     *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
     ****/


    imprimirConsigna(1);

    int num;
    float decimal;
    short numPequeño;

    imprimirConsigna(2);

    num = 9;
    decimal = 10;
    numPequeño = 2;

    int operacion = (int) ((num + numPequeño) * decimal);
    float operacion2 = ((decimal - numPequeño) / num);

    imprimirConsigna(3);
    if (num>=8 || decimal==10) {
      System.out.println(operacion);
      System.out.println(operacion2);
    } else {
      System.out.println("error condicion falsa");
    }
    if (num<10000 && num>0) {
      System.out.println(num);
      int limite = 0;
     limite=num;
      for (int i = 0; i < limite; i++) {
        num++;
      }
      System.out.println(num);
    }
    int i = 0;
    int n = num/3;
    while (i<n)
    {
      System.out.println(i+1);
      i++;
    }
  }


  private static void imprimirBienvenidaEvaluacionTecnica() {
    System.out.println("*******************************************");
    System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
    System.out.println("*******************************************\n");
  }

  private static void imprimirConsigna(int numeroConsigna) {
    System.out.println("**********");
    System.out.println("CONSIGNA " + numeroConsigna);
    System.out.println("**********\n");
  }

}
