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


public class level1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level1, container, false);

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

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'A');
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'B');
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'C');
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'D');
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldGuess = currGuessTextView.getText().toString();
                currGuessTextView.setText(oldGuess + 'E');
            }
        });


        guess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String finalGuess = currGuessTextView.getText().toString();
                if(finalGuess.equals("ACE")){
                    word1.setText("ACE");
                }
                else if(finalGuess.equals("CAB")){
                    word2.setText("CAB");
                }
                else if(finalGuess.equals("BAD")){
                    word3.setText("BAD");
                }

                currGuessTextView.setText("");


                if(word1.getText().toString().equals("ACE") &&
                   word2.getText().toString().equals("CAB") &&
                   word3.getText().toString().equals("BAD")){

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