package com.example.learntocode.ui.html_style;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HtmlStyleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HtmlStyleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HTML Style");
    }

    public LiveData<String> getText() {
        return mText;
    }
}