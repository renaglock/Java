package clases;

import java.util.*;

class Carta {

    private final String nombre;
    private final String significado;

    public Carta(String nombre, String significado) {
        this.nombre = nombre;
        this.significado = significado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSignificado() {
        return significado;
    }
}

public class Tarot {

    public static String[] generarRoles(int cantidad) {
        String[] basicos = {
            "Pasado", "Presente", "Futuro",
            "Obstáculo", "Consejo", "Resultado",
            "Extra"
        };

        // Si el usuario pide menos o igual a 7, se usan los básicos
        if (cantidad <= basicos.length) {
            return Arrays.copyOf(basicos, cantidad);
        }

        // Si pide más de 7, las extra se numeran
        String[] roles = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (i < basicos.length) {
                roles[i] = basicos[i];
            } else {
                roles[i] = "Carta " + (i + 1);
            }
        }
        return roles;
    }

    public static void main(String[] args) {
        // Arcanos Mayores
        try (Scanner sc = new Scanner(System.in)) {
            // Arcanos Mayores
            List<Carta> mazo = new ArrayList<>();
            mazo.add(new Carta("El Loco", "Nuevos comienzos, aventuras, confianza."));
            mazo.add(new Carta("El Mago", "Poder personal, creatividad, habilidades."));
            mazo.add(new Carta("La Sacerdotisa", "Sabiduría interior, intuición, misterio."));
            mazo.add(new Carta("La Emperatriz", "Fertilidad, abundancia, naturaleza."));
            mazo.add(new Carta("El Emperador", "Autoridad, estructura, liderazgo."));
            mazo.add(new Carta("El Hierofanta", "Tradición, espiritualidad, enseñanza, normas"));
            mazo.add(new Carta("Los Enamorados", "Elecciones, amor, unión, armonía"));
            mazo.add(new Carta("El Carro", "Voluntad, control, victoria, determinación"));
            mazo.add(new Carta("La Justicia", "Equilibrio, verdad, justicia, responsabilidad"));
            mazo.add(new Carta("El ermitaño", "Búsqueda interior, sabiduria, soledad, reflexión"));
            mazo.add(new Carta("La Rueda de la Fortuna", "Ciclos, destino, cambios, suerte"));
            mazo.add(new Carta("La Fuerza", "Valentía, autocontrol, compasion, resilencia"));
            mazo.add(new Carta("El Colgado", "Pausa, sacrificio, nueva perspectiva, paciencia"));
            mazo.add(new Carta("La Muerte", "Transformación, cierre de ciclos, renacimiento"));
            mazo.add(new Carta("La Templanza", "Armonía, equilibrio, moderación, sanación"));
            mazo.add(new Carta("El Diablo", "Tentaciones, apegos, materialismo, dependencia"));
            mazo.add(new Carta("La Torre", "Crisis, revelación, destruccion de lo falso, cambio brusco"));
            mazo.add(new Carta("La Estrella", "Esperanza, fe, inspiración, calma"));
            mazo.add(new Carta("La Luna", "Ilusiones, confusión, intuición, sueños"));
            mazo.add(new Carta("El Sol", "Éxito, claridad, vitalidad, alegría"));
            mazo.add(new Carta("El Juicio", "Despertar, renovación, decisiones, perdón"));
            mazo.add(new Carta("El Mundo", "Culminación, logro, plenitud, realización"));
            
            // Bastos
            mazo.add(new Carta("As de Bastos", "Nuevos comienzos, inspiración, oportunidades."));
            mazo.add(new Carta("Dos de Bastos", "Planificación, visión de futuro, decisiones."));
            mazo.add(new Carta("Tres de Bastos", "Progreso, expansión, comercio."));
            mazo.add(new Carta("Cuatro de Bastos", "Celebración, estabilidad, logros en comunidad."));
            mazo.add(new Carta("Cinco de Bastos", "Conflictos, competencia, rivalidad."));
            mazo.add(new Carta("Seis de Bastos", "Victoria, reconocimiento, éxito público."));
            mazo.add(new Carta("Siete de Bastos", "Defensa, resistencia, perseverancia."));
            mazo.add(new Carta("Ocho de Bastos", "Velocidad, movimiento, noticias rápidas."));
            mazo.add(new Carta("Nueve de Bastos", "Resiliencia, pruebas, defensa final."));
            mazo.add(new Carta("Diez de Bastos", "Responsabilidad, cargas, esfuerzo excesivo."));
            mazo.add(new Carta("Sota de Bastos", "Entusiasmo, exploración, energía joven."));
            mazo.add(new Carta("Caballero de Bastos", "Pasión, aventura, impulsividad."));
            mazo.add(new Carta("Reina de Bastos", "Confianza, carisma, determinación."));
            mazo.add(new Carta("Rey de Bastos", "Liderazgo, visión, autoridad inspiradora."));
            
            // Copas
            mazo.add(new Carta("As de Copas", "Amor nuevo, creatividad, conexión espiritual."));
            mazo.add(new Carta("Dos de Copas", "Unión, amor, asociación armónica."));
            mazo.add(new Carta("Tres de Copas", "Amistad, celebración, comunidad."));
            mazo.add(new Carta("Cuatro de Copas", "Apatía, meditación, oportunidades ocultas."));
            mazo.add(new Carta("Cinco de Copas", "Pérdida, tristeza, decepción."));
            mazo.add(new Carta("Seis de Copas", "Recuerdos, nostalgia, inocencia."));
            mazo.add(new Carta("Siete de Copas", "Ilusiones, opciones, confusión."));
            mazo.add(new Carta("Ocho de Copas", "Dejar atrás, búsqueda espiritual, desapego."));
            mazo.add(new Carta("Nueve de Copas", "Satisfacción, deseos cumplidos, bienestar."));
            mazo.add(new Carta("Diez de Copas", "Armonía, felicidad familiar, plenitud."));
            mazo.add(new Carta("Sota de Copas", "Creatividad, mensajes, sensibilidad."));
            mazo.add(new Carta("Caballero de Copas", "Romance, idealismo, propuesta."));
            mazo.add(new Carta("Reina de Copas", "Intuición, compasión, cuidado."));
            mazo.add(new Carta("Rey de Copas", "Equilibrio emocional, sabiduría, diplomacia."));
            
            //? Espadas
            mazo.add(new Carta("As de Espadas", "Claridad mental, verdad, ideas nuevas."));
            mazo.add(new Carta("Dos de Espadas", "Decisión difícil, bloqueo, equilibrio."));
            mazo.add(new Carta("Tres de Espadas", "Dolor, traición, separación."));
            mazo.add(new Carta("Cuatro de Espadas", "Descanso, recuperación, reflexión."));
            mazo.add(new Carta("Cinco de Espadas", "Derrota, conflicto, tensiones."));
            mazo.add(new Carta("Seis de Espadas", "Transición, cambio, dejar atrás."));
            mazo.add(new Carta("Siete de Espadas", "Estrategia, engaño, astucia."));
            mazo.add(new Carta("Ocho de Espadas", "Restricciones, miedos, sentirse atrapado."));
            mazo.add(new Carta("Nueve de Espadas", "Ansiedad, pesadillas, culpa."));
            mazo.add(new Carta("Diez de Espadas", "Final doloroso, traición, colapso."));
            mazo.add(new Carta("Sota de Espadas", "Curiosidad, vigilancia, mensajes."));
            mazo.add(new Carta("Caballero de Espadas", "Impulso, acción rápida, desafío."));
            mazo.add(new Carta("Reina de Espadas", "Claridad, verdad, independencia."));
            mazo.add(new Carta("Rey de Espadas", "Autoridad, lógica, justicia."));
            
            // Oros
            mazo.add(new Carta("As de Oros", "Nuevas oportunidades, prosperidad, inicio material."));
            mazo.add(new Carta("Dos de Oros", "Equilibrio, adaptación, multitarea."));
            mazo.add(new Carta("Tres de Oros", "Trabajo en equipo, aprendizaje, construcción."));
            mazo.add(new Carta("Cuatro de Oros", "Seguridad, control, avaricia."));
            mazo.add(new Carta("Cinco de Oros", "Pérdida, carencia, dificultades económicas."));
            mazo.add(new Carta("Seis de Oros", "Generosidad, ayuda, equilibrio material."));
            mazo.add(new Carta("Siete de Oros", "Paciencia, evaluación, progreso lento."));
            mazo.add(new Carta("Ocho de Oros", "Práctica, habilidad, dedicación al trabajo."));
            mazo.add(new Carta("Nueve de Oros", "Independencia, éxito material, logro personal."));
            mazo.add(new Carta("Diez de Oros", "Riqueza, legado, estabilidad familiar."));
            mazo.add(new Carta("Sota de Oros", "Nuevas ideas, estudio, oportunidades."));
            mazo.add(new Carta("Caballero de Oros", "Esfuerzo, responsabilidad, constancia."));
            mazo.add(new Carta("Reina de Oros", "Prosperidad, cuidado, seguridad material."));
            mazo.add(new Carta("Rey de Oros", "Éxito financiero, estabilidad, abundancia."));
            
            boolean continuar = true;
            
            while (continuar) {
                // Barajar el mazo en cada tirada
                Collections.shuffle(mazo);
                
                System.out.println("\n Bienvenido a la lectura de Tarot ");
                System.out.print("¿Cuántas cartas deseas sacar? ");
                int cantidad = sc.nextInt();
                
                String[] roles = generarRoles(cantidad);
                
                System.out.println("\n Tu lectura:\n");
                for (int i = 0; i < cantidad && i < mazo.size(); i++) {
                    Carta carta = mazo.get(i);
                    System.out.println(roles[i] + ": " + carta.getNombre() + " --> " + carta.getSignificado());
                }
                
                // Preguntar si quiere otra tirada
                System.out.print("\n¿Quieres otra tirada? (s/n): ");
                String respuesta = sc.next().toLowerCase();
                
                if (!respuesta.equals("s")) {
                    continuar = false;
                    System.out.println("\n Gracias por consultar el Tarot. ¡Hasta pronto!");
                }
            }
        }
    }
}

