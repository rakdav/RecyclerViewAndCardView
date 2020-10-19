package com.example.recyclerviewandcardview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OurAdapter extends RecyclerView.Adapter<OurAdapter.OurAdapterViewHolder> {

    @NonNull
    @Override
    public OurAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull OurAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class OurAdapterViewHolder extends RecyclerView.ViewHolder{

        public OurAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
