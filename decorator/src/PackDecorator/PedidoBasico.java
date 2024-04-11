package PackDecorator;

public class PedidoBasico implements Pedido {
    public double costo() {
        return 10.0; // Precio base
    }

    public String descripcion() {
        return "Pedido Básico";
    }
}