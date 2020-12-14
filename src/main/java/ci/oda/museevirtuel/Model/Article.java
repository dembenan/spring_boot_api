package ci.oda.museevirtuel.Model;

import javax.persistence.*;

@Entity
public class Article {
    private Integer id_article;
    private String nom_article;
    private Integer prix_article;
    private Integer nb_article;
    private String description_article;
    private Integer id_categorie;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private Article article;


    public Article() {
    }
    public Article(Integer id_article, String nom_article,Integer prix_article,Integer nb_article,String description_article,Integer id_categorie) {

        this.id_article = id_article;
        this.nom_article = nom_article;
        this.prix_article=prix_article;
        this.nb_article=nb_article;
        this.description_article=description_article;
        this.id_categorie=id_categorie;


    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_article() {
        return id_article;
    }

    public void setId_article(Integer id_article) {
        this.id_article = id_article;
    }

    public String getNom_article() {
        return nom_article;
    }

    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    public Integer getPrix_article() {
        return prix_article;
    }

    public void setPrix_article(Integer prix_article) {
        this.prix_article = prix_article;
    }

    public Integer getNb_article() {
        return nb_article;
    }

    public void setNb_article(Integer nb_article) {
        this.nb_article = nb_article;
    }

    public String getDescription_article() {
        return description_article;
    }

    public void setDescription_article(String description_article) {
        this.description_article = description_article;
    }

    public Integer getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(Integer id_categorie) {
        this.id_categorie = id_categorie;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id_article=" + id_article +
                ", nom_article='" + nom_article + '\'' +
                ", prix_article=" + prix_article +
                ", nb_article=" + nb_article +
                ", description_article='" + description_article + '\'' +
                ", id_categorie=" + id_categorie +
                '}';
    }
}

