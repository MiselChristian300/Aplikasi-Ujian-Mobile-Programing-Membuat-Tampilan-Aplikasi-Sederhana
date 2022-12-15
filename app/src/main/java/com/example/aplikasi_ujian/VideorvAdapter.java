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

public class VideorvAdapter extends RecyclerView.Adapter<VideorvAdapter.myvideoHolder> {


    Context context;
    List<Video>mdataVideo;

    public VideorvAdapter(Context context, List<Video> mdataVideo) {
        this.context = context;
        this.mdataVideo = mdataVideo;
    }

    @NonNull
    @Override
    public myvideoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_layout,parent,false);
        return new myvideoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myvideoHolder holder, int position) {
        holder.videoTitle.setText(mdataVideo.get(position).getNama());
        holder.titleLagu.setText(mdataVideo.get(position).getNamalagu());
        holder.VideoimgLagu.setImageResource(mdataVideo.get(position).getVideolagu());

    }

    @Override
    public int getItemCount() {
        return mdataVideo.size();
    }

    public class myvideoHolder extends RecyclerView.ViewHolder{
        private TextView videoTitle;
        private  TextView titleLagu;
        private ImageView VideoimgLagu;
        public myvideoHolder(@NonNull View itemView) {
            super(itemView);
        videoTitle = itemView.findViewById(R.id.nama_artis1);
        titleLagu = itemView.findViewById(R.id.title_lagu);
        VideoimgLagu = itemView.findViewById(R.id.videolagu);
        }
    }
}
