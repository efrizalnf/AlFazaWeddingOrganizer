package com.zlz.alfazaweddingorganizer;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.zlz.alfazaweddingorganizer.activity.DescActivity;
import com.zlz.alfazaweddingorganizer.activity.Pengantin;
import com.zlz.alfazaweddingorganizer.activity.PengantinData;
import com.zlz.alfazaweddingorganizer.adapter.MyAdapter;
import com.zlz.alfazaweddingorganizer.listener.ItemClickSupport;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    private RecyclerView rvCategory;
    private ArrayList<Pengantin> list = new ArrayList<>();
    int mode;
    private String title = "Mode List";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(PengantinData.getListData());
        showRecyclerCardView();
        Log.d(TAG, "onCreate: Layout");
    }
    private void showRecyclerCardView() {
        Log.d(TAG, "showRecyclerCardView: menampilkan CardView");
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter cardViewPengantinAdapter = new MyAdapter(this);
        cardViewPengantinAdapter.setListPengantin(MainActivity.this, list);
        rvCategory.setAdapter(cardViewPengantinAdapter);

//        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
//            @Override
//            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
//                showSelectedPengantin(list.get(position));
//            }
//        });
    }
//    private void showSelectedPengantin(Pengantin pengantin){
//        Intent moveIntent = new Intent(MainActivity.this, DescActivity.class);
//        startActivity(moveIntent);
//    }
}
