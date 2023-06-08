package com.priska.kelayakan_usaha.ui.company;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CompanyViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CompanyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Company fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}