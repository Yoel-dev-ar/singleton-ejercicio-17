// Main.java
public class Main {
    public static void main(String[] args) {
        TerminalRecepcion t1 = new TerminalRecepcion("Terminal-1");
        TerminalRecepcion t2 = new TerminalRecepcion("Terminal-2");
        TerminalRecepcion t3 = new TerminalRecepcion("Terminal-3");

        TerminalRecepcion[] terminales = { t1, t2, t3 };

        // 24 solicitudes alternadas secuenciales entre las 3 terminales
        for (int i = 0; i < 24; i++) {
            TerminalRecepcion actual = terminales[i % terminales.length];
            TicketAtencion emitido = actual.solicitarTurno();
            System.out.println(emitido);
        }

        // Consultar último número sin incrementar
        int antes = t1.verUltimoEmitido();
        int despues = t2.verUltimoEmitido();
        System.out.println("\nÚltimo número emitido: " + antes + " (sin incrementar tras consulta: " + despues + ")");

        System.out.println("\nHistorial completo (" + GeneradorNumerosAtencion.getInstancia().mostrarHistorial().size() + " turnos):");
        for (TicketAtencion t : GeneradorNumerosAtencion.getInstancia().mostrarHistorial()) {
            System.out.println(" - " + t);
        }
    }
}