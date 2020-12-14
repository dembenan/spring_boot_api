package ci.oda.museevirtuel.Model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Passvisite {
    private Integer id_pass;
    private String nom_pass;
    private Integer duree_pass;
    private Integer id_visite;

    @ManyToMany(mappedBy = "passvisite",fetch = FetchType.LAZY)
    private List<Users> users ;


    @ManyToOne
    @JoinColumn(name = "id_visite")
    private Passvisite passvisite;


    public Passvisite() {
    }

    public Passvisite(Integer id_pass, String nom_pass, Integer duree_pass, Integer id_visite) {

        this.id_pass = id_pass;
        this.nom_pass = nom_pass;
        this.duree_pass = duree_pass;
        this.id_visite = id_visite;

    }
    

    /**
     * @return Integer return the id_pass
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_pass() {
        return id_pass;
    }

    /**
     * @param id_pass the id_pass to set
     */
    public void setId_pass(Integer id_pass) {
        this.id_pass = id_pass;
    }

    /**
     * @return String return the nom_pass
     */
    public String getNom_pass() {
        return nom_pass;
    }

    /**
     * @param nom_pass the nom_pass to set
     */
    public void setNom_pass(String nom_pass) {
        this.nom_pass = nom_pass;
    }

    /**
     * @return Integer return the duree_pass
     */
    public Integer getDuree_pass() {
        return duree_pass;
    }

    /**
     * @param duree_pass the duree_pass to set
     */
    public void setDuree_pass(Integer duree_pass) {
        this.duree_pass = duree_pass;
    }

    /**
     * @return Integer return the id_visite
     */
    public Integer getId_visite() {
        return id_visite;
    }

    /**
     * @param id_visite the id_visite to set
     */
    public void setId_visite(Integer id_visite) {
        this.id_visite = id_visite;
    }

    @Override
    public String toString() {
        return "Passvisite{" +
                "id_pass=" + id_pass +
                ", nom_pass='" + nom_pass + '\'' +
                ", duree_pass='" + duree_pass + '\'' +
                ", id_visite=" + id_visite +
                '}';
    }
}