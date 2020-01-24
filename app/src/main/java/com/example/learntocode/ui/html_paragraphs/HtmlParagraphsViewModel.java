package com.example.learntocode.ui.html_paragraphs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HtmlParagraphsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HtmlParagraphsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HTML Paragraphs");
    }

    public LiveData<String> getText() {
        return mText;
    }
}