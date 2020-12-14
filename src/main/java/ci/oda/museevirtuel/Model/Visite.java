package ci.oda.museevirtuel.Model;
import javax.persistence.*;
import java.util.List;


@Entity
public class Visite {
    private Integer id_visite;
    private String nom_visite;
    private Integer prix_visite;

    @OneToMany(mappedBy = "visite")
    private List<Passvisite> passvisite;
    public Visite() {
    }


    public Visite(final Integer id_visite, final String nom_visite, final Integer prix_visite) {

        this.id_visite = id_visite;
        this.nom_visite = nom_visite;
        this.prix_visite = prix_visite;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * @return Integer return the id_visite
     */
    public Integer getId_visite() {
        return id_visite;
    }

    /**
     * @param id_visite the id_visite to set
     */
    public void setId_visite(final Integer id_visite) {
        this.id_visite = id_visite;
    }

    /**
     * @return String return the nom_visite
     */
    public String getNom_visite() {
        return nom_visite;
    }

    /**
     * @param nom_visite the nom_visite to set
     */
    public void setNom_visite(final String nom_visite) {
        this.nom_visite = nom_visite;
    }

    /**
     * @return Integer return the prix_visite
     */
    public Integer getPrix_visite() {
        return prix_visite;
    }

    /**
     * @param prix_visite the prix_visite to set
     */
    public void setPrix_visite(final Integer prix_visite) {
        this.prix_visite = prix_visite;
    }

    @Override
    public String toString() {
        return "Visite{" +
                "id_visite=" + id_visite +
                ", nom_visite='" + nom_visite + '\'' +
                ", prix_visite=" + prix_visite +
                '}';
    }
}