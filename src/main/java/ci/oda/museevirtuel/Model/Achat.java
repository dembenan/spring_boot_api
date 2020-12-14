package ci.oda.museevirtuel.Model;

import javax.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "achat")
public class Achat {
    private Integer id_commande;
    private Date date_commande;
    private String status_commande;


    @OneToOne(mappedBy = "achat",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Transaction transaction;

    public Achat() {
    }

    public Achat(Integer id_commande, Date date_commande, String status_commande) {

        this.id_commande = id_commande;
        this.date_commande = date_commande;
        this.status_commande = status_commande;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * @return Integer return the id_commande
     */
    public Integer getId_commande() {
        return id_commande;
    }

    /**
     * @param id_commande the id_commande to set
     */
    public void setId_commande(Integer id_commande) {
        this.id_commande = id_commande;
    }

    /**
     * @return Date return the date_commande
     */
    public Date getDate_commande() {
        return date_commande;
    }

    /**
     * @param date_commande the date_commande to set
     */
    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
    }

    /**
     * @return String return the status_commande
     */
    public String getStatus_commande() {
        return status_commande;
    }

    /**
     * @param status_commande the status_commande to set
     */
    public void setStatus_commande(String status_commande) {
        this.status_commande = status_commande;
    }

    @Override
    public String toString() {
        return "Achat{" +
                "id_commande=" + id_commande +
                ", date_commande='" + date_commande + '\'' +
                ", status_commande=" + status_commande +
                '}';
    }
}