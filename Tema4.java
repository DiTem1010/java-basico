package com.exercises.Tema4;

public class SmartDevice {
    String marca;
    String modelo;
    String colorMovil;

    public SmartDevice(){

    }
    public SmartDevice(String marca, String modelo, String colorMovil){
        this.marca = marca;
        this.modelo = modelo;
        this.colorMovil = colorMovil;
    }
    public static class SmartPhone extends SmartDevice{
        int memoriaRam;
        String sistemaOperativo;
        public SmartPhone(){
            super();
        }
        public SmartPhone(String marca, String modelo, String colorMovil, int memoriaRam, String sistemaOperativo){
            super(marca, modelo, colorMovil);
            this.memoriaRam = memoriaRam;
            this.sistemaOperativo = sistemaOperativo;
        }
        @Override
        public String toString() {
            return "marca=" + marca +
                    ", modelo=" + modelo +
                    ", colorMovil=" + colorMovil +
                    ", memoriaRam=" + memoriaRam +
                    ", sistemaOperativo=" + sistemaOperativo;
        }
        public static class SmartWatch extends SmartDevice {
            double pulgadas;
            String conectividad;

            public SmartWatch() {
                super();
            }

            public SmartWatch(String marca, String modelo, String colorReloj, double pulgadas, String conectividad) {
                super(marca, modelo, colorReloj);
                this.pulgadas = pulgadas;
                this.conectividad = conectividad;
            }
            @Override
            public String toString() {
                return "marca=" + marca +
                        ", modelo=" + modelo +
                        ", colorMovil=" + colorMovil +
                        ", pulgadas=" + pulgadas +
                        ", conectividad=" + conectividad;
            }
        }
        public static void main(String[] args){
            SmartPhone smartPhone = new SmartPhone("Huawei","A6", "Rojo", 8, "Android");
            SmartWatch smartWatch = new SmartWatch("Apple", "Watch", "Amarillo", 3.4, "Bluetooth");
            System.out.println("El smartphone de mi hermano para uso general es : " + smartPhone);
            System.out.println("El smartwatch de mi hermana para hacer ejercicio es : " + smartWatch);
        }
    }
    }
