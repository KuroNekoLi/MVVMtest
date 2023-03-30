package com.example.test330.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel
{
    public MutableLiveData<String> account = new MutableLiveData<>();
    public MutableLiveData<String> pwd = new MutableLiveData<>();

}
