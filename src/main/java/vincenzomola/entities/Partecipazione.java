package vincenzomola.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "invitation")
public class Partecipazione {

    @Id
    @GeneratedValue
    @Column(name = "invitation_id")
    private UUID id;

    private Persona persona_id;
}
