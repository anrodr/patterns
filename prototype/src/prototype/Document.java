package prototype;

public class Document implements DocumentoPrototype, Cloneable {
    private String contenido;

    public Document() {
        this.contenido = "Plantilla genérica";
    }

    @Override
    public Document clonar() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void rellenar(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void imprimir() {
        System.out.println(contenido);
    }
}
