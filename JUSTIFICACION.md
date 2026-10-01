# Justificación de relaciones y contratos

## Diagnóstico

| Pareja | Relación en el dominio | ¿Existencia independiente? | Decisión UML |
|---|---|---|---|
| Estudiante - Préstamo | El préstamo registra quién recibe el ejemplar. | Sí; un estudiante puede no tener préstamos y el registro histórico no crea al estudiante. | Asociación. |
| Libro - Ejemplar | El libro identifica la obra de cada copia física. | Sí, bajo el supuesto documentado de inventario independiente. | Agregación. |
| Préstamo - Renovación | La renovación es un evento del historial de ese préstamo. | No; fuera de ese préstamo no aporta significado. | Composición. |
| Usuario - Estudiante | Estudiante es un usuario de biblioteca con datos académicos propios. | No aplica; es clasificación. | Generalización. |
| Usuario - Bibliotecario | Bibliotecario es un usuario de biblioteca con datos laborales propios. | No aplica; es clasificación. | Generalización. |

## Contrato `Notificable`

Una clase que implementa `Notificable` promete responder a `notificar(String mensaje)`. No define si el aviso se envía por consola, correo, SMS o notificación push; esa decisión pertenece a la implementación. Una interfaz no es una superclase: expresa una capacidad y puede implementarse junto con la herencia de `Usuario`. Se asignó a `Estudiante` porque es el prestatario y la prueba solicitada le comunica una renovación. `Bibliotecario` no lo implementa en este alcance: no existe un requisito que solicite notificarle.

## Evidencia de ejecución esperada

```text
Notificación para Ana Pérez: Su préstamo fue renovado.
Nueva fecha: 2026-10-15
Cantidad de renovaciones: 1
Renovación inválida rechazada: La nueva fecha debe ser posterior a la fecha prevista de devolución vigente.
```

## Conclusión

Al diseñar relaciones y contratos, las clases dejan de ser listas de datos aisladas y pasan a comunicar reglas del dominio. Las asociaciones muestran colaboración sin confundirla con propiedad; la agregación y la composición hacen explícito el ciclo de vida; la herencia solo representa una verdadera clasificación; y una interfaz expresa una capacidad sin fijar su implementación. Así, el diagrama permite verificar multiplicidades, responsabilidades y límites funcionales antes de escribir una aplicación completa.
