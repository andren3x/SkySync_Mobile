package com.example.skyskync_mobile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.skyskync_mobile.databinding.FragmentPesquisaVooBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PesquisaVooFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PesquisaVooFragment extends Fragment {

    private FragmentPesquisaVooBinding binding;

    public PesquisaVooFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPesquisaVooBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}