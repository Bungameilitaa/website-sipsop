package comp.finalproject.user.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tv_transaction")
public class TvTransaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtv_transaction")
    private long idtv_transaction;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iduser_fk",unique = false,referencedColumnName = "id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtv_fk", unique = false, referencedColumnName = "idtv")
    private Tv tv;

    public Tv getTv(){return tv;}
    public void setTv(Tv tv){this.tv=tv;}

    public User getUser(){return  user;}
    public void setUser(User user){this.user=user;}

    private double harga;

    public TvTransaction() {
    }

    public TvTransaction(long idtv_transaction, double harga) {
        this.idtv_transaction = idtv_transaction;
        this.harga = harga;
    }

    public TvTransaction(double harga) {
        this.harga = harga;
    }

    public long getIdtv_transaction() {
        return idtv_transaction;
    }

    public void setIdtv_transaction(long idtv_transaction) {
        this.idtv_transaction = idtv_transaction;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
