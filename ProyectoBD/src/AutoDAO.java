import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AutoDAO {
    public static void crearAutoDB(Auto auto) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `taller`.`auto`(`id_cliente`,`marca`,`tipo_aceite`,`tipo_ruedas`,`tipo_motor`) VALUES(?, ?, ?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setInt(1,auto.getId_cliente());
                ps.setString(2,auto.getMarca());
                ps.setInt(3,auto.getId_aceite());
                ps.setInt(4,auto.getId_rueda());
                ps.setInt(5,auto.getId_motor());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void leerAuto() {
        Conexion db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_conexion.get_conConnection()){
            String query = "SELECT * FROM auto";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Cliente ID: "+rs.getInt("id_cliente"));
                System.out.println("Marca: "+rs.getString("marca"));
                System.out.println("Aceite ID: "+rs.getInt("tipo_aceite"));
                System.out.println("Ruedas ID: "+rs.getInt("tipo_ruedas"));
                System.out.println("Motor ID: "+rs.getInt("tipo_motor"));
                System.out.println("- - - - - - - - - ");
            }
        }catch (SQLException q){
            System.out.println(q);
        }
    }
    public static void borrarAuto(int id) {
        Conexion db_conexion = new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM auto WHERE id = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("Datos del auto borrados exitosamente");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo borrar datos del auto");
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void actualizarAuto(Auto auto) {
        Conexion db_conexion = new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()){
            PreparedStatement ps;
            try {
                String query = "UPDATE auto SET id_cliente=?, marca=?, tipo_aceite=?, tipo_ruedas=?, tipo_motor=? WHERE id=?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1,auto.getId_cliente());
                ps.setString(2,auto.getMarca());
                ps.setInt(3,auto.getId_aceite());
                ps.setInt(4,auto.getId_rueda());
                ps.setInt(5,auto.getId_motor());
                ps.setInt(6,auto.getId_cliente());
                ps.executeUpdate();
                System.out.println("Datos del cliente actualizados correctamente");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void crearAuto(){
        Scanner scint = new Scanner(System.in);
        Scanner scline = new Scanner(System.in);
        System.out.println("Añadiendo nuevo auto >>>");
        System.out.print("Ingrese el cliente ID: "); int id_cliente = scint.nextInt();
        System.out.print("Ingrese la marca del auto: "); String marca = scline.nextLine();
        System.out.print("Ingrese el aceite ID: "); int tipo_aceite = scint.nextInt();
        System.out.print("Ingrese el ruedas ID: "); int tipo_ruedas = scint.nextInt();
        System.out.print("Ingrese el motor ID: "); int tipo_motor = scint.nextInt();
        Auto auto = new Auto();
        auto.setId_cliente(id_cliente);
        auto.setMarca(marca);
        auto.setId_aceite(tipo_aceite);
        auto.setId_rueda(tipo_ruedas);
        auto.setId_motor(tipo_motor);
        crearAutoDB(auto);
    }
    public static void listarAutos(){
        leerAuto();
    }
    public static void borrarAutos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese ID del auto para borrar sus datos: ");
        int id_auto = sc.nextInt();
        borrarAuto(id_auto);
    }
    public static void editarAuto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Editando datos del auto >>>");
        System.out.print("Ingrese nuevo 'Cliente ID': "); int id_cliente = sc.nextInt();
        System.out.print("Ingrese nueva 'Marca': "); String marca = sc.nextLine();
        System.out.print("Ingrese nuevo 'Aceite´ ID': "); int tipo_aceite = sc.nextInt();
        System.out.print("Ingrese nuevo 'Ruedas´ ID': "); int tipo_ruedas = sc.nextInt();
        System.out.print("Ingrese nuevo 'Motor´ ID': "); int tipo_motor = sc.nextInt();
        System.out.println("Ingrese el ID del auto a modificar: "); int id_auto = sc.nextInt();
        Auto cauto = new Auto();
        cauto.setId_cliente(id_cliente);
        cauto.setMarca(marca);
        cauto.setId_aceite(tipo_aceite);
        cauto.setId_rueda(tipo_ruedas);
        cauto.setId_motor(tipo_motor);
        cauto.setId(id_auto);
        actualizarAuto(cauto);
    }
}
