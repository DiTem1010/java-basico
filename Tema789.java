package com.exercises;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;

public class Tema789 {

   // 0.

    public static class CadenaReves {

        public static void main(String[] args) {

            System.out.println("1. - Cadena al reves");

            Scanner scanner = new Scanner(System.in);
            String texto;
            System.out.println("Introduce un texto");
            texto = scanner.nextLine();

            StringBuilder alReves = new StringBuilder(texto);
            texto = alReves.reverse().toString();

            System.out.println(texto);
        }
    }

    //1.
    
    public static class ArrayUnidimensional {

        public static void main(String[] args) {

            System.out.println("2. Array Unidimensional");

            String textos[] = {" Buenos dias ", "Buenas tardes ", "Buenas noches"};

            for (String texto : textos) {
                System.out.print(texto);
            }
        }
    }

      // 2.

    public static class ArrayBidimensional {

        public static void main(String[] args) {

            System.out.println("3. Array Bidimensional");

            Integer[][] numeros = {
                    {2, 4, 8},
                    {3, 6, 9}
            };

            for (int i = 0; i < numeros.length; i++) {

                for (int y = 0; y < numeros[i].length; y++) {

                    System.out.println("Fila: " + (i + 1) + " | Columna: " + (y + 1) +
                            "\nEl valor es: " + numeros[i][y] + "\n");
                }
            }
        }
    }

       // 3.

    public static class EjercicioVector {

        public static void main(String[] args) {

            System.out.println("4. Vector");

            Vector vector = new Vector();

            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);

            System.out.println("Vector antes de borrar: " + vector);

            vector.remove(2);
            vector.remove(1);

            System.out.println("Vector despues de borrar: " + vector + " (Eliminados el 2 y 3)");

        // 4.

            System.out.println(" La respuesta es");

            System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa" +
                    " el limite establecido (Por defecto, 10) la dimension del vector se duplica.");
        }
    }

        // 5.

    public static class ArrayString {

        public static void main(String[] args) {

            System.out.println("5. Array y LinkedList");

            ArrayList<String> lista = new ArrayList<String>();
            lista.add("Luis");
            lista.add("Adriana");
            lista.add("Pedro");
            lista.add("Angelica");

            LinkedList<String> linkedList = new LinkedList<String>();

            for (int i = 0; i < lista.size(); i++) {
                linkedList.add(i, lista.get(i));
            }

            System.out.println("Elementos del Array:");
            for (String elementos : lista) {
                System.out.print(elementos + " ");
            }

            System.out.println("\n\nElementos de la LinkedList:");
            for (String elementos : linkedList) {
                System.out.print(elementos + " ");
            }
        }
    }

           // 6.

    public static class ArrayInt {

        public static void main(String[] args) {

            System.out.println("6. ArrayInt ");

            ArrayList<Integer> lista = new ArrayList<Integer>();

            for (int i = 1; i < 11; i++) {
                lista.add(i);

                for (int num = 0; num < lista.size(); num++) {

                    if (lista.get(num) % 2 == 0) {
                        lista.remove(num);
                    }
                }
            }

            System.out.println(lista);
        }
    }

           // 7.

    public static class DividePorCero {

        private static int Dividir(int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static void main(String[] args) {

            System.out.println("5. DividePorCero ");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Indica los numeros que quieres dividir: ");
            System.out.print("Numero 1: ");
            int a = scanner.nextInt();
            System.out.print("Numero 2: ");
            int b = scanner.nextInt();
            try {
                System.out.println("Resultado: " + Dividir(a, b));
            } catch (ArithmeticException e) {
                System.out.println("No se puede realizar, es incorrecto");
            } finally {
                System.out.println("Demo de código");
            }
        }

         // 8.

        public static class CopiarFicheros {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce el fichero de origen: ");
                String fileIn = scanner.nextLine();
                System.out.println("Introduce el fichero de destino: ");
                String fileOut = scanner.nextLine();
                copiar(fileIn, fileOut);
            }

         //9.
        private static void copiar(String fileIn, String fileOut) {
                try {
                    InputStream in = new FileInputStream(fileIn);
                    byte[] datos = in.readAllBytes();
                    in.close();

                    PrintStream out = new PrintStream(fileOut);
                    out.write(datos);
                    out.close();
                } catch (Exception e) {
                    System.out.println("Excepcion: " + e.getMessage());
                }
            }

        }

    }

}
