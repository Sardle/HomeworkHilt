package com.example.homeworkhilt.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.homeworkhilt.domain.ImageRepository
import com.example.homeworkhilt.domain.ImageUiData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImageViewModel @Inject constructor(
    private val repository: ImageRepository
) : ViewModel() {

    private val _liveData = MutableLiveData<ImageUiData>()
    val livaData: LiveData<ImageUiData> get() = _liveData

    fun getImageUrl() {
        _liveData.value = repository.getImageUrl()
    }
}