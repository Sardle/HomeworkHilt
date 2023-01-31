package com.example.homeworkhilt.data.mappers

import com.example.homeworkhilt.data.models.ImageResponse
import com.example.homeworkhilt.domain.ImageUiData
import javax.inject.Inject

class ImageUiMapper @Inject constructor(){

    operator fun invoke(response: ImageResponse) : ImageUiData = with(response) {
        ImageUiData(
            imageUrl = imageUrl.orEmpty()
        )
    }
}