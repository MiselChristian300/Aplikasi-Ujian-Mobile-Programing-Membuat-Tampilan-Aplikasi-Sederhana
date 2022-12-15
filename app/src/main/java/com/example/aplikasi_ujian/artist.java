package com.example.aplikasi_ujian;

public class artist {
    private String nama;
    private String description;
    private String linkstram;
    private String rating;
    private int jumblahlagu;

    public artist(String nama) {
        this.nama = nama;
    }

    public artist(String nama, int jumblahlagu) {
        this.nama = nama;
        this.description = description;
        this.linkstram = linkstram;
        this.rating = rating;
        this.jumblahlagu = jumblahlagu;
    }

    public String getNama() {
        return nama;
    }

    public String getDescription() {
        return description;
    }

    public String getLinkstram() {
        return linkstram;
    }

    public String getRating() {
        return rating;
    }

    public int getJumblahlagu() {
        return jumblahlagu;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLinkstram(String linkstram) {
        this.linkstram = linkstram;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setJumblahlagu(int jumblahlagu) {
        this.jumblahlagu = jumblahlagu;
    }
}
