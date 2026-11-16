package com.example.skyskync_mobile.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skyskync_mobile.DetalheVooActivity;
import com.example.skyskync_mobile.R;
import com.example.skyskync_mobile.modelo.Voo;

import java.util.ArrayList;
import java.util.Locale;

public class VooRecyclerAdaptador extends RecyclerView.Adapter<VooRecyclerAdaptador.ViewHolder> {

    // Guardar a lista de voos
    private ArrayList<Voo> voos;

    public VooRecyclerAdaptador(ArrayList<Voo> voos) {
        this.voos = voos;
    }

    // Cria um cartão a partir do item_voo.xml
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_voo, parent, false);
        return new ViewHolder(view);
    }

    // Preenche o cartão com os dados do voo
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Voo voo = voos.get(position);
        holder.tvNumero.setText(voo.getNumero());
        holder.tvEstado.setText(voo.getEstado());
        holder.tvPartida.setText(voo.getHoraPartida().substring(11, 16));   // "08:00"
        holder.tvChegada.setText(voo.getHoraChegada().substring(11, 16));   // "09:00"
        holder.tvRota.setText(voo.getOrigem() + " → " + voo.getDestino());
        holder.tvPreco.setText(String.format(new Locale("pt", "PT"), "%.2f €", voo.getPrecoBase()));

        // Clicar no cartão abre o detalhe
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), DetalheVooActivity.class);
            intent.putExtra("id", voo.getId());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return voos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNumero, tvEstado, tvPartida, tvChegada, tvRota, tvPreco;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNumero = itemView.findViewById(R.id.tvNumero);
            tvEstado = itemView.findViewById(R.id.tvEstado);
            tvPartida = itemView.findViewById(R.id.tvPartida);
            tvChegada = itemView.findViewById(R.id.tvChegada);
            tvRota = itemView.findViewById(R.id.tvRota);
            tvPreco = itemView.findViewById(R.id.tvPreco);
        }
    }
}