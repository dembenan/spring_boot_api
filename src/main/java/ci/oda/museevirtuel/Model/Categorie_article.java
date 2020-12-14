package ci.oda.museevirtuel.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie_article {
    private Integer id_categorie;
    private String nom_categorie;

    @OneToMany(mappedBy = "categorie_article")
    private List<Article> article;

    public Categorie_article() {
    }


    public Categorie_article(Integer id_categorie, String nom_categorie) {

        this.id_categorie = id_categorie;
        this.nom_categorie = nom_categorie;


    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(Integer id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getNom_categorie() {
        return nom_categorie;
    }

    public void setNom_categorie(String nom_categorie) {
        this.nom_categorie = nom_categorie;
    }

    @Override
    public String toString() {
        return "Categorie_article{" +
                "id_categorie=" + id_categorie +
                ", nom_categorie='" + nom_categorie + '\'' +
                '}';
    }
}



