package com.example.humano_recycler.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.humano_recycler.models.Humanos;
import com.example.humano_recycler.R;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HumanosAdapter extends RecyclerView.Adapter<HumanosAdapter.ViewHolder> {

    private List<Humanos> humanos;

    public HumanosAdapter(List<Humanos> humanos) {
        this.humanos = humanos;
    }

    @NonNull
    @Override
    public HumanosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater lf=LayoutInflater.from(parent.getContext());
        View listItem=lf.inflate(R.layout.humanos_item,parent,false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull HumanosAdapter.ViewHolder holder, int position) {
        Humanos g=humanos.get(position);
        holder.setData(g);
    }

    @Override
    public int getItemCount() {
        return humanos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNom,txtEstilo,txtNacion;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNom = itemView.findViewById(R.id.tvNombre);
            txtEstilo = itemView.findViewById(R.id.tvEstilo);
            txtNacion = itemView.findViewById(R.id.tvNacion);

        }

        public void setData(Humanos g) {
            txtNom.setText(g.getNombre());
            txtEstilo.setText(g.getEstilo());
            txtNacion.setText(g.getNacionalidad());
        }
    }
}
