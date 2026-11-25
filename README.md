Ejercicio 7: Generador Central de Números de Atención (Patrón Singleton)
Temática
Gestión Hospitalaria — Numeración correlativa sin duplicados desde múltiples terminales de recepción.

Consigna
Contexto del problema: La recepción de un hospital dispone de tres terminales que entregan números para trámites administrativos. Cada terminal utiliza un contador independiente, por lo que se generan números repetidos y se producen confusiones en la atención.
Objetivo de aprendizaje: Mantener un contador único mediante Singleton y compartirlo entre diferentes componentes.
Requisitos funcionales:

Generar números de atención consecutivos a partir de uno.

Registrar desde qué terminal se solicitó cada número.

Consultar el último número emitido sin incrementar el contador.

Mostrar el historial de números entregados.
Restricciones técnicas:

El contador debe pertenecer a una única instancia Singleton.

Las terminales no deben poder modificar directamente el contador.

Las tres terminales deben ejecutarse en el mismo proceso y solicitar números de forma secuencial.

Se deben simular al menos veinte solicitudes alternadas sin generar números repetidos.

Explicación lógica
Atributos: En GeneradorNumerosAtencion se declaran ultimoNumero (private int) para llevar el correlativo actual, historial (private final List<TicketAtencion>) para conservar el orden de emisión y instancia (private static GeneradorNumerosAtencion) como referencia única.

Instancia única: El constructor private impide crear generadores separados por terminal, y getInstancia() asegura que las tres terminales (TerminalRecepcion) operen sobre exactamente el mismo contador.

Asignación y Acceso: En Main, tres terminales solicitan 24 turnos de forma alternada en un único proceso; cada llamada incrementa correlativamente desde 1 sin que las terminales puedan alterar el contador directamente, y la consulta del último número no modifica el valor actual.

Estructura del ejercicio
TicketAtencion.java: Representa cada turno emitido con su número correlativo y la terminal solicitante.

GeneradorNumerosAtencion.java: Singleton que administra el contador correlativo, el historial inmutable de lectura y la consulta del último número.

TerminalRecepcion.java: Simula una terminal de recepción que solicita turnos sin acceso directo al contador interno.

Main.java: Ejecuta 24 solicitudes alternadas entre tres terminales y muestra el historial completo.