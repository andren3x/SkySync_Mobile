package com.example.skyskync_mobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.skyskync_mobile.adaptadores.ListaVoosRecyclerAdaptador;
import com.example.skyskync_mobile.databinding.ActivityPesquisaBinding;
import com.example.skyskync_mobile.modelo.SingletonGestorSkySync;
import com.example.skyskync_mobile.modelo.Voo;

import java.util.ArrayList;

public class PesquisaActivity extends AppCompatActivity {

    private ActivityPesquisaBinding binding;
    private ArrayList<Voo> voos;

    private ListaVoosRecyclerAdaptador adaptador;
    private ListaVoosRecyclerAdaptador.OnVooClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityPesquisaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        configurarRecyclerView();
    }

    private void configurarRecyclerView() {
        // obter voos
        voos = SingletonGestorSkySync.getInstance().getVoos();

        // ação do clique: abrir o detalhe do voo e enviar o ID
        listener = new ListaVoosRecyclerAdaptador.OnVooClickListener() {
            @Override
            public void onVooClick(Voo voo) {
                // dentro de uma classe anónima o "this" não é a Activity,
                // por isso usa-se PesquisaActivity.this
                Intent intent = new Intent(PesquisaActivity.this, DetalheVooActivity.class);
                intent.putExtra("IDVOO", voo.getId());
                startActivity(intent);
            }
        };

        // inicializar o adaptador com a lista e o listener
        adaptador = new ListaVoosRecyclerAdaptador(voos, listener);
        // lista (se fosse grelha usava-se GridLayoutManager)
        binding.rvVoos.setLayoutManager(new LinearLayoutManager(this));
        // associar o adaptador à RecyclerView
        binding.rvVoos.setAdapter(adaptador);

        binding.tvResultados.setText(voos.size() + " voos encontrados · preço por passageiro");
    }
}