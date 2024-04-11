package PackDecorator;

public class EnvolturaDeRegalo extends Decorador {
    public EnvolturaDeRegalo(Pedido pedido) {
        super(pedido);
    }

    public double costo() {
        return super.costo() + 2.0; // Costo adicional por envoltura de regalo
    }

    public String descripcion() {
        return super.descripcion() + ", Envoltura de Regalo";
    }
}
