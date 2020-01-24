package com.example.learntocode.ui.html_formating;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HtmlFormatingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HtmlFormatingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HTML Formating");
    }

    public LiveData<String> getText() {
        return mText;
    }
}