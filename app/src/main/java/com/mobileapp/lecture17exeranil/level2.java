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

public class level2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level2, container, false);

        Button a = view.findViewById(R.id.a);
        Button e = view.findViewById(R.id.e);
        Button m = view.findViewById(R.id.o);
        Button t = view.findViewById(R.id.n);
        Button s = view.findViewById(R.id.s);
        Button l = view.findViewById(R.id.i);
        Button guess = view.findViewById(R.id.guessBtn);

        TextView word1 = view.findViewById(R.id.word1);
        TextView word2 = view.findViewById(R.id.word2);
        TextView word3 = view.findViewById(R.id.word3);
        TextView word4 = view.findViewById(R.id.word4);
        TextView currGuessTextView = view.findViewById(R.id.currGuess);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'A');
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'E');
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'M');
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'S');
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'T');
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'L');
            }
        });


        guess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String finalGuess = currGuessTextView.getText().toString();
                if(finalGuess.equals("MEAL")){
                    word1.setText("MEAL");
                }
                else if(finalGuess.equals("TEAM")){
                    word2.setText("TEAM");
                }
                else if(finalGuess.equals("SALE")){
                    word3.setText("SALE");
                }
                else if(finalGuess.equals("LATE")){
                    word4.setText("LATE");
                }

                currGuessTextView.setText("");


                if(word1.getText().toString().equals("MEAL") &&
                        word2.getText().toString().equals("TEAM") &&
                        word3.getText().toString().equals("SALE") &&
                        word4.getText().toString().equals("LATE")){

                    Snackbar snackbar = Snackbar.make(view, "Well done, level complete!", Snackbar.LENGTH_INDEFINITE);
                    snackbar.setAction("Next Level", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavController navController = Navigation.findNavController(view);
                            navController.navigate(R.id.action_level2_to_finalLevel);
                        }
                    });
                    snackbar.show();
                }
            }
        });



        return view;
    }
}