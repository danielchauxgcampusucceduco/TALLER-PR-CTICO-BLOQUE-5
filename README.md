# SmartLibrary - Bloque 5

## Decisiones del diagrama de clases

| Relación | UML | Multiplicidad | Justificación |
|---|---|---|---|
| Estudiante - Prestamo | Asociación `realiza` | Estudiante `1`; Prestamo `0..*` | Un préstamo registra al estudiante, pero ambos tienen vida conceptual independiente. |
| Prestamo - Ejemplar | Asociación `corresponde a` | Prestamo `0..*`; Ejemplar `1` | El ejemplar existe antes, durante y después del préstamo; el préstamo solo lo referencia. |
| Libro - Ejemplar | Agregación `posee` | Libro `1`; Ejemplar `0..*` | Se asume que el ejemplar físico mantiene inventario propio y puede reasignarse o corregirse ante cambios de catálogo. Por eso no se usa composición. Cada ejemplar vigente corresponde a un solo libro. |
| Prestamo - Renovacion | Composición `registra` | Prestamo `1`; Renovacion `0..*` | Una renovación es parte exclusiva del historial del préstamo y pierde significado cuando el préstamo deja de existir. |

## Herencia e interfaz

`Estudiante` y `Bibliotecario` son tipos de `Usuario` porque SmartLibrary los trata como usuarios identificables y consultables bajo la misma abstracción; los atributos repetidos por sí solos no justificarían esa decisión. Solo `Estudiante` realiza `Notificable`: el requisito indica que algunos usuarios reciben avisos y el caso de uso notifica al prestatario. La interfaz promete `notificar(String)`, pero no impone el canal de envío.

## Vista funcional de componentes

- Gestión de Usuarios: `Usuario`, `Estudiante`, `Bibliotecario`, `Notificable`.
- Gestión de Catálogo: `Libro`, `Ejemplar`.
- Gestión de Préstamos: `Prestamo`, `Renovacion`; consulta Usuarios y Catálogo para validar al prestatario y el ejemplar.
- Gestión de Reservas: `Reserva`; consulta Usuarios y Catálogo para identificar al solicitante y verificar el libro solicitado.

## Conclusión

Al diseñar relaciones y contratos, las clases dejan de ser listas de datos aisladas y pasan a comunicar reglas del dominio. Las asociaciones muestran colaboración sin confundirla con propiedad; la agregación y la composición hacen explícito el ciclo de vida; la herencia solo representa una verdadera clasificación; y una interfaz expresa una capacidad sin fijar su implementación. Así, el diagrama permite verificar multiplicidades, responsabilidades y límites funcionales antes de escribir una aplicación completa.
