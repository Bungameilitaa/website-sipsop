package comp.finalproject.user.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="radio_transaction")
public class RadioTransaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idradio_transaction")
    private long idradio_transaction;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iduser_fk",unique = false,referencedColumnName = "id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idradio_fk", unique = false, referencedColumnName = "idradio")
    private Radio radio;

    public Radio getRadio(){return  radio;}
    public void setRadio(Radio radio){this.radio=radio;}

    public User getUser(){return  user;}
    public void setUser(User user){this.user=user;}

    private double harga;

    public RadioTransaction() {
    }

    public RadioTransaction(long idradio_transaction, double harga) {
        this.idradio_transaction = idradio_transaction;
        this.harga = harga;
    }

    public RadioTransaction(double harga) {
        this.harga = harga;
    }

    public long getIdradio_transaction() {
        return idradio_transaction;
    }

    public void setIdradio_transaction(long idradio_transaction) {
        this.idradio_transaction = idradio_transaction;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
