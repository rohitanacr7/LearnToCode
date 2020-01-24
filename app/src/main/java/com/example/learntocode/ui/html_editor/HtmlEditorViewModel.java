package com.example.learntocode.ui.html_editor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HtmlEditorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HtmlEditorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HTML Editor");
    }

    public LiveData<String> getText() {
        return mText;
    }
}