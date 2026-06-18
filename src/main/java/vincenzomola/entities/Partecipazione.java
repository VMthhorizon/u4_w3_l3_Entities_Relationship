package vincenzomola.entities;

import jakarta.persistence.*;
import vincenzomola.enums.Stato;

import java.util.UUID;

@Entity
@Table(name = "invitation")
public class Partecipazione {

    @Id
    @GeneratedValue
    @Column(name = "invitation_id")
    private UUID id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Persona persona_id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Evento event_id;
    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Partecipazione() {
    }

    public Partecipazione(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona_id=" + persona_id +
                ", event_id=" + event_id +
                ", stato=" + stato +
                '}';
    }
}
