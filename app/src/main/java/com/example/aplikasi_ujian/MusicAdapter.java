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

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.mymusicHolder> {
    Context context;
    List<Music>DataMusic;

    public MusicAdapter(Context context, List<Music> dataMusic) {
        this.context = context;
        this.DataMusic = dataMusic;
    }

    @NonNull
    @Override
    public mymusicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.music,parent,false);
        return new mymusicHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mymusicHolder holder, int position) {
    holder.musictitle.setText(DataMusic.get(position).getNama());
    holder.Imgmusic.setImageResource(DataMusic.get(position).getFotolagu());
    }

    @Override
    public int getItemCount() {
        return DataMusic.size();
    }

    public class mymusicHolder extends RecyclerView.ViewHolder{
        private TextView musictitle;
        private ImageView Imgmusic;

        public mymusicHolder(@NonNull View itemView) {
            super(itemView);
            musictitle = itemView.findViewById(R.id.nama_artis);
            Imgmusic = itemView.findViewById(R.id.Rv_Music_img);
        }
    }
}
