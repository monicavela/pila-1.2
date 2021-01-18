/*
 * Monica Jaqueline vela Galvan
*/
package pila;
import java.util.Scanner;
public class Pila {
public static void main(String[] args) {

Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Digita el tamaño de esta pila");

        int tamaño = leer.nextInt();
        int opc;

        IntroPila a = new IntroPila(tamaño);

        do{
            System.out.println("\n Que deseas hacer");
            System.out.println("1. Ingresar dato en desorden");
            System.out.println("2. Mostrar dato");
            System.out.println("3. Eliminar dato");
            System.out.println("4.Saber si esta vacia");
            System.out.println("5.Tamaño de la pila");
            System.out.println("6.Ordenar");
            System.out.println("7.Salir");
            opc = leer.nextInt();

            switch (opc){
                case 1:
                a.llenar();

                    break;

                case 2:
                    a.mostrar();
                    break;

                case 3:
                    a.Eliminar();
                    break;

                case 4:
                    System.out.println(a.vacio());
                    System.out.println("");
                    break;

                case 5:
                    System.out.println(a.Tamaño());
                    break;  


                case 6:
                    a.Ordenar();
                    break;
            }

        }while (opc!= 7);
    }
}
