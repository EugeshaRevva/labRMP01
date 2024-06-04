package com.example.lab1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment extends Fragment {

    private TextView textView;
    private Button changeTextButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        textView = view.findViewById(R.id.textView);
        changeTextButton = view.findViewById(R.id.button);

        changeTextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText(getString(R.string.Text2));
                Toast.makeText(getActivity(), getString(R.string.Text2), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}