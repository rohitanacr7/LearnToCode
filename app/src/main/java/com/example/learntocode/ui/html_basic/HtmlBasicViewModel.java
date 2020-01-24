package com.example.learntocode.ui.html_basic;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HtmlBasicViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HtmlBasicViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HTML Basic");
    }

    public LiveData<String> getText() {
        return mText;
    }
}