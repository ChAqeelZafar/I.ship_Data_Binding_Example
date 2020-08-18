package com.example.iship2.viewmodels

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.iship2.repositories.FakeRepository


class MainViewModel : ViewModel() {

    val currentRandomFruitName : LiveData<String>
    get() = FakeRepository.currentRandomFruitName
    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()


    val editTextContent = MutableLiveData<String>()

    private val _displayedEditTextContent = MutableLiveData<String>()
    val displyedEditTextContent : LiveData<String>
    get() = _displayedEditTextContent

    fun onDisplayEditTextContentClick(){
        _displayedEditTextContent.value = editTextContent.value
    }


    fun onSelectRandomEditTextFruit(){
        editTextContent.value = FakeRepository.getRandomFruitName()
    }
}