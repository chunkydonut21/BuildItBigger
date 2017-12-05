package com.example.shivammaheshwari.joketeller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivityFragment extends android.support.v4.app.Fragment {


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progressBar);

        Button button = view.findViewById(R.id.tellJoke);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){


                JokeAsyncTask asyncTask = new JokeAsyncTask(getContext(), progressBar);
                asyncTask.execute();

            }
        });
    }
}
