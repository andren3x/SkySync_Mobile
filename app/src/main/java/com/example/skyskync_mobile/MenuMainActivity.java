package com.example.skyskync_mobile;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.skyskync_mobile.databinding.ActivityMenuMainBinding;
import com.example.skyskync_mobile.databinding.NavHeaderMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MenuMainActivity extends AppCompatActivity {

    private ActivityMenuMainBinding binding;
    public final static String EMAIL = "EMAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMenuMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ViewCompat.setOnApplyWindowInsetsListener(binding.drawerLayout, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        carregarToolbar();
        carregarCabecalho();

        binding.navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                return selecionarItemMenu(menuItem);
            }
        });
    }

    private boolean selecionarItemMenu (MenuItem menuItem)
    {
        int id = menuItem.getItemId();

        menuItem.setChecked(true); // fica marcado
        binding.drawerLayout.closeDrawer(GravityCompat.START); // fecha a gaveta
        return true;
    }

    private void carregarToolbar() {
        setSupportActionBar(binding.toolbar);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,
                binding.drawerLayout, binding.toolbar, R.string.menu_abrir,
                R.string.menu_fechar);
        binding.drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        drawerToggle.getDrawerArrowDrawable().setColor(ContextCompat.getColor(this
                , android.R.color.white));
    }

    private void carregarCabecalho() {
        // email recebido no intent proveniente da LoginActivity
        String email = getIntent().getStringExtra("EMAIL");
        View headerView;
        if (email != null) {
            if (binding.navigationView.getHeaderCount() > 0) {
                // tenho de aceder ao navigationView para depois de obter o header
                headerView = binding.navigationView.getHeaderView(0);
                // a classe binding gerada para o layout nav_header_main => navHeaderMainBinding
                NavHeaderMainBinding headerBinding = NavHeaderMainBinding.bind(headerView);
                // a partir do headerBinding consigo aceder aos componentes que tenho nesse layout
                headerBinding.tvEmail.setText(email);
            }
        }
    }

}