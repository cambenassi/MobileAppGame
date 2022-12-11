package com.mobileapp.lecture17exeranil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ResultFragment extends Fragment {

    private ResultViewModel viewModel;
    //private ResultViewModelFactory viewModelFactory;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //viewModelFactory = new ResultViewModelFactory();
        //viewModel = new ViewModelProvider(this,).get(ResultViewModel.class);
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_result, container, false);

        Button replay = view.findViewById(R.id.button2);

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_resultFragment_to_gameFragment);
            }
        });

        return view;
    }
}