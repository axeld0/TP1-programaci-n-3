import java.util.Scanner;

public class Main
{
    static Scanner teclado;

    public static void main (String[]args)
    {
        teclado = new Scanner(System.in);
    int [] arrayNumeros = {10, 10, 1};
    //float respuesta = promedioArregloDeNumeros(arrayNumeros); /*ejercicio 1*/
       // System.out.println(respuesta);
       // boolean par = indicadorNumeroPar(22); /*ejercicio 2*/
        // System.out.println(par);

       // mostrar100NumerosPrimos(); /*ejercicio 3*/

       // muestraNNumerosPrimos(); /*ejercicio 4*/

       //ingresarNumerosYChequearSiSonPrimos(); /*ejercicio 6*/

        //int sumatoria = suma10NumerosNaturales(); /*ejercicio 7*/
        //System.out.println("La sumatoria de los primeros 10 numeros naturales es " + sumatoria);

        //sumarNumerosPositivos(); /*ejercicio 8*/

        //calcularBisiesto(); /*ejercicio  8*/
        
         //calcularBisiesto(); /*ejercicio  9*/
        // encontrarValorAscii(); /*ejercicio 10*/
        //multiplicarNumeros(); /*ejercicio 11*/
        //calculoArea(); /*ejercicio 12*/
        //buenosDiasNombreIntroducido(); /*ejercicio 13*/
        //dobleYTriple(); /*ejercicio 14*/
        //centigradosAFahrenheit(); /*ejercicio 15*/
        //longitudYArea(); /*ejercicio 16*/
        
        teclado.close();
    }


/*Ejercicio nº1: Calcular el promedio de un arreglo de números enteros.
 Realizar variantes con arreglos ya inicializados e ingreso por teclado.
 */

    public static float promedioArregloDeNumeros (int [] arrayNumeros)
    {
        float promedio = 0;
        int sumatoria = 0;
        for(int i = 0 ; i < arrayNumeros.length ; i++)
        {
            sumatoria += arrayNumeros[i];
        }
        promedio = (float)sumatoria / (float) arrayNumeros.length;

        return promedio;
    }

    /*Ejercicio nº2: Calcular si un número es par o no.
     */
     public static boolean indicadorNumeroPar (int numeroAEvaluar)
     {
         boolean esPar = false;
         if (numeroAEvaluar % 2 == 0)
         {
             esPar = true;
         }
         return esPar;
     }

     /*Ejercicio nº3: Mostrar los primeros 100 números primos.

      */

    public static void mostrar100NumerosPrimos ()
    {
        int cuenta;  //contador. Como los numeros primos son divisibles por 1 y por si mismos unicamente, es en el unico caso que el resto es cero.
                    // hay que usar eso para recorrer los primeros cien numeros.

        for (int i = 2; i <= 100 ; i++)  //toma a partir del 2 porque el uno no es primo
        {
            cuenta = 0;
            for (int j = 1; j <= i ; j++) //va desde 1 hasta el numero en el que nos encontramos.
                if (i % j == 0) {
                    cuenta++;   //contador que sirve para ver si es divisible por si mismo y por 1
                }
            if (cuenta == 2)  //si efectivamente es divisible por 1 y por si mismo
            {
                System.out.println(i + "  ");
            }
        }

    }

    /*Ejercicio nº4: Mostrar los primeros n números primos.
     */

    public static void muestraNNumerosPrimos ()
    {
        System.out.println("Ingrese un numero : ");

        int limite = teclado.nextInt();

        int cuenta;

        for (int i = 2; i <= limite ; i++)  {
            cuenta = 0;
            for (int j = 1; j <= i ; j++)
                if (i % j == 0) {
                    cuenta++;
                }
            if (cuenta == 2)
            {
                System.out.println(i + "  ");
            }
        }

    }

    /*Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo. */

    public static void ingresarNumerosYChequearSiSonPrimos ()
    {
        String respuesta = new String();
        do {
            System.out.println("Ingrese un numero : ");
            int numAChequear = teclado.nextInt();
            int cuenta = 0;
            for (int j = 1; j <= numAChequear ; j++) {
                if (numAChequear % j == 0) {
                    cuenta++;
                }
            }
            if (cuenta == 2)
            {
                System.out.println(numAChequear + " Es primo ");
            }
            else
            {
                System.out.println( numAChequear + " No es primo ");
            }

            System.out.println("Desea evaluar otro numero? (s/n)");

            respuesta = teclado.next();
        } while(respuesta.equals("S")  || respuesta.equals("s"));

    }
    /*Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.*/

    public static int suma10NumerosNaturales ()
    {
        int sumatoria = 0;
        for (int i  = 1 ; i <= 10; i++)
        {
            sumatoria += i;
        }
        return sumatoria;
    }

    /*Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.*/

    public static void sumarNumerosPositivos ()
    {
        int sumatoria = 0 ;
        String respuesta =  new String();
        do {
            System.out.println("Ingrese un numero");
            int sumASumar = teclado.nextInt();
            if (sumASumar > 0) {
                sumatoria += sumASumar;
            }
            else
            {
                System.out.println("El numero ingresado no es positivo");
            }
            System.out.println("desea agregar otro numero? (s/n)");
            respuesta = teclado.next();
        }while (respuesta.equals("s") || respuesta.equals("S"));
        System.out.println("la sumatoria de todos los numeros positivos ingresados  es " + sumatoria);
    }

    /* Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.*/

    public static void calcularBisiesto ()
    {
        int anio;
        System.out.println("Ingrese el anio que quiera evaluar");
        anio = teclado.nextInt();
        if(anio % 4 ==0 && anio %100 == 0)
        {
            if( anio %400 == 0)
            {
                System.out.println("El anio es bisiesto.");
            }
            else
            {
                System.out.println("El anio no es bisiesto");
            }
        }
        else if (anio % 4 == 0 )
        {
            System.out.println("el anio es bisiesto");
        }
        else
        {
            System.out.println("el anio no es bisiesto");
        }
    }
    
    /*Ejercicio nº10: Encontrar el valor ASCII de un carácter.
*/
    public static void encontrarValorAscii ()
    {
        String continuar = new String();
        do {
            System.out.println("Ingrese un numero de 0 a 255");
            int valorABuscar = teclado.nextInt();
            if (valorABuscar < 0 || valorABuscar > 255) {
                System.out.println("El valor ingresado no corresponde a un caracter ASCII");
            } else {
                System.out.println("El valor ingresado: "+valorABuscar + " , equivale a "+ (char)valorABuscar );
            }
            System.out.println("Desea ingresar otro valor? (s/n)");
            continuar = teclado.next();
        }while (continuar.equals ("S") || continuar.equals ("s"));
    }

    /*Ejercicio nº11: Multiplicar dos números.*/
     public static void multiplicarNumeros ()
    {
        System.out.println("Ingrese un numero");
        int primerValor = teclado.nextInt();
        System.out.println("ingrese un segundo valor");
        int segundoValor = teclado.nextInt();
        System.out.println("La multiplicacion de "+ primerValor + " y " + segundoValor + "es : "+ (primerValor*segundoValor));
    }
    
    
      /*Ejercicio nº11: Multiplicar dos números.*/
public static void calculoArea ()
    {
        System.out.println("Bienvenido al sistema de calculo de area");
        System.out.println("Ingrese el tipo de figura cuyo area desea calcular");
        int opcion;
        do {
            System.out.println("1)rectangulo");
            System.out.println("2)cuadrado");
            System.out.println("3)triangulo");
            System.out.println("4)circulo");
            opcion = teclado.nextInt();
               switch (opcion) {
                   case 1:
                       System.out.println("Ingrese el valor de la base");
                       int base = teclado.nextInt();
                       System.out.println("Ingrese la altura");
                       int altura = teclado.nextInt();
                       System.out.println("El area del rectangulo de base " + base + " y " + altura + " de altura es " + (base * altura));
                       break;
                   case 2:
                       System.out.println("Ingrese el valor del lado");
                       int lado = teclado.nextInt();
                       System.out.println("El area del cuadrado de lado " + lado + " es " + (Math.pow(lado, 2)));
                       break;
                   case 3:
                       System.out.println("ingrese el valor de la base");
                       int baseTriangulo = teclado.nextInt();
                       System.out.println("Ingrese la altura del triangulo");
                       int alturaTriangulo = teclado.nextInt();
                       System.out.println("El area del triangulo de base " + baseTriangulo + " y de altura " + alturaTriangulo + "es :" + ((float)(baseTriangulo * alturaTriangulo) / 2));
                       break;
                   case 4:
                       System.out.println("Ingrese el radio del circulo");
                       int radio = teclado.nextInt();
                       System.out.println("el area del circulo ingresado de radio " + radio + "es de : " + Math.PI * Math.pow(radio, 2));
                       break;

               }


            }while (opcion >= 1 || opcion <= 4);
    } 
    
    
     /*Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
“Buenos dias nombre_introducido”.*/
    
    public static void buenosDiasNombreIntroducido ()
    {
        String nombre = new String();
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("Buenos dias, " +nombre );

    }
    
    /*Ejercicio nº15: Programa que lea una cantidad de grados centígrados y
  la pase a grados Fahrenheit.
   La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)
*/
    public static void centigradosAFahrenheit()
    {
        System.out.println("Ingrese una cantidad de grados celcius C");
        int celsius = teclado.nextInt();
        System.out.println("Celsius : " +celsius + " C, equivale a "+ (float)(32 +((9 * (float)celsius)/5)));
    }
    
    
   /*Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.
Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2

     */
public static void longitudYArea()
{
    System.out.println("Ingrese el radio de la circunferencia");
    float radio = teclado.nextFloat();
    System.out.println("La longitud es de "+ 2*(Math.PI)*radio+ " y el area es de "+ Math.PI* Math.pow(radio,2));
}
 
 /*Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.


     */

    public static void kilometrosAMillas () {
        float km;
        System.out.println("Ingrese la cantidad de kilometros");
        km = teclado.nextFloat();
        System.out.println( km + "Kms/h equivale a " + (km* 0.277778) + "ms/s");
    }

    /*Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.

     */

    public static void pitagoras ()
    {
        float catetoUno, catetoDos;
        System.out.println("Ingrese el valor del primer cateto");
        catetoUno = teclado.nextFloat();
        System.out.println("Ingrese el valor del segundo cateto");
        catetoDos = teclado.nextFloat();
        System.out.println("El valor de la hipotenusa es de "+ (float)Math.sqrt((Math.pow(catetoUno,2)+Math.pow(catetoDos,2))));
    }
    
 /*Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.
     */

    public static void promedioDeTemperaturas ()
    {
        float [] temperaturas = {12, 43, 54, 65, 23, 23, 54, 23, 34, 23 ,12 ,34 ,3 ,34 ,34 ,12, 34 ,12, 54, 14, 23, 12, 43, 12, 5, 12, 34, 12, 12, 45};
        float sumatoria = 0;
        int length1 = temperaturas.length;
        for (int i = 0 ; i < 30 ; i++)
        {
            sumatoria += temperaturas[i];
        }
        System.out.println("El promedio de las temperaturas del mes es de  " +  (sumatoria/(float)(length1)) );
        
    }
    
    
    
    /*ejercicio 20 . Hacer un programa que de 10 numeros aleatorios entre dos numeros ingresados por teclado.*/
    
      public static void numerosAleatorios()
    {
        int min, max;
        System.out.println("Ingrese un numero :");
        min = teclado.nextInt();
        System.out.println("Ingrese un numero mayor que el anterior");
        max = teclado.nextInt();
        Random rand = new Random();
        if(max > min)
        {
            for (int i = 0 ; i<10; i++)
            {
                int numeroRandom = rand.nextInt((max-min)+1) + min;
                System.out.println(numeroRandom);
            }
        }
    }
    
    
    /*
    Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
     */
    
       public static void diasLaborales()
    {
        String dia = new String();
        System.out.println("Ingrese un dia de la semana");
        dia = teclado.nextLine();
        switch (dia)
        {
            case "lunes", "martes", "miercoles", "jueves", "viernes" :
                System.out.println("Es un dia laboral");
                break;
            case "sabado", "domingo":
                System.out.println("No es un dia laboral");
                break;
            default:
            System.out.println("No valido");
        }
    }

     /*Ejercicio nº22: Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
    Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.
     */

    public static void cantidadCifras()
    {
        int numero;
        System.out.println("Ingrese un numero positivo");
        numero = teclado.nextInt();
        if(numero > 0) {
            System.out.println("El numero ingresado [ " + numero + " ], tiene " + Integer.toString(numero).length() + " digitos");
        }
        else
        {
            System.out.println("no es correcto");
        }
    }
    
   /*Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo.
Los signos aritméticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.

     */

    public static void calculadoraPolacaInversaApp ()
    {
        int operandoUno, operandoDos;
        String signo = new String();
        System.out.println("Ingresa un numero");
        operandoUno = teclado.nextInt();
        System.out.println("Ingresa otro numero");
        operandoDos = teclado.nextInt();
        System.out.println("ingrese el signo ( + / - / * / / )");
        signo = teclado.next();
        switch (signo)
        {
            case "+" :
                System.out.println(" LA SUMA ENTRE [ " + operandoUno+" ] Y [ " +operandoDos+ " ] es [ " + (operandoUno+operandoDos)+ "]");
                break;
            case "-" :
                System.out.println(" LA RESTA ENTRE [ " + operandoUno+" ] Y [ " +operandoDos+ " ] es [" +(operandoUno-operandoDos)+ "]");
                break;
            case "*" :
                System.out.println(" LA MULTIPLICACION ENTRE [ " + operandoUno+" ] Y [ " +operandoDos+ " ] es [" +(operandoUno*operandoDos)+ "]");
                break;
            case "/" :
                System.out.println(" LA RESTA ENTRE [ " + operandoUno+" ] Y [ " +operandoDos+ " ]  es [" +(float)((float)operandoUno/(float)operandoDos) +"]");
                break;
            default:
                System.out.println("incorrecto pelotudito.");
                break;
        }
    }

}








