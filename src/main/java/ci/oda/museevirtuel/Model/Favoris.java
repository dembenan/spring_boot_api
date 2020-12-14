package ci.oda.museevirtuel.Model;

import javax.persistence.*;

@Entity
public class Favoris {
    private Integer id_fav;
    private String ref_obj;
    private Integer id_user;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users users;

    public Favoris() {
    }

    public Favoris(Integer id_fav, String ref_obj, Integer id_user) {

        this.id_fav = id_fav;
        this.ref_obj = ref_obj;
        this.id_user = id_user;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_fav() {
        return id_fav;
    }

    public void setId_fav(Integer id_fav) {
        this.id_fav = id_fav;
    }

    public String getRef_obj() {
        return ref_obj;
    }

    public void setRef_obj(String ref_obj) {
        this.ref_obj = ref_obj;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Favoris{" +
                "id_fav=" + id_fav +
                ", ref_obj='" + ref_obj + '\'' +
                ", id_user=" + id_user +
                '}';
    }
}


