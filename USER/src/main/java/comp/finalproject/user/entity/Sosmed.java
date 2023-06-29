package comp.finalproject.user.entity;

import javax.persistence.*;

@Entity
@Table(name="sosmed")
public class Sosmed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idsosmed;

    private String channel;
    private String kategori;
    private double budget_sosmed;

    public Sosmed() {
    }

    public Sosmed(long idsosmed, String channel, String kategori, double budget_sosmed) {
        this.idsosmed = idsosmed;
        this.channel = channel;
        this.kategori = kategori;
        this.budget_sosmed = budget_sosmed;
    }

    public Sosmed(String channel, String kategori, double budget_sosmed) {
        this.channel = channel;
        this.kategori = kategori;
        this.budget_sosmed = budget_sosmed;
    }

    public long getIdsosmed() {
        return idsosmed;
    }

    public void setIdsosmed(long idsosmed) {
        this.idsosmed = idsosmed;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getBudget_sosmed() {
        return budget_sosmed;
    }

    public void setBudget_sosmed(double budget_sosmed) {
        this.budget_sosmed = budget_sosmed;
    }
}
