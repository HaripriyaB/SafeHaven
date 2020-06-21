package com.example.safehaven.ui.sos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.safehaven.R;

public class SosFragment extends Fragment {

    private SosViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(SosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sos, container, false);
        final ImageButton iv = root.findViewById(R.id.sos_button);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"We are informing the police..don't panic we are with you",Toast.LENGTH_LONG).show();
                iv.setClickable(false);
            }
        });
        return root;
    }
}
