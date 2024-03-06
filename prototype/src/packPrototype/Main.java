package packPrototype;


public class Main {
    public static void main(String[] args) {
        var documentBase = new Document();
        var documentPersonalize = documentBase.clonar();

        documentPersonalize.rellenar("Contenido personalizado para el informe mensual.");

        System.out.println("Document base:");
        documentBase.imprimir();

        System.out.println("\nDocument personalizado:");
        documentPersonalize.imprimir();
    }
}
