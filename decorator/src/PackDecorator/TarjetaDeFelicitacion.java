package PackDecorator;

public class TarjetaDeFelicitacion extends Decorador {
    public TarjetaDeFelicitacion(Pedido pedido) {
        super(pedido);
    }

    public double costo() {
        return super.costo() + 1.5; // Costo adicional por tarjeta de felicitación
    }

    public String descripcion() {
        return super.descripcion() + ", Tarjeta de Felicitación";
    }
}
