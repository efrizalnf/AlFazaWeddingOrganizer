package com.zlz.alfazaweddingorganizer.activity;


import android.util.Log;

public class Pengantin {
private static final String TAG="Pengantin";
    private String name, remarks, photo, bahan, ukuran;

    public String getName() {
        Log.d(TAG, "getName: mendapatkan nama item");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }


}
