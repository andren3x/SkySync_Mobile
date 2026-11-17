package com.example.skyskync_mobile;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skyskync_mobile.adaptadores.VooRecyclerAdaptador;
import com.example.skyskync_mobile.databinding.ActivityPesquisaBinding;
import com.example.skyskync_mobile.modelo.SingletonGestorSkySync;
import com.example.skyskync_mobile.modelo.Voo;

import java.util.ArrayList;

public class PesquisaActivity extends AppCompatActivity {

    private ActivityPesquisaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //setContentView(R.layout.activity_pesquisa);

        // Inicialiazação do binding
        binding = ActivityPesquisaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<Voo> voos = SingletonGestorSkySync.getInstance().getVoos();

        RecyclerView rvVoos = binding.rvVoos;
        rvVoos.setLayoutManager(new LinearLayoutManager(this));
        rvVoos.setAdapter(new VooRecyclerAdaptador(voos));

        TextView tvResultados = binding.tvResultados;
        tvResultados.setText(voos.size() + " voos encontrados · preço por passageiro");
    }
}