package prototype;

public interface DocumentoPrototype {
     DocumentoPrototype clonar();
     void rellenar(String contenido);
     void imprimir();
}
