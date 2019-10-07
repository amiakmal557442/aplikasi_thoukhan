package com.akmal.aplikasi_thoukhan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    public static final String KEY_MKN = "KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String iddetail = getIntent().getStringExtra(KEY_MKN);
        Toast.makeText(this,iddetail, Toast.LENGTH_SHORT).show();

    }
}
