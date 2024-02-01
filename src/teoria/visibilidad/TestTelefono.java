package teoria.visibilidad;

public class TestTelefono {
    public static void main(String[] args) {
        Telefono telefono = new Telefono("123456789"); //constructor public
        telefono.setNumeroTelefono("987654321"); //setter package
        System.out.println(telefono.getNumeroTelefono()); //getter protected
        //telefono.numeroTelefono;  atributo private
        telefono.darInformacion();

    }
}
