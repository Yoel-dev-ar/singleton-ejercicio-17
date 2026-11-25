public class TerminalRecepcion {
    private final String nombreTerminal;
    private final GeneradorNumerosAtencion generador;

    public TerminalRecepcion(String nombreTerminal) {
        this.nombreTerminal = nombreTerminal;
        this.generador = GeneradorNumerosAtencion.getInstancia();
    }

    public TicketAtencion solicitarTurno() {
        return generador.emitirNumero(nombreTerminal);
    }

    public int verUltimoEmitido() {
        return generador.consultarUltimoNumero();
    }
}