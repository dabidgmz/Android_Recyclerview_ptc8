package com.example.ptc8.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ptc8.R;
import com.example.ptc8.model.Carro;

import java.util.List;

public class CarroAdapter extends RecyclerView.Adapter<CarroAdapter.ViewHolder>{

    List<Carro> Lista_carros;

    public CarroAdapter(List<Carro> lista_carros) {
        Lista_carros = lista_carros;
    }

    @NonNull
    @Override
    public CarroAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater ly= LayoutInflater.from(parent.getContext());
        View v= ly.inflate(0, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdapter.ViewHolder holder, int position) {
        Carro c= Lista_carros.get(position);
        holder.setData(c);
    }

    @Override
    public int getItemCount() {
        return Lista_carros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtMarca;
        TextView txtModelo;
        Carro cp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMarca= itemView.findViewById(R.id.txtMarca);
            txtModelo= itemView.findViewById(R.id.txtModelo);
        }

        public  void setData(Carro c){
            cp = c;
            txtMarca.setText(cp.getMarca());
            txtModelo.setText(cp.getModelo());
        }
    }
}
