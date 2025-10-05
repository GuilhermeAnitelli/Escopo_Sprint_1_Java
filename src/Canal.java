public class Canal {

    private String tipo;
    private String identificador;

    public Canal(String tipo, String identificador) {
        this.tipo = tipo;
        this.identificador = identificador;
    }

    public void imprimirDados() {
        System.out.println("Canal: " + this.tipo);
        if (this.identificador != null && !this.identificador.isEmpty()) {
            System.out.println("Identificador: " + this.identificador);
        }
    }
}