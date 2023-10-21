package com.example.ptc8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myviewholder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView name,email;
    public Myviewholder(@NonNull View itemView) {
        super(itemView);
        imageView =itemView.findViewById(R.id.imageview);
        name=itemView.findViewById(R.id.name);
        email=itemView.findViewById(R.id.email);
    }
}
