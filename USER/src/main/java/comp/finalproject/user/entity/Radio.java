package comp.finalproject.user.entity;

import javax.persistence.*;

@Entity
@Table(name="radio")
public class Radio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idradio;

    private String channel;
    private String durasi;
    private String kategori;
    private double budget_radio;

    public Radio() {
    }

    public Radio(long idradio, String channel, String durasi, String kategori, double budget_radio) {
        this.idradio = idradio;
        this.channel = channel;
        this.durasi = durasi;
        this.kategori = kategori;
        this.budget_radio = budget_radio;
    }

    public Radio(String channel, String durasi, String kategori, double budget_radio) {
        this.channel = channel;
        this.durasi = durasi;
        this.kategori = kategori;
        this.budget_radio = budget_radio;
    }

    public long getIdradio() {
        return idradio;
    }

    public void setIdradio(long idradio) {
        this.idradio = idradio;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getBudget_radio() {
        return budget_radio;
    }

    public void setBudget_radio(double budget_radio) {
        this.budget_radio = budget_radio;
    }
}
