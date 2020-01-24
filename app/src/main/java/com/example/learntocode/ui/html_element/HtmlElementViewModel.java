package com.example.learntocode.ui.html_element;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HtmlElementViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HtmlElementViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HTML Elements");
    }

    public LiveData<String> getText() {
        return mText;
    }
}