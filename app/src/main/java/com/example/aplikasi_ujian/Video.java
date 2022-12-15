package com.example.aplikasi_ujian;

public class Video {
    private String nama;
    private String namalagu;
    private String rating;
    private  int videolagu;

    public Video(String nama, String namalagu, int videolagu) {
        this.nama = nama;
        this.namalagu = namalagu;
        this.videolagu = videolagu;
    }

    public Video(String nama, String namalagu, String rating, int videolagu) {
        this.nama = nama;
        this.namalagu = namalagu;
        this.rating = rating;
        this.videolagu = videolagu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamalagu() {
        return namalagu;
    }

    public void setNamalagu(String namalagu) {
        this.namalagu = namalagu;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getVideolagu() {
        return videolagu;
    }

    public void setVideolagu(int videolagu) {
        this.videolagu = videolagu;
    }
}
