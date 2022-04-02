package Ejemplos;

public class MiSegundaAplicavionJava {

    public static void main(String[] args) {
        //Se hace el llamado cada de los metodos creados
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
        }

    private static void metodoConVoid() {
        System.out.println("Contenido del metodo Void");
    }

    private static void metodoConInt() {
        System.out.println("Contenido de metodo Int");
    }

    private static void metodoConDouble() {
        System.out.println("Cotenido del metodo Double");
    }

    private static void metodoConString() {
        System.out.println("Contenido dle metodo String");
    }
}