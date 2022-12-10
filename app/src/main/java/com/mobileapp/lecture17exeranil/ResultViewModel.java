package com.mobileapp.lecture17exeranil;

import androidx.lifecycle.ViewModel;
public class ResultViewModel extends ViewModel {

    final String result;

    ResultViewModel(String finalResult)
    {
        result = finalResult;
    }

}