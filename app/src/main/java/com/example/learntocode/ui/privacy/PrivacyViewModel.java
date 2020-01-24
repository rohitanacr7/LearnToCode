package com.example.learntocode.ui.privacy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrivacyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PrivacyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Privacy Policy");
    }

    public LiveData<String> getText() {
        return mText;
    }
}