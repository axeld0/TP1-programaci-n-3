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

        calcularBisiesto(); /*ejercicio  8*/

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

}








