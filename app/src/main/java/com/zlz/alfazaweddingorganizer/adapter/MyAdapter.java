package com.zlz.alfazaweddingorganizer.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.zlz.alfazaweddingorganizer.R;
import com.zlz.alfazaweddingorganizer.activity.DescActivity;
import com.zlz.alfazaweddingorganizer.activity.Pengantin;
import com.zlz.alfazaweddingorganizer.listener.CustomOnItemClickListener;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<Pengantin> listPengantin;
    private static final String TAG="MyAdapter";
    private ArrayList<Pengantin> getListPengantin() {
        return listPengantin;
    }
    public void setListPengantin(Context context, ArrayList<Pengantin> listPengantin) {
        this.listPengantin = listPengantin;

    }
    public MyAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.d(TAG, "onCreateViewHolder: menampilkan recycleview");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pengantin, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder Holder, int i) {
        Log.d(TAG, "onBindViewHolder: catch data list");
        final Pengantin p = getListPengantin().get(i);
        Glide.with(context)
                .load(p.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(Holder.imgPhoto);
        Holder.tvName.setText(p.getName());
        Holder.tvRemarks.setText(p.getRemarks());
        Holder.imgPhoto.setClickable(true);
        Holder.imgPhoto.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
//                Toast.makeText(context, "Foto "+getListPengantin().get(position).getName(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context, DescActivity.class);
                i.putExtra("image_url", p.getPhoto());
                i.putExtra("image_name", p.getName());
                i.putExtra("image_desc", p.getRemarks());
                i.putExtra("image_judul", p.getName());
                i.putExtra("image_isi", p.getRemarks());
                i.putExtra("image_bahan", p.getBahan());
                i.putExtra("image_ukuran", p.getUkuran());
                context.startActivity(i);
            }
        }));


        Holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Log.d(TAG, "onItemClicked: Tombol Favorit di tap");
                Toast.makeText(context, "Favorite "+getListPengantin().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        Holder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Log.d(TAG, "onItemClicked: Tombol Share di tap");
                Toast.makeText(context, "Share "+getListPengantin().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));



    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: mendapatkan list data");
        return getListPengantin().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;
        CardViewViewHolder(View itemView) {

            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
