package com.example.learntocode.ui.contact_us;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Contact_UsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Contact_UsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Drop Us a Line");
    }

    public LiveData<String> getText() {
        return mText;
    }
}