package prototype;

public interface DocumentPrototype {
     DocumentPrototype clonar();
     void rellenar(String contenido);
     void imprimir();
}
