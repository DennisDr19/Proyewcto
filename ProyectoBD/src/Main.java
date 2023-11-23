import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("------- Menu -------");
            System.out.println("(1) Añadir nuevos datos");
            System.out.println("(2) Mostrar datos ");
            System.out.println("(3) Editar datos");
            System.out.println("(4) Eliminar datos");
            System.out.println("(5) Salir");
            System.out.print("Ingrese un numero de opcion >> ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    MenuOp.crearCoA();
                    break;
                case 2:
                    MenuOp.mostrarCoA();
                    break;
                case 3:

                    MenuOp.editarCoA();
                    break;
                case 4:

                    MenuOp.eliminarCoA();
                    break;
                default:
                    System.out.println("-----------------");
                    System.out.println("Numero de opcion invalida");
            }
        } while (option != 5);
        System.out.println("-----------------");
        System.out.println("Cerrando sesion");
    }
}