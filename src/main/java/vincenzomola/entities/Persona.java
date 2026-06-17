package vincenzomola.entities;

import jakarta.persistence.*;
import vincenzomola.enums.Sesso;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "invitati")
public class Persona {
    @Id
    @GeneratedValue
    @Column(name = "persona_id")
    private UUID persona;
    private String nome;
    private String cognome;
    private LocalDate data_di_nascita;

    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    public Persona() {
    }

    public Persona(String nome, String cognome, LocalDate data_di_nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.data_di_nascita = data_di_nascita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "persona=" + persona +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", data_di_nascita=" + data_di_nascita +
                ", sesso=" + sesso +
                '}';
    }
}
