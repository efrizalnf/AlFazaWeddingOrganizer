package com.zlz.alfazaweddingorganizer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zlz.alfazaweddingorganizer.R;


public class DescActivity extends AppCompatActivity {
    ImageView imagePhoto;
    TextView tvPengantin, tvDesc;
private static final String TAG = "DescActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getIncomingIntent();


    }

    private void getIncomingIntent() {
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")) {
            Log.d(TAG, "getIncomingIntent: Menjalankan intent");
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDesc = getIntent().getStringExtra("image_desc");
            String imageJudul = getIntent().getStringExtra("image_judul");
            String imageIsi = getIntent().getStringExtra("image_isi");
            String imageBahan = getIntent().getStringExtra("image_bahan");
            String imageUkuran = getIntent().getStringExtra("image_ukuran");
            setImage(imageUrl, imageName, imageDesc, imageJudul, imageIsi, imageBahan, imageUkuran);
        }

    }

    private void setImage(String imageUrl, String imageName, String imageDesc, String imageJudul, String imageIsi, String imageBahan, String imageUkuran) {
        Log.d(TAG, "setImage: Deklarasi id");
        TextView name = findViewById(R.id.tv_item_desc);
        name.setText(imageName);
        TextView desc = findViewById(R.id.tv_item_descmark);
        desc.setText(imageDesc);
        TextView judul = findViewById(R.id.header_judul);
        judul.setText(imageJudul);
        TextView isi = findViewById(R.id.isi);
        isi.setText(imageIsi);
        TextView bahan = findViewById(R.id.bahan);
        bahan.setText(imageBahan);
        TextView ukuran = findViewById(R.id.size);
        ukuran.setText(imageUkuran);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
