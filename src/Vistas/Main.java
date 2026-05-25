package Vistas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            //Mostrar menú
            System.out.println("**** MENÚ DE LA APLICACION ****");
            System.out.println("1.  Listar alumnos por orden alfabéticos");
            System.out.println("2. Introducir un nuevo de alumno");
            System.out.println("3. Echar gasolina");
            // Podemos añadir las opciones que queramos
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            //Hacemos  un switch dentro del bucle
            switch (opcion) {
                case 1:
                    System.out.println("Aire acondicionado cambiado");
                    break;
                case 2:
                    System.out.println("Ruedas cambiadas");
                    break;
                case 3:
                    System.out.println("Deposito lleno");
                    break;
                default:
                    System.out.println("Hasta luego, pase un buen día");
            }

        } while (opcion != 0);
    }
}