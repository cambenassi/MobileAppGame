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
import com.mobileapp.lecture17exeranil.databinding.FragmentLevel1Binding;


public class  level1 extends Fragment {
    private FragmentLevel1Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /*
        Button a = view.findViewById(R.id.a);
        Button b = view.findViewById(R.id.e);
        Button c = view.findViewById(R.id.i);
        Button d = view.findViewById(R.id.o);
        Button e = view.findViewById(R.id.n);
        Button guess = view.findViewById(R.id.guessBtn);

        TextView word1 = view.findViewById(R.id.word1);
        TextView word2 = view.findViewById(R.id.word2);
        TextView word3 = view.findViewById(R.id.word3);
        TextView currGuessTextView = view.findViewById(R.id.currGuess);
        */
        binding = FragmentLevel1Binding.inflate(getLayoutInflater());
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
                String oldGuess =  binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'B');
            }
        });

        binding.i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess =  binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'C');
            }
        });

        binding.o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'D');
            }
        });

        binding.n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess =  binding.currGuess.getText().toString();
                binding.currGuess.setText(oldGuess + 'E');
            }
        });


        binding.guessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String finalGuess =  binding.currGuess.getText().toString();
                if(finalGuess.equals("ACE")){
                    binding.word1.setText("ACE");
                }
                else if(finalGuess.equals("CAB")){
                    binding.word2.setText("CAB");
                }
                else if(finalGuess.equals("BAD")){
                    binding.word3.setText("BAD");
                }

                binding.currGuess.setText("");


                if( binding.word1.getText().toString().equals("ACE") &&
                        binding.word2.getText().toString().equals("CAB") &&
                        binding.word3.getText().toString().equals("BAD")){

//                    Snackbar.make(view, congrats, Snackbar.LENGTH_LONG)
//                        .setAction(next) {
//                        // Responds to click on the action
//                    }
//                    .show()

                    Snackbar snackbar = Snackbar.make(view, "Well done, level complete!", Snackbar.LENGTH_INDEFINITE);
                    snackbar.setAction("Next Level", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavController navController = Navigation.findNavController(view);
                            navController.navigate(R.id.action_level12_to_level2);
                        }
                    });
                    snackbar.show();
                }
            }
        });





        return view;
    }
}