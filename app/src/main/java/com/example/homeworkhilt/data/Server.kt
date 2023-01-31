package com.example.homeworkhilt.data

import com.example.homeworkhilt.data.models.ImageResponse
import javax.inject.Inject

class Server @Inject constructor() {

    fun getImageUrl() = ImageResponse("https://dev.by/storage/images/44/14/12/03/derived/9f1b0cc0fc7967986851e3d3f38e2575.jpg")
}