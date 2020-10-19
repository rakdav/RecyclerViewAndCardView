package com.example.recyclerviewandcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OurAdapter extends RecyclerView.Adapter<OurAdapter.OurAdapterViewHolder> {
    private List<Person> persons;
    private Context context;

    public OurAdapter(List<Person> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }

    @NonNull
    @Override
    public OurAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        OurAdapterViewHolder ourAdapterViewHolder=new OurAdapterViewHolder(v);
        return ourAdapterViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OurAdapterViewHolder holder, int position) {
        holder.imageView.setImageResource(persons.get(position).getImage());
        holder.title.setText(persons.get(position).getTitle());
        holder.desc.setText(persons.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class OurAdapterViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        ImageView imageView;
        TextView title;
        TextView desc;
        public OurAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            cv=itemView.findViewById(R.id.cv);
            imageView=itemView.findViewById(R.id.photo);
            title=itemView.findViewById(R.id.title);
            desc=itemView.findViewById(R.id.desc);
        }
    }
}
