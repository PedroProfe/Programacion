package colecciones;

public class Carta {
	public enum Palo {
        TREBOL, DIAMANTE, CORAZON, PICA
    };

    private int numero;
    private Palo palo;

    Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public void imprimir() {
        System.out.println(numero + " - " + palo.toString().toLowerCase());
    }

    public Palo retornarPalo() {
        return palo;
    }
}
