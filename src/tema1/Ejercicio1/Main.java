package tema1.Ejercicio1;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args){
        // vamos a declarar los tipos de datos y variables.
        // cadena de texto

        String nombre1 = "Alejandro";
        String apellido1 = "Maquino";

        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero7 = 23;
        int numero8 = 67;
        int numero9 = 101;
        int numero10 = 300;
        int numero11 = 478;

        long numero5 = 5000;
        double numero6 = 5.66; // podría usar float, pero double tiene más capacidad de datos

        int resultado_suma = numero1 + numero2 + numero3;
        double multiplicacion = numero5 * numero6;
        double division =  numero4 / numero6;

        // vamos a imprimir por pantalla los datos de tipo String
        System.out.println("El nombre del alumno es: " + nombre1);
        System.out.println("El apellido del alumno es: " + apellido1);
        // vamos a imprimir por pantalla los datos de tipo int
        System.out.println("Ahora va a realizar operaciones con datos 'int'");
        System.out.println("El resultado de la suma es: " + resultado_suma);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);

        // ahora tocan los booleanos
        if (numero6 < numero3 && numero6 > numero1){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }
  }
}
