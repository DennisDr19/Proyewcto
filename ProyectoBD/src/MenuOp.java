import java.util.Scanner;

public class MenuOp {
    public static void crearCoA(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("------- Menu añadir -------");
            System.out.println("(1) Añadir cliente");
            System.out.println("(2) Añadir auto");
            System.out.println("(3) Atras");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("-----------------");
                    ClienteService.crearCliente();
                    break;
                case 2:
                    System.out.println("-----------------");
                    AutoDAO.crearAuto();
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Volviendo al menu principal");
                    break;
                default:
                    System.out.println("-----------------");
                    System.out.println("Numero de opcion invalida");
            }
        }while(opcion!=3);
    }
    public static void mostrarCoA(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("------- Menu mostrar -------");
            System.out.println("(1) Mostrar cliente");
            System.out.println("(2) mostrar auto");
            System.out.println("(3) Atras");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("-----------------");
                    ClienteService.listarClientes();
                    break;
                case 2:
                    System.out.println("-----------------");
                    AutoDAO.listarAutos();
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Volviendo al menu principal");
                    break;
                default:
                    System.out.println("-----------------");
                    System.out.println("Numero de opcion invalida");
            }
        }while(opcion!=3);

    }
    public static void editarCoA(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("------- Menu editar -------");
            System.out.println("(1) Editar cliente");
            System.out.println("(2) Editar auto");
            System.out.println("(3) Atras");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("-----------------");
                    ClienteService.editarCliente();
                    break;
                case 2:
                    System.out.println("-----------------");
                    AutoDAO.editarAuto();
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Volviendo al menu principal");
                    break;
                default:
                    System.out.println("-----------------");
                    System.out.println("Numero de opcion invalida");
            }
        }while(opcion!=3);

    }
    public static void eliminarCoA(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("------- Menu eliminar -------");
            System.out.println("(1) Eliminar cliente");
            System.out.println("(2) Eliminar auto");
            System.out.println("(3) Atras");
            System.out.println("Ingrese un numero de opcion >>");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("-----------------");
                    ClienteService.borrarClientes();
                    break;
                case 2:
                    System.out.println("-----------------");
                    AutoDAO.borrarAutos();
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Volviendo al menu principal");
                    break;
                default:
                    System.out.println("-----------------");
                    System.out.println("Numero de opcion invalida");
            }
        }while(opcion!=3);

    }
}
