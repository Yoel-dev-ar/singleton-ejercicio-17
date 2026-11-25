import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneradorNumerosAtencion {
    private static GeneradorNumerosAtencion instancia;

    private int ultimoNumero;
    private final List<TicketAtencion> historial;

    private GeneradorNumerosAtencion() {
        this.ultimoNumero = 0;
        this.historial = new ArrayList<>();
    }

    public static GeneradorNumerosAtencion getInstancia() {
        if (instancia == null) {
            instancia = new GeneradorNumerosAtencion();
        }
        return instancia;
    }

    public TicketAtencion emitirNumero(String terminal) {
        ultimoNumero++;
        TicketAtencion ticket = new TicketAtencion(ultimoNumero, terminal);
        historial.add(ticket);
        return ticket;
    }

    public int consultarUltimoNumero() {
        return ultimoNumero;
    }

    public List<TicketAtencion> mostrarHistorial() {
        return Collections.unmodifiableList(new ArrayList<>(historial));
    }
}