package comp.finalproject.user.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="sosmed_transaction")
public class SosmedTransaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsosmed_transaction")
    private long idsosmed_transaction;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iduser_fk",unique = false,referencedColumnName = "id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idsosmed_fk", unique = false, referencedColumnName = "idsosmed")
    private Sosmed sosmed;

    public  Sosmed getSosmed(){return  sosmed;}
    public void setSosmed(Sosmed sosmed){this.sosmed=sosmed;}

    public User getUser(){return  user;}
    public void setUser(User user){this.user=user;}

    private double harga;

    public SosmedTransaction() {
    }

    public SosmedTransaction(long idsosmed_transaction, double harga) {
        this.idsosmed_transaction = idsosmed_transaction;
        this.harga = harga;
    }

    public SosmedTransaction(double harga) {
        this.harga = harga;
    }

    public long getIdsosmed_transaction() {
        return idsosmed_transaction;
    }

    public void setIdsosmed_transaction(long idsosmed_transaction) {
        this.idsosmed_transaction = idsosmed_transaction;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
