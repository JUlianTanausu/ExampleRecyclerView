package com.example.juliantanausuvillar.examplerecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<Integer> nImages = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context context,ArrayList<Integer> images){
        nImages = images;
        mContext = context;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {



        viewHolder.image.setImageResource(nImages.get(i));
    }

    @Override
    public int getItemCount() {
        return nImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;


        public ViewHolder(View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.image);
        }
    }
}
