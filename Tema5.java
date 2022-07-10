package com.exercises;

public class Tema5 {

    public interface CocheCRUD {

        void save();
        void findAll();
        void delete();
        
    }

    public static class CocheCRUDImpl implements CocheCRUD {

       
        public void save() {
        }

        
        public void findAll() {
        }

      
        public void delete() {
        }

        String save = "Guardar";
        String findAll = "Buscar todo";
        String delete = "Borrar";

        @Override
        public String toString() {
            return "CocheCRUDImpl" +
                    " save=" + save +
                    ", findAll=" + findAll +
                    ", delete=" + delete;
        }
    }

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.println(cocheCrud);

    }

}
