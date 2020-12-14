package ci.oda.museevirtuel.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Transaction {    
    private Integer id_trans;
    private String montant_trans;
    private String type_trans;
    private Date date_trans;
    private String description_trans;
    private Integer id_user;
    private Integer id_commande;
    private Integer id_pass;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users users;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_commande")
    private Achat achat;


    public Transaction() {
    }

    public Transaction(Integer id_trans, String montant_trans, String type_trans, Date date_trans, String description_trans,Integer id_user,Integer id_commande,Integer id_pass) {

        this.id_trans = id_trans;
        this.montant_trans = montant_trans;
        this.type_trans = type_trans;
        this.date_trans=date_trans;
        this.description_trans=description_trans;
        this.id_user=id_user;
        this.id_commande=id_commande;
        this.id_pass=id_pass;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_trans() {
        return id_trans;
    }

    public void setId_trans(Integer id_trans) {
        this.id_trans = id_trans;
    }

    public String getMontant_trans() {
        return montant_trans;
    }

    public void setMontant_trans(String montant_trans) {
        this.montant_trans = montant_trans;
    }

    public String getType_trans() {
        return type_trans;
    }

    public void setType_trans(String type_trans) {
        this.type_trans = type_trans;
    }

    public Date getDate_trans() {
        return date_trans;
    }

    public void setDate_trans(Date date_trans) {
        this.date_trans = date_trans;
    }

    public String getDescription_trans() {
        return description_trans;
    }

    public void setDescription_trans(String description_trans) {
        this.description_trans = description_trans;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_commande() {
        return id_commande;
    }

    public void setId_commande(Integer id_commande) {
        this.id_commande = id_commande;
    }

    public Integer getId_pass() {
        return id_pass;
    }

    public void setId_pass(Integer id_pass) {
        this.id_pass = id_pass;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id_trans=" + id_trans +
                ", montant_trans='" + montant_trans + '\'' +
                ", type_trans='" + type_trans + '\'' +
                ", date_trans=" + date_trans +
                ", description_trans='" + description_trans + '\'' +
                ", id_user=" + id_user +
                ", id_commande=" + id_commande +
                ", id_pass=" + id_pass +
                '}';
    }
}
