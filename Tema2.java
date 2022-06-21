package com.exercises;

public class Tema2 {
    public static void main(String[] args) {
        System.out.println("Hola " + nombreCliente("Douglas") );
        mostrarMenu();
        System.out.println("El televisor esta a " + precioTelevisor(1500, 0.21));
        salirMenu();
    }
    static String nombreCliente(String name){
        return name;
    }

    static void mostrarMenu(){
        System.out.println("------------------------------------------------------");
        System.out.println("Bienvenido a la pagina de ventas de televisores de segunda");
        System.out.println("1.- LG");
        System.out.println("2.- Sony");
        System.out.println("3.- Panasonic");
        System.out.println(" ----------------------------------------------------");
    }

    static int precioTelevisor(int precio, double porcentaje){
        precio = 1500;
        porcentaje = 0.21; //IVA de España
        int resultado = (int) (precio * porcentaje);
        System.out.println("Cada televisor esta a " + precio + " y con el IVA " + porcentaje);
        return  resultado;
    }
    static void salirMenu(){
        System.out.println("Que haya tenido una buena visita");
    }
}
