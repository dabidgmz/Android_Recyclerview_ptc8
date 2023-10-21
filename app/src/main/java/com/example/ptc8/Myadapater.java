package com.example.ptc8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Myadapater extends RecyclerView.Adapter<Myviewholder> {

    Context context;
    List<item> items;

    public Myadapater(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Myviewholder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        holder.name.setText(items.get(position).getNombre());
        holder.email.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
