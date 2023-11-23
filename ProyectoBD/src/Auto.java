public class Auto {
    int id,id_cliente,id_aceite,id_rueda,id_motor;
    String marca;

    public Auto() {
    }

    public Auto(int id,int id_cliente,String marca,int id_aceite,int id_rueda,int id_motor) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_aceite = id_aceite;
        this.id_rueda = id_rueda;
        this.id_motor = id_motor;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_aceite() {
        return id_aceite;
    }

    public void setId_aceite(int id_aceite) {
        this.id_aceite = id_aceite;
    }

    public int getId_rueda() {
        return id_rueda;
    }

    public void setId_rueda(int id_rueda) {
        this.id_rueda = id_rueda;
    }

    public int getId_motor() {
        return id_motor;
    }

    public void setId_motor(int id_motor) {
        this.id_motor = id_motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
