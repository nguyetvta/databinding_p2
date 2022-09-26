package com.example.databindingdemo

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class PersonObservableExtend(@Bindable var name: String, @Bindable var age: Int): BaseObservable()