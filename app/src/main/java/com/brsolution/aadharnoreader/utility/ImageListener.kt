package com.brsolution.aadharnoreader.utility

import com.google.mlkit.vision.common.InputImage

interface ImageListener {
    fun processedImage(image:InputImage)
}