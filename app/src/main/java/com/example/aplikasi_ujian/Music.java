package com.example.aplikasi_ujian;

public class Music {
    private String nama;
    private int fotolagu;

    public Music(String nama, int fotolagu) {
        this.nama = nama;
        this.fotolagu = fotolagu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getFotolagu() {
        return fotolagu;
    }

    public void setFotolagu(int fotolagu) {
        this.fotolagu = fotolagu;
    }

}
