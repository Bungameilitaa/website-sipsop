package comp.finalproject.user.entity;

import javax.persistence.*;

@Entity
@Table(name="tv")
public class Tv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idtv;

    private String stasiun_tv;
    private String durasi;
    private String kategori;
    private double budget_tv;

    public Tv() {
    }

    public Tv(long idtv, String stasiun_tv, String durasi, String kategori, double budget_tv) {
        this.idtv = idtv;
        this.stasiun_tv = stasiun_tv;
        this.durasi = durasi;
        this.kategori = kategori;
        this.budget_tv = budget_tv;
    }

    public Tv(String stasiun_tv, String durasi, String kategori, double budget_tv) {
        this.stasiun_tv = stasiun_tv;
        this.durasi = durasi;
        this.kategori = kategori;
        this.budget_tv = budget_tv;
    }

    public long getIdtv() {
        return idtv;
    }

    public void setIdtv(long idtv) {
        this.idtv = idtv;
    }

    public String getStasiun_tv() {
        return stasiun_tv;
    }

    public void setStasiun_tv(String stasiun_tv) {
        this.stasiun_tv = stasiun_tv;
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

    public double getBudget_tv() {
        return budget_tv;
    }

    public void setBudget_tv(double budget_tv) {
        this.budget_tv = budget_tv;
    }
}
