package com.mobileapp.lecture17exeranil;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
/*
public class ResultViewModelFactory {
    public class ResultViewModelFactory implements
            ViewModelProvider.Factory {

        private ResultViewModel viewModel;
        private ResultViewModelFactory viewModelFactory;


        private final String finalResult;//final means that the value of

        //the variable can't be changed after it has been set
        public ResultViewModelFactory(String finalResult) {
            this.finalResult = finalResult;
        }

        @Override
        public <T extends ViewModel> T create(@NonNull Class<T>
                                                      modelClass) {
            if (modelClass == ResultViewModel.class) {
                return (T) new ResultViewModel(finalResult);
            }
            return null;
        }
    }
}
*/