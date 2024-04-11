package PackDecorator;

public abstract class Decorador implements Pedido {
    protected Pedido pedido;

    public Decorador(Pedido pedido) {
        this.pedido = pedido;
    }

    public double costo() {
        return pedido.costo();
    }

    public String descripcion() {
        return pedido.descripcion();
    }
}