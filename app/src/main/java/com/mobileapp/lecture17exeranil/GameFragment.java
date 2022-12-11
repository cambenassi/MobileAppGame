package com.mobileapp.lecture17exeranil;

import android.os.Bundle;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.NavDirections;
import androidx.lifecycle.ViewModel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class GameFragment extends Fragment {
    private GameViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        viewModel = new ViewModelProvider(this).get(GameViewModel.class);

        TextView char1 = view.findViewById(R.id.char1);
        TextView char2 = view.findViewById(R.id.char2);
        TextView char3 = view.findViewById(R.id.char3);
        TextView char4 = view.findViewById(R.id.char4);
        TextView char5 = view.findViewById(R.id.char5);
        TextView char6 = view.findViewById(R.id.char6);
        TextView char7 = view.findViewById(R.id.char7);

        EditText Guess = view.findViewById(R.id.enterGuess);
        Button button = view.findViewById(R.id.button);
        TextView guessesLeft = view.findViewById(R.id.guesses);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
//                String guess = Guess.getText().toString();
//                if (guess.equals("h") || guess.equals("H"))
//                {
//                    char1.setText("H");
//                }
//                else if (guess.equals("a") || guess.equals("A"))
//                {
//                    char2.setText("A");
//                    char6.setText("A");
//                }
//                else if (guess.equals("n") || guess.equals("N"))
//                {
//                    char3.setText("N");
//                    char7.setText("N");
//                }
//                else if (guess.equals("g") || guess.equals("G"))
//                {
//                    char4.setText("G");
//                }
//                else if (guess.equals("m") || guess.equals("M"))
//                {
//                    char5.setText("M");
//                }
//
//                if (viewModel.guesses != null)
//                {
//                    int lives = viewModel.guesses.getValue().intValue();
//                    lives--;
//                    viewModel.guesses.setValue(new Integer(lives).intValue());
//                }
//
//                //viewModel.guesses -= 1;
//                //String newGuess = "You have " + String.valueOf(viewModel.guesses.getValue()) + " guesses left";
//                //guessesLeft.setText(newGuess);
//
//                if (viewModel.guesses.getValue() <= 0 )
//                {
//                    Navigation.findNavController(view).navigate(R.id.resultFragment);
//                }
//
//                if (viewModel.checkWin(view))
//                {
//                    Navigation.findNavController(view).navigate(R.id.resultFragment);
//                }

            }
        });
//        viewModel.guesses.observe(getViewLifecycleOwner(), new
//                Observer<Integer>() {
//                    @Override
//                    public void onChanged(Integer newValue) {
//                        if (viewModel.guesses != null)
//                        {
//                            String newGuess = "You have " + String.valueOf(viewModel.guesses.getValue()) + " guesses left";
//                            guessesLeft.setText(newGuess);
//                        }
//                    }
//                    });



        return view;
    }


}