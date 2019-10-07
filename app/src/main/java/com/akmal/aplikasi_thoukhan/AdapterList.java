package com.akmal.aplikasi_thoukhan;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterList extends RecyclerView.Adapter<AdapterList.DzikirHolder> {



    private ArrayList<Model_Adapter>listdata;

    public AdapterList(ArrayList<Model_Adapter>listdata){
        this.listdata = listdata;

    }

    @NonNull
    @Override
    public DzikirHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_model__adapter,viewGroup,false);
        return new DzikirHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DzikirHolder dzikirHolder, int i) {

        dzikirHolder.bindview(listdata.get(i));

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }


    public class DzikirHolder extends RecyclerView.ViewHolder {
        private TextView judul;
        private TextView tvsubjudul;
        private ImageView ivcover;
        private String idjudul;

        public DzikirHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.tvJudul);
            tvsubjudul = itemView.findViewById(R.id.tvSubJudul);
            ivcover = itemView.findViewById(R.id.ivRaw);
        }
        private void bindview(Model_Adapter data) {
            judul.setText(data.getJudul());
            tvsubjudul.setText(data.getSubjudul());
            idjudul = data.getIdlist();
            ivcover.setImageResource(data.getGambar());
        }
    }
}


