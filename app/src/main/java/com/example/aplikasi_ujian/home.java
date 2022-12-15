package com.example.aplikasi_ujian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class home extends AppCompatActivity {
    private List<slides>slidescontent;
    private ViewPager viewPager;
    private RecyclerView artistRV;
    // Set indicator SLide
    private TabLayout indicators;
    // set artist rycler
    private RecyclerView musicArtistRV;
    // set video rycler
    private RecyclerView videoRv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewPager = findViewById(R.id.slider_img);
        // indicator
        indicators = findViewById(R.id.status_indicator);
        // Set artist Recler View
        artistRV = findViewById(R.id.rv_artist);
        // Set artist Recler View
        musicArtistRV = findViewById(R.id.rv_Music);
        // set video rycler
        videoRv = findViewById(R.id.rv_video);
    slidescontent = new ArrayList<>();
    slidescontent.add(new slides(R.drawable.gambar1,"Secret Number \nBest Kpop On This Mounth"));
    slidescontent.add(new slides(R.drawable.alan_walker,"Alan walker \nBest EDM On this Mounth"));
    slidescontent.add(new slides(R.drawable.charliejungkok,"Charlie Puth & Jungkook\nMost Popular Listen On This Mounth"));
    slidescontent.add(new slides(R.drawable.christmas_song,"Michael Buble\nBest Christmas Song Listen Now"));
    Adapter_slide adapter= new Adapter_slide(this,slidescontent);
    viewPager.setAdapter(adapter);
        // indicator
        indicators.setupWithViewPager(viewPager,true);
        // set timer
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new home.timer(), 3000,6000);

        //reycler view artist
    List<artist> lartis = new ArrayList<>();
    lartis.add(new artist("Jakson Wang",R.drawable.jaksonwang));
    lartis.add(new artist("Yasobi",R.drawable.yasobi));
    lartis.add(new artist("Martin Garix",R.drawable.martingarix));
    lartis.add(new artist("BTS",R.drawable.bts));
    lartis.add(new artist("Logic",R.drawable.logic2));
    lartis.add(new artist("Lisa Black Pink",R.drawable.lisablackpink));
    adapter_favoriteArtist adapter_favoriteArtist = new adapter_favoriteArtist(this,lartis);
    artistRV.setAdapter(adapter_favoriteArtist);
    artistRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    // Reycler view Music
        List<Music> lmusic = new ArrayList<>();
        lmusic.add((new Music("One Kiss\n(Dua Lipa & Calvin Haris)",R.drawable.onekiss)));
        lmusic.add((new Music("I Don`t Care\n(Justin Biber & Ed sheerean)",R.drawable.idontcares2)));
        lmusic.add((new Music("24K Magic\n(Bruno Mars)",R.drawable.bruno_mars)));
        lmusic.add((new Music("Dont Let Me Down\n(The Chainsmokers & Daya)",R.drawable.dontletmedown)));
        lmusic.add((new Music("Swalla\n(Jason Derulo, Nicki Minaj,& Tydolla)",R.drawable.swalla)));
        lmusic.add((new Music("What do You Mean\n(Justin Biber)",R.drawable.justin_biber)));
    MusicAdapter musicAdapter = new MusicAdapter(this,lmusic);
    videoRv.setAdapter(musicAdapter);
    videoRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        // Reycler View Video
        List<Video> lvideo= new ArrayList<>();
        lvideo.add((new Video("   123(Jason Derulo & De La Ghetto)","Sofia Rayes.",R.drawable.jason_sofiarayes)));
        lvideo.add((new Video("New Rules","Dua Lipa.",R.drawable.dualipavideo)));
        lvideo.add((new Video("Dynamite","BTS.",R.drawable.dynamite)));
        lvideo.add((new Video(" Mv Debut Secret Number","Secret Number.",R.drawable.secretnumberdebut)));
        VideorvAdapter videorvAdapter = new VideorvAdapter(this,lvideo);
        musicArtistRV.setAdapter(videorvAdapter);
        musicArtistRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }

    // set timer untuk konten slide
    class timer extends TimerTask{
        @Override
        public void run() {
            home.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem()<slidescontent.size()-1) {
                        viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                    }
                    else
                        viewPager.setCurrentItem(0);
                }
            });
        }
    }
}