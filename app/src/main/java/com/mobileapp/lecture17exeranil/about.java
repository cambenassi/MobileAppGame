package com.mobileapp.lecture17exeranil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mobileapp.lecture17exeranil.databinding.ActivityMainBinding;
import com.mobileapp.lecture17exeranil.databinding.FragmentAboutBinding;

public class about extends Fragment {
    private FragmentAboutBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        binding.main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_about2_to_startpage);
            }
        });

        return view;
    }
}