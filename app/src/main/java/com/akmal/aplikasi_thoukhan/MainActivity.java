package com.akmal.aplikasi_thoukhan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AdapterList adapterList;
    RecyclerView rvMain;
    Toolbar toolbar;
    ArrayList<Model_Adapter> arrayList;
    private String[] id = {"coto makassar", "sarabba", "kondro bakar","jalangkote","kapurung","mie titi","nasi kuning ribune","sop ubi","barongko","pisang pempe"};
    private String[] judul = {"mkn sulawesi", "mkn sulawesi", "mkn sulawesi","mkn sulawesi","mkn sulawesi","mkn sulawesi","mkn sulawesi","mkn sulawesi","mkn sulawesi","mkn sulawesi"};
    private String[] subJudul = {"makanan sulawesi", "makanan sulawesi", "makanan sulawesi","makanan sulawesi","makanan sulawesi","makanan sulawesi","makanan sulawesi","makanan sulawesi","makanan sulawesi","makanan sulawesi"};
    private int[] gambar = {R.drawable.coto_makassar, R.drawable.sarabba, R.drawable.kondro_bakar,R.drawable.jalangkote,R.drawable.kapurung,R.drawable.mie_titit,R.drawable.nasi_kuning_riburane,R.drawable.sop_ubi,R.drawable.barongko,R.drawable.pisang_pempe};
    private Model_Adapter Model_Adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar = findViewById(R.id.toolbar);
        arrayList = new ArrayList<>();
        rvMain = findViewById(R.id.recycler_view);
        setData();
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        adapterList = new AdapterList(arrayList);
        rvMain.setAdapter(adapterList);

    }





    private void setData() {
        int count = 0;
        for (String id:id){
            arrayList.add(new Model_Adapter(id,judul[count],subJudul[count],gambar[count]));
            count++;
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.tentang:
                startActivity(new Intent(this,AboutActivity.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return super.onCreateOptionsMenu(menu);

    }
}


