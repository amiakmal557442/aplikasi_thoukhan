package com.akmal.aplikasi_thoukhan;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
;import java.util.ArrayList;

public class Model_Adapter {

    String judul;
    String subjudul;
    String idlist;
    int gambar;

    public Model_Adapter(String judul, String subjudul, String idlist, int gambar) {
        this.judul = judul;
        this.subjudul = subjudul;
        this.idlist = idlist;
        this.gambar = gambar;


    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }

    public String getIdlist() {
        return idlist;
    }

    public void setIdlist(String idlist) {
        this.idlist = idlist;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}

