public class TicketAtencion {
    private final int numero;
    private final String terminal;

    public TicketAtencion(int numero, String terminal) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número de atención debe ser mayor a cero.");
        }
        if (terminal == null || terminal.trim().isEmpty()) {
            throw new IllegalArgumentException("La terminal es obligatoria.");
        }
        this.numero = numero;
        this.terminal = terminal.trim();
    }

    public int getNumero() {
        return numero;
    }

    public String getTerminal() {
        return terminal;
    }

    @Override
    public String toString() {
        return "Número #" + numero + " (Terminal: " + terminal + ")";
    }
}