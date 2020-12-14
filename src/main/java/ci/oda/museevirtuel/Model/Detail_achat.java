package ci.oda.museevirtuel.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Detail_achat {
    private Integer id_detail;
    private Integer nombre_article;
    private Integer prix_article;
    private Integer id_commande;
    private Integer id_article;

    public Detail_achat() {

    }

    public Detail_achat(Integer id_detail, Integer nombre_article, Integer prix_article, Integer id_commande, Integer id_article) {
        this.id_detail = id_detail;
        this.nombre_article = nombre_article;
        this.prix_article = prix_article;
        this.id_commande = id_commande;
        this.id_article = id_article;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer getId_detail() {
        return id_detail;
    }

    public void setId_detail(Integer id_detail) {
        this.id_detail = id_detail;
    }

    public Integer getNombre_article() {
        return nombre_article;
    }

    public void setNombre_article(Integer nombre_article) {
        this.nombre_article = nombre_article;
    }

    public Integer getPrix_article() {
        return prix_article;
    }

    public void setPrix_article(Integer prix_article) {
        this.prix_article = prix_article;
    }

    public Integer getId_commande() {
        return id_commande;
    }

    public void setId_commande(Integer id_commande) {
        this.id_commande = id_commande;
    }

    public Integer getId_article() {
        return id_article;
    }

    public void setId_article(Integer id_article) {
        this.id_article = id_article;
    }

    @Override
    public String toString() {
        return "Detail_achat{" +
                "id_detail=" + id_detail +
                ", nombre_article=" + nombre_article +
                ", prix_article=" + prix_article +
                ", id_commande=" + id_commande +
                ", id_article=" + id_article +
                '}';
    }
}

