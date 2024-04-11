package PackDecorator;

public class Main {
    public static void main(String[] args) {
        // Crear un pedido básico
        Pedido pedido = new PedidoBasico();

        // Agregar opciones adicionales
        pedido = new EnvolturaDeRegalo(pedido);
        pedido = new TarjetaDeFelicitacion(pedido);
        pedido = new EnvioExpress(pedido);

        // Mostrar costo total y descripción del pedido
        System.out.println("Costo total: $" + pedido.costo());
        System.out.println("Descripción: " + pedido.descripcion());
    }
}