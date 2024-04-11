package PackDecorator;

public class EnvioExpress extends Decorador {
    public EnvioExpress(Pedido pedido) {
        super(pedido);
    }

    public double costo() {
        return super.costo() + 5.0; // Costo adicional por envío exprés
    }

    public String descripcion() {
        return super.descripcion() + ", Envío Exprés";
    }
}
