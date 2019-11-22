package br.com.street.jorge.contafacil01.ui.categorias;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.street.jorge.contafacil01.R;
import br.com.street.jorge.contafacil01.ui.dashboard.DashboardViewModel;

public class Categorias extends Fragment {

    private CategoriasViewModel categoriasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoriasViewModel =
                ViewModelProviders.of(this).get(CategoriasViewModel.class);
        View root = inflater.inflate(R.layout.categorias_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_categorias);
        categoriasViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
