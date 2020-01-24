package com.example.learntocode.ui.html_heading;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HtmlHeadingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HtmlHeadingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HTML Headings");
    }

    public LiveData<String> getText() {
        return mText;
    }
}