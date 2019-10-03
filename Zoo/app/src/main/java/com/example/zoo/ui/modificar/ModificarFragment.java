package com.example.zoo.ui.modificar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.zoo.R;

public class ModificarFragment extends Fragment {

    private ModificarViewModel modificarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        modificarViewModel =
                ViewModelProviders.of(this).get(ModificarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_modificar, container, false);
        final TextView textView = root.findViewById(R.id.id_modificar);
        modificarViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}