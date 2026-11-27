package com.example.skyskync_mobile.adaptadores;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skyskync_mobile.databinding.ItemVooBinding;
import com.example.skyskync_mobile.modelo.Voo;

import java.util.ArrayList;
import java.util.Locale;

public class ListaVoosRecyclerAdaptador extends RecyclerView.Adapter<ListaVoosRecyclerAdaptador.ItemViewHolder> {

    private ArrayList<Voo> voos;

    // 1º - Interface: quem quiser saber do clique num voo implem   enta este método.
    // O adaptador só avisa; quem decide a ação é a Activity.
    public interface OnVooClickListener {
        void onVooClick(Voo v);
    }

    // 2º - Guarda o objeto que quer ser avisado do clique
    private OnVooClickListener listener;

    // 3º - Construtor recebe a lista de voos + o listener
    public ListaVoosRecyclerAdaptador(ArrayList<Voo> voos, OnVooClickListener listener) {
        this.voos = voos;
        this.listener = listener;
    }

    // Cria visualmente um novo cartão (item_voo.xml → ItemVooBinding)
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemVooBinding binding = ItemVooBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false);
        return new ItemViewHolder(binding);
    }

    // Carrega os dados do voo da posição indicada
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Voo voo = voos.get(position);
        holder.bind(voo, listener);
    }

    // Nº de voos da lista
    @Override
    public int getItemCount() {
        return voos.size();
    }

    // ViewHolder: representa e reutiliza um cartão
    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        private final ItemVooBinding binding;

        public ItemViewHolder(ItemVooBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        // Coloca os dados do voo no item_voo.xml
        public void bind(Voo voo, OnVooClickListener listener) {
            binding.tvNumero.setText(voo.getNumero());
            binding.tvEstado.setText(voo.getEstado());
            binding.tvPartida.setText(voo.getHora_partida().substring(11, 16));   // "08:00"
            binding.tvChegada.setText(voo.getHora_chegada().substring(11, 16));   // "09:00"
            binding.tvRota.setText(voo.getOrigem() + " → " + voo.getDestino());
            binding.tvPreco.setText(String.format(new Locale("pt", "PT"), "%.2f €", voo.getPreco_base()));

            // 4º - Clique: avisa quem estiver a ouvir
            binding.getRoot().setOnClickListener(v -> listener.onVooClick(voo));
        }
    }
}