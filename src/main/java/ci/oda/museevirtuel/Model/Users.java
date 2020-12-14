package ci.oda.museevirtuel.Model;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "user")
public class Users {

    private long id_user;
    private String nom_user;
    private String prenom_user;
    private String type_user;
    private String username;
    private String password_user;
    private Float solde;

    @OneToMany(mappedBy = "users")
    private List<Favoris> favoris;

    @OneToMany(mappedBy = "users")
    private List<Transaction> transaction;


    @ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
    @JoinTable(name = "transaction",
            joinColumns = {
                    @JoinColumn(name = "id_user",referencedColumnName = "id",nullable = false,updatable = false)},

            inverseJoinColumns = {
            @JoinColumn(name = "id_pass",referencedColumnName = "id",nullable = false,updatable = false)})

    private List<Passvisite> passvisite ;


    public Users() {
    }

    public Users(Integer id_user, String nom_user, String prenom_user, String type_user, String username, String password_user, Float solde) {

        this.id_user = id_user;
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.type_user = type_user;
        this.username = username;
        this.password_user=password_user;
        this.solde=solde;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    public String getPassword() {
        return password_user;
    }

    public void setPassword(String password_user) {
        this.password_user = password_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Float getSolde() {
        return solde;
    }

    public void setSolde(Float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id_user=" + id_user +
                ", nom_user='" + nom_user + '\'' +
                ", prenom_user='" + prenom_user + '\'' +
                ", type_user='" + type_user + '\'' +
                ", username='" + username + '\'' +
                ", password_user='" + password_user + '\'' +
                ", solde=" + solde +
                '}';
    }
}
