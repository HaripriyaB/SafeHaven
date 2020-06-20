package com.example.safehaven.ui.sos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Sos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}