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

public class finalLevel extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_final_level, container, false);

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

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'I');
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'O');
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'N');
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'S');
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'H');
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'T');
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'U');
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'R');
            }
        });


        guess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String finalGuess = currGuessTextView.getText().toString();
                if(finalGuess.equals("UNION")){
                    word1.setText("UNION");
                }
                else if(finalGuess.equals("SHINE")){
                    word2.setText("SHINE");
                }
                else if(finalGuess.equals("HONOR")){
                    word3.setText("HONOR");
                }
                else if(finalGuess.equals("TONES")){
                    word4.setText("TONES");
                }
                else if(finalGuess.equals("OATHS")){
                    word5.setText("OATHS");
                }

                currGuessTextView.setText("");


                if(word1.getText().toString().equals("UNION") &&
                        word2.getText().toString().equals("SHINE") &&
                        word3.getText().toString().equals("HONOR") &&
                        word4.getText().toString().equals("TONES") &&
                        word5.getText().toString().equals("OATHS")){

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