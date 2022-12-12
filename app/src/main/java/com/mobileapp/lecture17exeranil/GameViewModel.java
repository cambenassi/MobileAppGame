package com.mobileapp.lecture17exeranil;

import android.view.View;
import android.widget.TextView;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mobileapp.lecture17exeranil.databinding.FragmentGameBinding;

public class GameViewModel extends ViewModel {
    private FragmentGameBinding binding;
    //public int guesses = 7;

    MutableLiveData<Integer> guesses = new
            MutableLiveData<Integer>(7);

    boolean checkWin(View view)
    {
        /*
        TextView char1 = view.findViewById(R.id.char1);
        TextView char2 = view.findViewById(R.id.char2);
        TextView char3 = view.findViewById(R.id.char3);
        TextView char4 = view.findViewById(R.id.char4);
        TextView char5 = view.findViewById(R.id.char5);
        TextView char6 = view.findViewById(R.id.char6);
        TextView char7 = view.findViewById(R.id.char7);
           */
        if (binding.char1.getText().equals("H"))
        {
            if (binding.char2.getText().equals("A"))
            {
                if (binding.char3.getText().equals("N"))
                {
                    if (binding.char4.getText().equals("G"))
                    {
                        if (binding.char5.getText().equals("M"))
                        {
                            if (binding.char6.getText().equals("A"))
                            {
                                if (binding.char7.getText().equals("N"))
                                {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }


}
