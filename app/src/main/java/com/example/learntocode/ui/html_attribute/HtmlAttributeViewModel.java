package com.example.learntocode.ui.html_attribute;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HtmlAttributeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HtmlAttributeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HTML Attribute");
    }

    public LiveData<String> getText() {
        return mText;
    }
}