package com.example.aplikasi_ujian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter_favoriteArtist extends RecyclerView.Adapter<adapter_favoriteArtist.adapterfavoriteartist>{

    Context context;
    List<artist> dataartist;

    public adapter_favoriteArtist(Context context, List<artist> dataartist) {
        this.context = context;
        this.dataartist = dataartist;
    }

    @NonNull
    @Override
    public adapterfavoriteartist onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_artist,parent, false);
       return new  adapterfavoriteartist(view);

    }

    @Override
    public void onBindViewHolder(@NonNull adapterfavoriteartist holder, int position) {
        holder.Namaartis.setText(dataartist.get(position).getNama());
        holder.fotoartis.setImageResource(dataartist.get(position).getJumblahlagu());
    }

    @Override
    public int getItemCount() {
        return dataartist.size();
    }

    public class adapterfavoriteartist extends RecyclerView.ViewHolder{

        private TextView Namaartis;
        private ImageView fotoartis;
        public adapterfavoriteartist(@NonNull View itemView) {
            super(itemView);
            Namaartis = itemView.findViewById(R.id.nama_artis);
            fotoartis = itemView.findViewById(R.id.foto_artis);

        }
    }
}
