package com.sigmotoa.triquig9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn00 = findViewById(R.id.ib_00);
        ImageView imgJugador1 = findViewById(R.id.img_jugador1);
        ImageView imgJugador2 = findViewById(R.id.img_jugador2);

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn00.setImageDrawable(getDrawable(R.drawable.outline_circle_24));
            }
        });
        btn00.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn00.setImageDrawable(getDrawable(R.drawable.twotone_add_24));
                return true;
            }
        });

        Glide.with(this)
                .load("https://fcb-abj-pre.s3.amazonaws.com/img/jugadors/MESSI.jpg")
                .placeholder(R.drawable.twotone_person_4_24)
                .error(R.drawable.parky_001)
                .circleCrop()
                .into(imgJugador1);

 Glide.with(this)
                .load("https://www.wallpaperuse.com/wallp/75-754367_m.jpg")
                .placeholder(R.drawable.twotone_person_4_24)
                .error(R.drawable.parky_001)
                .circleCrop()
                .into(imgJugador2);




    }
}