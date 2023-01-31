package com.example.homeworkhilt.data

import com.example.homeworkhilt.data.mappers.ImageUiMapper
import com.example.homeworkhilt.domain.ImageRepository
import com.example.homeworkhilt.domain.ImageUiData
import javax.inject.Inject

class ImageRepositoryImpl @Inject constructor(
    private val mapper: ImageUiMapper,
    private val server: Server
) : ImageRepository{

    override fun getImageUrl(): ImageUiData = mapper(server.getImageUrl())
}