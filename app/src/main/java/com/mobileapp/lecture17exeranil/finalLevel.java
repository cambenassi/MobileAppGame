package com.mobileapp.lecture17exeranil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.mobileapp.lecture17exeranil.databinding.FragmentAboutBinding;
import com.mobileapp.lecture17exeranil.databinding.FragmentFinalLevelBinding;

public class finalLevel extends Fragment {
    private FragmentFinalLevelBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /*
        Button a = view.findViewById(R.id.a);
        Button e = view.findViewById(R.id.e);
        Button i = view.findViewById(R.id.i);
        Button o = view.findViewById(R.id.o);
        Button n = view.findViewById(R.id.n);
        Button s = view.findViewById(R.id.s);
        Button h = view.findViewById(R.id.h);
        Button t = view.findViewById(R.id.t);
        Button u = view.findViewById(R.id.u);
        Button r = view.findViewById(R.id.r);
        Button guess = view.findViewById(R.id.guessBtn);

        TextView word1 = view.findViewById(R.id.word1);
        TextView word2 = view.findViewById(R.id.word2);
        TextView word3 = view.findViewById(R.id.word3);
        TextView word4 = view.findViewById(R.id.word4);
        TextView word5 = view.findViewById(R.id.word5);
        TextView currGuessTextView = view.findViewById(R.id.currGuess);

         */
        binding = FragmentFinalLevelBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        binding.a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'A');
            }
        });

        binding.e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'E');
            }
        });

        binding.i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'I');
            }
        });

        binding.o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'O');
            }
        });

        binding.n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'N');
            }
        });

        binding.s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'S');
            }
        });

        binding.h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'H');
            }
        });

        binding.t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'T');
            }
        });

        binding.u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'U');
            }
        });

        binding.r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'R');
            }
        });


        binding.guessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String finalGuess = binding.currGuess.getText().toString();
                if(finalGuess.equals("UNION")){
                    binding.word1.setText("UNION");
                }
                else if(finalGuess.equals("SHINE")){
                   binding.word2.setText("SHINE");
                }
                else if(finalGuess.equals("HONOR")){
                    binding.word3.setText("HONOR");
                }
                else if(finalGuess.equals("TONES")){
                    binding.word4.setText("TONES");
                }
                else if(finalGuess.equals("OATHS")){
                    binding.word5.setText("OATHS");
                }

                binding.currGuess.setText("");


                if(binding.word1.getText().toString().equals("UNION") &&
                        binding.word2.getText().toString().equals("SHINE") &&
                        binding.word3.getText().toString().equals("HONOR") &&
                        binding.word4.getText().toString().equals("TONES") &&
                        binding.word5.getText().toString().equals("OATHS")){

                    Snackbar snackbar = Snackbar.make(view, "Well done!", Snackbar.LENGTH_INDEFINITE);
                    snackbar.setAction("Continue", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavController navController = Navigation.findNavController(view);
                            navController.navigate(R.id.action_finalLevel_to_winGame);
                        }
                    });
                    snackbar.show();
                }
            }
        });



        return view;
    }
}