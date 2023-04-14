package pi.enset.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Classe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private int nbrEleves;
    @ManyToOne
    private Filiere filiere;
    @OneToMany(mappedBy = "classe")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Seance> seances;

}
